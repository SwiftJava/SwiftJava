
import java_swift

/// interface com.jh.SwiftHello$Responder ///

public protocol SwiftHello_Responder: JavaProtocol {

    /// public abstract void com.jh.SwiftHello$Responder.debug(java.lang.String)

    func debug( msg: String? )
    func debug( _ _msg: String? )

    /// public abstract void com.jh.SwiftHello$Responder.processedNumber(double)

    func processedNumber( number: Double )
    func processedNumber( _ _number: Double )

    /// public abstract void com.jh.SwiftHello$Responder.processedText(java.lang.String)

    func processedText( text: String? )
    func processedText( _ _text: String? )

}

open class SwiftHello_ResponderForward: JNIObjectForward, SwiftHello_Responder {

    private static var SwiftHello_ResponderJNIClass: jclass?

    /// public abstract void com.jh.SwiftHello$Responder.debug(java.lang.String)

    private static var debug_MethodID_4: jmethodID?

    open func debug( msg: String? ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: msg, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "debug", methodSig: "(Ljava/lang/String;)V", methodCache: &SwiftHello_ResponderForward.debug_MethodID_4, args: &__args, locals: &__locals )
    }

    open func debug( _ _msg: String? ) {
        debug( msg: _msg )
    }

    /// public abstract void com.jh.SwiftHello$Responder.processedNumber(double)

    private static var processedNumber_MethodID_5: jmethodID?

    open func processedNumber( number: Double ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: number, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedNumber", methodSig: "(D)V", methodCache: &SwiftHello_ResponderForward.processedNumber_MethodID_5, args: &__args, locals: &__locals )
    }

    open func processedNumber( _ _number: Double ) {
        processedNumber( number: _number )
    }

    /// public abstract void com.jh.SwiftHello$Responder.processedText(java.lang.String)

    private static var processedText_MethodID_6: jmethodID?

    open func processedText( text: String? ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: text, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedText", methodSig: "(Ljava/lang/String;)V", methodCache: &SwiftHello_ResponderForward.processedText_MethodID_6, args: &__args, locals: &__locals )
    }

    open func processedText( _ _text: String? ) {
        processedText( text: _text )
    }

}


