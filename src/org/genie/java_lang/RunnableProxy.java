
/// interface java.lang.Runnable ///

package org.genie.java_lang;

public class RunnableProxy implements java.lang.Runnable {

    long swiftObject;

    RunnableProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.lang.Runnable.run()

    public native void __run();

    public void run() {
        __run( );
    }

}
