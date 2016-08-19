
/// interface com.apple.eawt.event.RotationListener ///

package org.genie.com_apple;

public class RotationListenerProxy implements com.apple.eawt.event.RotationListener {

    long swiftObject;

    RotationListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.event.RotationListener.rotate(com.apple.eawt.event.RotationEvent)

    public native void __rotate( com.apple.eawt.event.RotationEvent arg0 );

    public void rotate( com.apple.eawt.event.RotationEvent arg0 ) {
        __rotate( arg0 );
    }

}
