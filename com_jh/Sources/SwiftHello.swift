
import java_swift

/// interface com.jh.SwiftHello ///

public protocol SwiftHello: JavaProtocol {

}

open class SwiftHelloForward: JNIObjectForward, SwiftHello {

    private static var SwiftHelloJNIClass: jclass?

}


