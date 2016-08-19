
/// interface com.apple.eawt.event.MagnificationListener ///

package org.genie.com_apple;

public class MagnificationListenerProxy implements com.apple.eawt.event.MagnificationListener {

    long swiftObject;

    MagnificationListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.event.MagnificationListener.magnify(com.apple.eawt.event.MagnificationEvent)

    public native void __magnify( com.apple.eawt.event.MagnificationEvent arg0 );

    public void magnify( com.apple.eawt.event.MagnificationEvent arg0 ) {
        __magnify( arg0 );
    }

}
