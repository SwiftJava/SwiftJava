//
//  Fortify.swift
//  Fortify
//
//  Created by John Holdsworth on 19/09/2017.
//  Copyright © 2017 John Holdsworth. All rights reserved.
//
//  Currently requires patched Swift toolchain from here:
//  http://johnholdsworth.com/swift-LOCAL-2017-09-20-a-osx.tar.gz
//

import Foundation

open class ThreadLocal {
    public required init() {
    }

    public class func getThreadLocal<T: ThreadLocal>(ofClass: T.Type,
                         keyVar: UnsafeMutablePointer<pthread_key_t>) -> T {
        let needsKey = keyVar.pointee == 0
        if needsKey {
            let ret = pthread_key_create(keyVar, {
                #if os(Linux)
                Unmanaged<ThreadLocal>.fromOpaque($0!).release()
                #else
                Unmanaged<ThreadLocal>.fromOpaque($0).release()
                #endif
            })
            if ret != 0 {
                NSLog("Could not pthread_key_create: %s", strerror(ret))
            }
        }
        if let existing = pthread_getspecific(keyVar.pointee) {
            return Unmanaged<T>.fromOpaque(existing).takeUnretainedValue()
        }
        else {
            let unmanaged = Unmanaged.passRetained(T())
            let ret = pthread_setspecific(keyVar.pointee, unmanaged.toOpaque())
            if ret != 0 {
                NSLog("Could not pthread_setspecific: %s", strerror(ret))
            }
            return unmanaged.takeUnretainedValue()
        }
    }
}

@_silgen_name ("setjmp")
public func setjump(_: UnsafeMutablePointer<jmp_buf>!) -> Int32

@_silgen_name ("longjmp")
public func longjump(_: UnsafeMutablePointer<jmp_buf>!, _: Int32) -> Never

private let empty_buf = [UInt8](repeating: 0, count: MemoryLayout<jmp_buf>.size)

open class Fortify: ThreadLocal {

    static private var pthreadKey: pthread_key_t = 0

    open class var threadLocal: Fortify {
        return getThreadLocal(ofClass: Fortify.self, keyVar: &pthreadKey)
    }

    private var stack = [jmp_buf]()
    public var error: Error?

    // Required as Swift assumes it has control of the stack
    open class func disableExclusivityChecking() {
        #if os(Android)
        let libName = "libswiftCore.so"
        #else
        let libName: String? = nil
        #endif
        if let stdlibHandle = dlopen(libName, Int32(RTLD_LAZY | RTLD_NOLOAD)),
            let disableExclusivity = dlsym(stdlibHandle, "_swift_disableExclusivityChecking") {
            disableExclusivity.assumingMemoryBound(to: Bool.self).pointee = true
        }
        else {
            NSLog("Could not disable exclusivity, failure likely...")
        }
    }

    public static let installHandlerOnce: Void = {
//        _swift_stdlib_errorHandler = {
//            (prefix: StaticString, msg: String, file: StaticString,
//            line: UInt, flags: UInt32, config: Int32) in
//            escape(msg: msg, file: file, line: line)
//        }

        disableExclusivityChecking()
    }()

    open class func exec<T>( block: () throws -> T ) throws -> T {
        _ = installHandlerOnce
        let local = threadLocal

        empty_buf.withUnsafeBytes {
            let buf_ptr = $0.baseAddress!.assumingMemoryBound(to: jmp_buf.self)
            local.stack.append(buf_ptr.pointee)
        }

        defer {
            local.stack.removeLast()
        }

        if setjump(&local.stack[local.stack.count-1]) != 0 {
            throw local.error ?? NSError(domain: "Error not available", code: -1, userInfo: nil)
        }

        return try block()
    }

    open class func escape(msg: String, file: StaticString = #file, line: UInt = #line) -> Never {
        escape(withError: NSError(domain: msg, code: -1, userInfo: [
            NSLocalizedDescriptionKey: "\(msg): \(file):\(line)",
            "msg": msg, "file": file, "line": line
        ]))
    }

    open class func escape(withError error: Error) -> Never {
        let local = threadLocal
        local.error = error

        if local.stack.count == 0 {
            NSLog("escape without matching exec call: \(error)")
            #if !os(Linux)
            // pthread_exit(nil) just crashes
            var oldState: Int32 = 0
            pthread_setcancelstate(Int32(PTHREAD_CANCEL_ENABLE), &oldState)
            pthread_setcanceltype(Int32(PTHREAD_CANCEL_DEFERRED), &oldState)
            // pthread_cancel() never seems to be implemented
            let cancelled = pthread_cancel(pthread_self())
            if cancelled != 0 {
                NSLog("pthread_cancel() failed: %s", strerror(cancelled))
            }
            sleep(1)
            #endif
            NSLog("cancel/exit not available/implemented or crashes, parking thread")
            Thread.sleep(until: Date.distantFuture)
        }

        longjump(&local.stack[local.stack.count-1], 1)
        NSLog("longjmp() failed, should not get here")
    }
}
