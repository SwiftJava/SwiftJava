
/// interface java.util.concurrent.RejectedExecutionHandler ///

package org.swiftjava.java_util;

@SuppressWarnings("JniMissingFunction")
public class RejectedExecutionHandlerProxy implements java.util.concurrent.RejectedExecutionHandler {

    long __swiftObject;

    RejectedExecutionHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.util.concurrent.RejectedExecutionHandler.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)

    public native void __rejectedExecution( long __swiftObject, java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor executor );

    public void rejectedExecution( java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor executor ) {
        __rejectedExecution( __swiftObject, r, executor );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
