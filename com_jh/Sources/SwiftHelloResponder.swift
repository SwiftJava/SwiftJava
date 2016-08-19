
import java_swift

/// interface com.jh.SwiftHelloResponder ///

public protocol SwiftHelloResponder: JavaProtocol {

    /// public abstract void com.jh.SwiftHelloResponder.processedNumber(double)

    func processedNumber( number: Double )
    func processedNumber( _ _number: Double )

    /// public abstract void com.jh.SwiftHelloResponder.processedText(java.lang.String)

    func processedText( text: String? )
    func processedText( _ _text: String? )

}

open class SwiftHelloResponderForward: JNIObjectForward, SwiftHelloResponder {

    private static var SwiftHelloResponderJNIClass: jclass?

    /// public abstract void com.jh.SwiftHelloResponder.processedNumber(double)

    private static var processedNumber_MethodID_3: jmethodID?

    open func processedNumber( number: Double ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: number, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedNumber", methodSig: "(D)V", methodCache: &SwiftHelloResponderForward.processedNumber_MethodID_3, args: &__args, locals: &__locals )
    }

    open func processedNumber( _ _number: Double ) {
        processedNumber( number: _number )
    }

    /// public abstract void com.jh.SwiftHelloResponder.processedText(java.lang.String)

    private static var processedText_MethodID_4: jmethodID?

    open func processedText( text: String? ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: text, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processedText", methodSig: "(Ljava/lang/String;)V", methodCache: &SwiftHelloResponderForward.processedText_MethodID_4, args: &__args, locals: &__locals )
    }

    open func processedText( _ _text: String? ) {
        processedText( text: _text )
    }

}


