
import java_swift

/// interface com.jh.SwiftHelloListener ///

public protocol SwiftHelloListener: JavaProtocol {

    /// public abstract void com.jh.SwiftHelloListener.processNumber(double)

    func processNumber( number: Double )
    func processNumber( _ _number: Double )

    /// public abstract void com.jh.SwiftHelloListener.processText(java.lang.String)

    func processText( text: String? )
    func processText( _ _text: String? )

}

open class SwiftHelloListenerForward: JNIObjectForward, SwiftHelloListener {

    private static var SwiftHelloListenerJNIClass: jclass?

    /// public abstract void com.jh.SwiftHelloListener.processNumber(double)

    private static var processNumber_MethodID_3: jmethodID?

    open func processNumber( number: Double ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: number, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processNumber", methodSig: "(D)V", methodCache: &SwiftHelloListenerForward.processNumber_MethodID_3, args: &__args, locals: &__locals )
    }

    open func processNumber( _ _number: Double ) {
        processNumber( number: _number )
    }

    /// public abstract void com.jh.SwiftHelloListener.processText(java.lang.String)

    private static var processText_MethodID_4: jmethodID?

    open func processText( text: String? ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: text, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processText", methodSig: "(Ljava/lang/String;)V", methodCache: &SwiftHelloListenerForward.processText_MethodID_4, args: &__args, locals: &__locals )
    }

    open func processText( _ _text: String? ) {
        processText( text: _text )
    }

}


private typealias SwiftHelloListener_processNumber_0_type = @convention(c) ( _: UnsafeMutablePointer<JNIEnv?>, _: jobject?, _: jdouble ) -> ()

private func SwiftHelloListener_processNumber_0( _ __env: UnsafeMutablePointer<JNIEnv?>, _ __this: jobject?, _ number: jdouble ) -> () {
    SwiftHelloListenerBase.swiftObject( jniEnv: __env, javaObject: __this ).processNumber( JNIType.decode( type: Double(), from: number ) )
}

private typealias SwiftHelloListener_processText_1_type = @convention(c) ( _: UnsafeMutablePointer<JNIEnv?>, _: jobject?, _: jobject? ) -> ()

private func SwiftHelloListener_processText_1( _ __env: UnsafeMutablePointer<JNIEnv?>, _ __this: jobject?, _ text: jobject? ) -> () {
    SwiftHelloListenerBase.swiftObject( jniEnv: __env, javaObject: __this ).processText( JNIType.decode( type: String(), from: text ) )
}

open class SwiftHelloListenerBase: JNIObjectProxy, SwiftHelloListener {

    private static var nativesRegistered = false

    private static func registerNatives() {
        if ( !nativesRegistered ) {
            var natives = [JNINativeMethod]()

            let SwiftHelloListener_processNumber_0_thunk: SwiftHelloListener_processNumber_0_type = SwiftHelloListener_processNumber_0
            natives.append( JNINativeMethod( name: strdup("__processNumber"), signature: strdup("(D)V"), fnPtr: unsafeBitCast( SwiftHelloListener_processNumber_0_thunk, to: UnsafeMutableRawPointer.self ) ) )

            let SwiftHelloListener_processText_1_thunk: SwiftHelloListener_processText_1_type = SwiftHelloListener_processText_1
            natives.append( JNINativeMethod( name: strdup("__processText"), signature: strdup("(Ljava/lang/String;)V"), fnPtr: unsafeBitCast( SwiftHelloListener_processText_1_thunk, to: UnsafeMutableRawPointer.self ) ) )

            withUnsafePointer(to: &natives[0]) {
                nativesPtr in
                let clazz = JNI.FindClass( "org/genie/com_jh/SwiftHelloListenerProxy" )
                if JNI.api.RegisterNatives( JNI.env, clazz, nativesPtr, jint(natives.count) ) != jint(JNI_OK) {
                    JNI.report( "Unable to register java natives" )
                }
            }

            nativesRegistered = true
        }
    }

    public convenience init() {
        self.init( javaObject: nil )
    }

    public required init( javaObject: jobject! ) {
        super.init( javaObject: javaObject )
        SwiftHelloListenerBase.registerNatives()
        createProxy( javaClassName: "org/genie/com_jh/SwiftHelloListenerProxy" )
    }

    static func swiftObject( jniEnv: UnsafeMutablePointer<JNIEnv?>?, javaObject: jobject? ) -> SwiftHelloListenerBase {
        return unsafeBitCast( swiftPointer( jniEnv: jniEnv, object: javaObject ), to: SwiftHelloListenerBase.self )
    }

    /// public abstract void com.jh.SwiftHelloListener.processNumber(double)

    open func processNumber( number: Double ) /**/ {
    }

    open func processNumber( _ _number: Double ) /**/ {
        processNumber( number: _number )
    }

    /// public abstract void com.jh.SwiftHelloListener.processText(java.lang.String)

    open func processText( text: String? ) /**/ {
    }

    open func processText( _ _text: String? ) /**/ {
        processText( text: _text )
    }

}
