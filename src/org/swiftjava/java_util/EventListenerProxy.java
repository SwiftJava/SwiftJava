
/// interface java.util.EventListener ///

package org.swiftjava.java_util;

@SuppressWarnings("JniMissingFunction")
public class EventListenerProxy implements java.util.EventListener {

    long __swiftObject;

    EventListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
