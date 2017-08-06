
/// interface com.apple.eawt.event.GesturePhaseListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class GesturePhaseListenerProxy implements com.apple.eawt.event.GesturePhaseListener {

    long __swiftObject;

    GesturePhaseListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.event.GesturePhaseListener.gestureBegan(com.apple.eawt.event.GesturePhaseEvent)

    public native void __gestureBegan( long __swiftObject, com.apple.eawt.event.GesturePhaseEvent arg0 );

    public void gestureBegan( com.apple.eawt.event.GesturePhaseEvent arg0 ) {
        __gestureBegan( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.event.GesturePhaseListener.gestureEnded(com.apple.eawt.event.GesturePhaseEvent)

    public native void __gestureEnded( long __swiftObject, com.apple.eawt.event.GesturePhaseEvent arg0 );

    public void gestureEnded( com.apple.eawt.event.GesturePhaseEvent arg0 ) {
        __gestureEnded( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
