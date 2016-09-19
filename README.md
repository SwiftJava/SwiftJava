
## SwiftJava - bridging Swift to a JavaVM

I know you've been thinking.. "What I really need is a way to bridge Swift to Java"
but there are a number of use cases:

1. Making Java technologies such as JDBC available to macOS applications.

2. Giving Swift applications on Linux a portable user interface using Swing.

3. Making business logic in written in Swift available to Android apps.
 
![](http://johnholdsworth.com/Linux.png) ![](http://johnholdsworth.com/Android.png)

SwiftJava is a Swift code generator along with a small framework of supporting code written in 
the Xcode beta6 vintage of Swift 3.0. The starting point was Boris Bügling's
[Cross Platform Swift](https://realm.io/news/altconf-boris-bugling-cross-platform-swift/) talk.
The code generator takes a java class, interface or package and generates Swift classes
that interface to corresponding Java methods using the Java Native Interface "JNI".
These generated methods on the corresponding Swift class look something like this:

```Swift
    /// public java.lang.String java.lang.Object.toString()

    private static var toString_MethodID_7: jmethodID?

    open func toString() -> String! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "toString", methodSig: "()Ljava/lang/String;", methodCache: &JavaObject.toString_MethodID_7, args: &__args, locals: nil )
        return JNIType.decode( type: String(), from: __return )
    }
```

On macOS, this has been used to generate frameworks bridging the java.lang, java.util,
java.sql, java.awt and javax.swing packages along with the Apple specific additions
in the com.apple package. This makes the Java apis available with auto-completion in
the Xcode source editor. The final application can be a ".app" or a command line utility
which should be portable to Linux using the Swift Package manager. For Android, the code
generator can generate JNI code for a pair of interfaces from Java to Swift and from
Swift to Java saving the developer the chore of a lot of error prone manual stubbing.

To use, clone this project using the following command:

```Shell
    git clone https://github.com/SwiftJava/SwiftJava.git --recurse-submodules
```

This project contains the pre-generated java frameworks, an example macOS app using 
JDBC and a command line project with assorted AWT and Swing source. Development inside
Xcode uses the legacy "JavaVM" framework which requires Apple's JVM downloadable from:

[https://support.apple.com/kb/dl1572?locale=en_US](https://support.apple.com/kb/dl1572?locale=en_US)

Perversely, with AWT and Swing on macOS the JVM needs to be created on the main thread
while setup code needs to be off the main thread to leave it available for AWT's own
runloop. Use the JNI.background and JNI.run methods to achieve this in a portable manner.

When using the Swift package manager to build code from the command line, install the
latest Oracle JDK and locate the directory containing the file libjvm.so or .dylib in
the jre. Use the examples. directory to build using the following commands:

```Shell
    git clone https://github.com/SwiftJava/examples.git
    cd examples

    export JVM_LIBRARY_PATH=$JAVA_HOME/jre/lib/server # macOS
    export JVM_LIBRARY_PATH=$JAVA_HOME/jre/lib/amd64/server # Linux

    ulimit -n 10000 # increase file descriptors for link

    swift build -Xlinker -L$JVM_LIBRARY_PATH -Xlinker -rpath -Xlinker $JVM_LIBRARY_PATH -Xlinker -ljvm
```

Builds on Linux need to be made with the latest preview 6. The swing source in
"examples/Sources" shows how to receive events and subclass a Java class to have certain
methods such as java.awt.Canvas.paint() be implemented in Swift. More on this later.

### Android

For Android, consult the modified versions of the swift-android-samples and the associated
gradle build system plugin swift-android-gradle from the [original Android port](https://github.com/SwiftAndroid).
This requires a Ubuntu 15 system or VM, a Lollipop (api 21) or better device and a Swift-3.0
toolchain built with Android support. Instructions for this process are available in the
[Swift README for Android](https://github.com/apple/swift/blob/master/docs/Android.md)
and [this comprehensive tutorial](https://medium.com/@ephemer/how-we-put-an-app-in-the-android-play-store-using-swift-67bd99573e3c)
but hopefully the scripts in the modified gradle plugin take most of the pain out of it.

Once you have a toolchain you should be able to type the following commands:

```Shell
    cd swift-android-gradle
    ./gradlew install
```

This install of gradle plugin will tell you which environment variables need to be set up.
Now, connect the Android phone and type:

```Shell
    cd ../swift-android-samples/swifthello
    ./gradlew installDebug
```

For a new application define two Java interfaces, one for messaging from Java to Swift
with it's name ending in "Listener" and one for messaging back into Java from Swift.
You then use ./genswift.sh from this project to generate the Swift binding code:

```Shell
    ./genswift.sh your.package your.jar
```

This generates Swift classes and a third Java source src/org/genie/your_package/YourAppProxy.java
that also needs to be included in your project. Consult the script genhello.sh and project
"swift-android-samples/swifthello" for details. The source "swift-android-samples/swifthello/src/main/swift/Sources/main.swift"
shows how to set this up with a native method called from the main activity.

```Swift
    import java_swift

    var responder: SwiftHelloResponderForward!

    class ListenerImpl: SwiftHelloListenerBase {

        override func processNumber( number: Double ) {
            responder.processedNumber( number+42.0 )
        }

        override func processText( text: String? ) {
            var out = String()
            for _ in 0..<100 {
                out += "Hello "+text!+"! "
            }
            responder.processedText( out )
        }

    }	

    @_silgen_name("Java_net_zhuoweizhang_swifthello_SwiftHello_bind")
    public func bind( __env: UnsafeMutablePointer<JNIEnv?>, __this: jobject?, __self: jobject? )-> jobject? {
        responder = SwiftHelloResponderForward( javaObject: __self )
        return ListenerImpl().javaObject
    }
```

### Forward, Runnable, Listener, Adapter, subclass responsibility and Base classes.

For every Java interface the code generator generates a Swift Protocol along
with a ProtocolForward class an instance of which conforms to the protocol and
can be used to message Java instances conforming to the interface/protocol.

For the Runnable interface used in threading the converse needs to be possible
where Java code can call through to Swift code. This is performed using a Java
proxy class which has a pointer to the associated Swift object and a "native"
implementation of the "run()" method that calls through to Swift. On the Swift
side this is surfaced as the "RunnableBase" class which can be subclassed to
provide a Swift implementation of the "run()" method callable from Java.

This approach is also taken for processing events and all interfaces with names
ending in "Listener", "Manager" or "Handler" also have "Base" classes generated
for subclassing along with Java Proxy classes. On macOS and Linux these classes
are compiled into a jar file ~/genie.jar using the genjar.sh script for this to work.

```Swift
    class MyActionListener: ActionListenerBase {
        override func actionPerformed(e event: ActionEvent?) {
            System.exit(0);
        }
    }

    quitButton.addActionListener(MyActionListener());
```

Some event processing is also done by subclassing concrete classes that have names
ending in "Adapter". Slightly modified Swift "Base" classes and Java Proxies are also
generated for this. Other classes have methods that are intended to be responsibility
of the subclasses such as java.awt.Canvas.paint(). A list of these methods needs to be
maintained in the code generator unfortunately. If one of these methods encountered
a Base class and Proxy is generated for the concrete class that can be subclassed.

As these "Base" subclasses can't close over variables in your program you may want to
have an initialiser to capture these instead. There is a bit of a standard dance
that needs to be performed. First, instantiate the "Base" superclass and pass this 
to the designated initialiser of your superclass. Due to the use of generics you'll
also be prompted to provide a null implementation of the "required" initialiser.

```Swift
    init(imageProducer:ImageProducer) {
        super.init( javaObject: CanvasBase().takeJavaObject )
        image = createImage(imageProducer)
    }

    required init(javaObject: jobject?) {
        fatalError("init(javaObject:) has not been implemented")
    }
```

Consult the Swing examples code for further details.

# MIT License

The MIT License (MIT)
Copyright (c) 2016, John Holdsworth

Permission is hereby granted, free of charge, to any person obtaining a copy of this
software and associated documentation files (the "Software"), to deal in the Software
without restriction, including without limitation the rights to use, copy, modify, merge,
publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons
to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR 
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE 
FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

This License does not apply to any generated code in the java* submodules which
are provided under the provisions of "Fair Use" but your use is ultimately subject
to the Oracle Binary Code License Agreement available here:

[http://www.oracle.com/technetwork/java/javase/terms/license/index.html](http://www.oracle.com/technetwork/java/javase/terms/license/index.html)

