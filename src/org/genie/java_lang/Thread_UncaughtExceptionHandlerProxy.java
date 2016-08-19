
/// interface java.lang.Thread$UncaughtExceptionHandler ///

package org.genie.java_lang;

public class Thread_UncaughtExceptionHandlerProxy implements java.lang.Thread.UncaughtExceptionHandler {

    long swiftObject;

    Thread_UncaughtExceptionHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.lang.Thread$UncaughtExceptionHandler.uncaughtException(java.lang.Thread,java.lang.Throwable)

    public native void __uncaughtException( java.lang.Thread arg0, java.lang.Throwable arg1 );

    public void uncaughtException( java.lang.Thread arg0, java.lang.Throwable arg1 ) {
        __uncaughtException( arg0, arg1 );
    }

}
