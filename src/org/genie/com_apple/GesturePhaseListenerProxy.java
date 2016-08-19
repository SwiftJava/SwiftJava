
/// interface com.apple.eawt.event.GesturePhaseListener ///

package org.genie.com_apple;

public class GesturePhaseListenerProxy implements com.apple.eawt.event.GesturePhaseListener {

    long swiftObject;

    GesturePhaseListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.event.GesturePhaseListener.gestureBegan(com.apple.eawt.event.GesturePhaseEvent)

    public native void __gestureBegan( com.apple.eawt.event.GesturePhaseEvent arg0 );

    public void gestureBegan( com.apple.eawt.event.GesturePhaseEvent arg0 ) {
        __gestureBegan( arg0 );
    }

    /// public abstract void com.apple.eawt.event.GesturePhaseListener.gestureEnded(com.apple.eawt.event.GesturePhaseEvent)

    public native void __gestureEnded( com.apple.eawt.event.GesturePhaseEvent arg0 );

    public void gestureEnded( com.apple.eawt.event.GesturePhaseEvent arg0 ) {
        __gestureEnded( arg0 );
    }

}
