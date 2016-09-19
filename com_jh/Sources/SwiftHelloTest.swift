
import java_swift

/// interface com.jh.SwiftHelloTest ///

public protocol SwiftHelloTest: JavaProtocol {

}

open class SwiftHelloTestForward: JNIObjectForward, SwiftHelloTest {

    private static var SwiftHelloTestJNIClass: jclass?

}


