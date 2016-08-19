
/// interface com.apple.eawt.AppForegroundListener ///

package org.genie.com_apple;

public class AppForegroundListenerProxy implements com.apple.eawt.AppForegroundListener {

    long swiftObject;

    AppForegroundListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.AppForegroundListener.appRaisedToForeground(com.apple.eawt.AppEvent$AppForegroundEvent)

    public native void __appRaisedToForeground( com.apple.eawt.AppEvent.AppForegroundEvent arg0 );

    public void appRaisedToForeground( com.apple.eawt.AppEvent.AppForegroundEvent arg0 ) {
        __appRaisedToForeground( arg0 );
    }

    /// public abstract void com.apple.eawt.AppForegroundListener.appMovedToBackground(com.apple.eawt.AppEvent$AppForegroundEvent)

    public native void __appMovedToBackground( com.apple.eawt.AppEvent.AppForegroundEvent arg0 );

    public void appMovedToBackground( com.apple.eawt.AppEvent.AppForegroundEvent arg0 ) {
        __appMovedToBackground( arg0 );
    }

}
