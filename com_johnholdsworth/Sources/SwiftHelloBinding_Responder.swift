
import java_swift

/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// interface com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder ///

public protocol SwiftHelloBinding_Responder: JavaProtocol {

    /// public abstract java.lang.String[] com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.debug(java.lang.String)

    func debug( msg: String? ) -> [String]!

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.onMainThread(java.lang.Runnable)

    func onMainThread( runnable: java_swift.Runnable? )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processMap(com.johnholdsworth.swiftbindings.SwiftHelloTypes$ListenerMap)

    func processMap( map: [String:SwiftHelloTypes_TextListener]? )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processMapList(com.johnholdsworth.swiftbindings.SwiftHelloTypes$ListenerMapList)

    func processMapList( map: [String:[SwiftHelloTypes_TextListener]]? )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedNumber(double)

    func processedNumber( number: Double )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedStringMap(com.johnholdsworth.swiftbindings.SwiftHelloTypes$StringMap)

    func processedStringMap( map: [String:String]? )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedStringMapList(com.johnholdsworth.swiftbindings.SwiftHelloTypes$StringMapList)

    func processedStringMapList( map: [String:[String]]? )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedText(java.lang.String)

    func processedText( text: String? )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedTextListener(com.johnholdsworth.swiftbindings.SwiftHelloTypes$TextListener)

    func processedTextListener( text: SwiftHelloTypes_TextListener? )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedTextListener2dArray(com.johnholdsworth.swiftbindings.SwiftHelloTypes$TextListener[][])

    func processedTextListener2dArray( text: [[SwiftHelloTypes_TextListener]]? )

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedTextListenerArray(com.johnholdsworth.swiftbindings.SwiftHelloTypes$TextListener[])

    func processedTextListenerArray( text: [SwiftHelloTypes_TextListener]? )

    /// public abstract com.johnholdsworth.swiftbindings.SwiftHelloTest$TestListener com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.testResponder(int)

    func testResponder( loopback: Int ) -> SwiftHelloTest_TestListener!

    /// public abstract double com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.throwException() throws java.lang.Exception

    func throwException() throws /* java.lang.Exception */ -> Double

}


open class SwiftHelloBinding_ResponderForward: JNIObjectForward, SwiftHelloBinding_Responder {

    private static var SwiftHelloBinding_ResponderJNIClass: jclass?

    /// public abstract java.lang.String[] com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.debug(java.lang.String)

    private static var debug_MethodID_14: jmethodID?

