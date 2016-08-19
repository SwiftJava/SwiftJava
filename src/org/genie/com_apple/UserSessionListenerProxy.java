
/// interface com.apple.eawt.UserSessionListener ///

package org.genie.com_apple;

public class UserSessionListenerProxy implements com.apple.eawt.UserSessionListener {

    long swiftObject;

    UserSessionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.UserSessionListener.userSessionDeactivated(com.apple.eawt.AppEvent$UserSessionEvent)

    public native void __userSessionDeactivated( com.apple.eawt.AppEvent.UserSessionEvent arg0 );

    public void userSessionDeactivated( com.apple.eawt.AppEvent.UserSessionEvent arg0 ) {
        __userSessionDeactivated( arg0 );
    }

    /// public abstract void com.apple.eawt.UserSessionListener.userSessionActivated(com.apple.eawt.AppEvent$UserSessionEvent)

    public native void __userSessionActivated( com.apple.eawt.AppEvent.UserSessionEvent arg0 );

    public void userSessionActivated( com.apple.eawt.AppEvent.UserSessionEvent arg0 ) {
        __userSessionActivated( arg0 );
    }

}
