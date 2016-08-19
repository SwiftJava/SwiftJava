
/// interface java.util.concurrent.RejectedExecutionHandler ///

package org.genie.java_util;

public class RejectedExecutionHandlerProxy implements java.util.concurrent.RejectedExecutionHandler {

    long swiftObject;

    RejectedExecutionHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.util.concurrent.RejectedExecutionHandler.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)

    public native void __rejectedExecution( java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor executor );

    public void rejectedExecution( java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor executor ) {
        __rejectedExecution( r, executor );
    }

}