    open func debug( msg: String? ) -> [String]! {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: msg, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "debug", methodSig: "(Ljava/lang/String;)[Ljava/lang/String;", methodCache: &SwiftHelloBinding_ResponderForward.debug_MethodID_14, args: &__args, locals: &__locals )
        return JNIType.toSwift( type: [String].self, from: __return )
    }

    open func debug( _ _msg: String? ) -> [String]! {
        return debug( msg: _msg )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.onMainThread(java.lang.Runnable)

    private static var onMainThread_MethodID_15: jmethodID?

    open func onMainThread( runnable: java_swift.Runnable? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: runnable, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "onMainThread", methodSig: "(Ljava/lang/Runnable;)V", methodCache: &SwiftHelloBinding_ResponderForward.onMainThread_MethodID_15, args: &__args, locals: &__locals )
    }

    open func onMainThread( _ _runnable: java_swift.Runnable? ) {
        onMainThread( runnable: _runnable )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processMap(com.johnholdsworth.swiftbindings.SwiftHelloTypes$ListenerMap)

    private static var processMap_MethodID_16: jmethodID?

    open func processMap( map: [String:SwiftHelloTypes_TextListener]? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: map, mapClass: "com/johnholdsworth/swiftbindings/SwiftHelloTypes$ListenerMap", locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processMap", methodSig: "(Lcom/johnholdsworth/swiftbindings/SwiftHelloTypes$ListenerMap;)V", methodCache: &SwiftHelloBinding_ResponderForward.processMap_MethodID_16, args: &__args, locals: &__locals )
    }

    open func processMap( _ _map: [String:SwiftHelloTypes_TextListener]? ) {
        processMap( map: _map )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processMapList(com.johnholdsworth.swiftbindings.SwiftHelloTypes$ListenerMapList)

    private static var processMapList_MethodID_17: jmethodID?

    open func processMapList( map: [String:[SwiftHelloTypes_TextListener]]? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: map, mapClass: "com/johnholdsworth/swiftbindings/SwiftHelloTypes$ListenerMapList", locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processMapList", methodSig: "(Lcom/johnholdsworth/swiftbindings/SwiftHelloTypes$ListenerMapList;)V", methodCache: &SwiftHelloBinding_ResponderForward.processMapList_MethodID_17, args: &__args, locals: &__locals )
    }

    open func processMapList( _ _map: [String:[SwiftHelloTypes_TextListener]]? ) {
        processMapList( map: _map )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedNumber(double)

    private static var processedNumber_MethodID_18: jmethodID?

    open func processedNumber( number: Double ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = jvalue( d: number )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedNumber", methodSig: "(D)V", methodCache: &SwiftHelloBinding_ResponderForward.processedNumber_MethodID_18, args: &__args, locals: &__locals )
    }

    open func processedNumber( _ _number: Double ) {
        processedNumber( number: _number )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedStringMap(com.johnholdsworth.swiftbindings.SwiftHelloTypes$StringMap)

    private static var processedStringMap_MethodID_19: jmethodID?

    open func processedStringMap( map: [String:String]? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: map, mapClass: "com/johnholdsworth/swiftbindings/SwiftHelloTypes$StringMap", locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedStringMap", methodSig: "(Lcom/johnholdsworth/swiftbindings/SwiftHelloTypes$StringMap;)V", methodCache: &SwiftHelloBinding_ResponderForward.processedStringMap_MethodID_19, args: &__args, locals: &__locals )
    }

    open func processedStringMap( _ _map: [String:String]? ) {
        processedStringMap( map: _map )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedStringMapList(com.johnholdsworth.swiftbindings.SwiftHelloTypes$StringMapList)

    private static var processedStringMapList_MethodID_20: jmethodID?

    open func processedStringMapList( map: [String:[String]]? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: map, mapClass: "com/johnholdsworth/swiftbindings/SwiftHelloTypes$StringMapList", locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedStringMapList", methodSig: "(Lcom/johnholdsworth/swiftbindings/SwiftHelloTypes$StringMapList;)V", methodCache: &SwiftHelloBinding_ResponderForward.processedStringMapList_MethodID_20, args: &__args, locals: &__locals )
    }

    open func processedStringMapList( _ _map: [String:[String]]? ) {
        processedStringMapList( map: _map )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedText(java.lang.String)

    private static var processedText_MethodID_21: jmethodID?

    open func processedText( text: String? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: text, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedText", methodSig: "(Ljava/lang/String;)V", methodCache: &SwiftHelloBinding_ResponderForward.processedText_MethodID_21, args: &__args, locals: &__locals )
    }

    open func processedText( _ _text: String? ) {
        processedText( text: _text )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedTextListener(com.johnholdsworth.swiftbindings.SwiftHelloTypes$TextListener)

    private static var processedTextListener_MethodID_22: jmethodID?

    open func processedTextListener( text: SwiftHelloTypes_TextListener? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: text, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedTextListener", methodSig: "(Lcom/johnholdsworth/swiftbindings/SwiftHelloTypes$TextListener;)V", methodCache: &SwiftHelloBinding_ResponderForward.processedTextListener_MethodID_22, args: &__args, locals: &__locals )
    }

    open func processedTextListener( _ _text: SwiftHelloTypes_TextListener? ) {
        processedTextListener( text: _text )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedTextListener2dArray(com.johnholdsworth.swiftbindings.SwiftHelloTypes$TextListener[][])

    private static var processedTextListener2dArray_MethodID_23: jmethodID?

    open func processedTextListener2dArray( text: [[SwiftHelloTypes_TextListener]]? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: text, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedTextListener2dArray", methodSig: "([[Lcom/johnholdsworth/swiftbindings/SwiftHelloTypes$TextListener;)V", methodCache: &SwiftHelloBinding_ResponderForward.processedTextListener2dArray_MethodID_23, args: &__args, locals: &__locals )
    }

    open func processedTextListener2dArray( _ _text: [[SwiftHelloTypes_TextListener]]? ) {
        processedTextListener2dArray( text: _text )
    }

    /// public abstract void com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.processedTextListenerArray(com.johnholdsworth.swiftbindings.SwiftHelloTypes$TextListener[])

    private static var processedTextListenerArray_MethodID_24: jmethodID?

    open func processedTextListenerArray( text: [SwiftHelloTypes_TextListener]? ) {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = JNIType.toJava( value: text, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedTextListenerArray", methodSig: "([Lcom/johnholdsworth/swiftbindings/SwiftHelloTypes$TextListener;)V", methodCache: &SwiftHelloBinding_ResponderForward.processedTextListenerArray_MethodID_24, args: &__args, locals: &__locals )
    }

    open func processedTextListenerArray( _ _text: [SwiftHelloTypes_TextListener]? ) {
        processedTextListenerArray( text: _text )
    }

    /// public abstract com.johnholdsworth.swiftbindings.SwiftHelloTest$TestListener com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.testResponder(int)

    private static var testResponder_MethodID_25: jmethodID?

    open func testResponder( loopback: Int ) -> SwiftHelloTest_TestListener! {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        __args[0] = jvalue( i: jint(loopback) )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "testResponder", methodSig: "(I)Lcom/johnholdsworth/swiftbindings/SwiftHelloTest$TestListener;", methodCache: &SwiftHelloBinding_ResponderForward.testResponder_MethodID_25, args: &__args, locals: &__locals )
        defer { JNI.DeleteLocalRef( __return ) }
        return __return != nil ? SwiftHelloTest_TestListenerForward( javaObject: __return ) : nil
    }

    open func testResponder( _ _loopback: Int ) -> SwiftHelloTest_TestListener! {
        return testResponder( loopback: _loopback )
    }

    /// public abstract double com.johnholdsworth.swiftbindings.SwiftHelloBinding$Responder.throwException() throws java.lang.Exception

    private static var throwException_MethodID_26: jmethodID?

    open func throwException() throws /* java.lang.Exception */ -> Double {
        var __locals = [jobject]()
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        let __return = JNIMethod.CallDoubleMethod( object: javaObject, methodName: "throwException", methodSig: "()D", methodCache: &SwiftHelloBinding_ResponderForward.throwException_MethodID_26, args: &__args, locals: &__locals )
        if let throwable = JNI.ExceptionCheck() {
            defer { JNI.DeleteLocalRef( throwable ) }
            throw java_swift.Exception( javaObject: throwable )
        }
        return __return
    }


}
