
/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// interface com.apple.eawt.event.GestureListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class GestureListenerProxy implements com.apple.eawt.event.GestureListener {

    // address of proxy object
    long __swiftObject;

    GestureListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}