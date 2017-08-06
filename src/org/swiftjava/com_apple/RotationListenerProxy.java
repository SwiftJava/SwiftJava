
/// interface com.apple.eawt.event.RotationListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class RotationListenerProxy implements com.apple.eawt.event.RotationListener {

    long __swiftObject;

    RotationListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.event.RotationListener.rotate(com.apple.eawt.event.RotationEvent)

    public native void __rotate( long __swiftObject, com.apple.eawt.event.RotationEvent arg0 );

    public void rotate( com.apple.eawt.event.RotationEvent arg0 ) {
        __rotate( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
