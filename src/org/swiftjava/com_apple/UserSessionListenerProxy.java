
/// interface com.apple.eawt.UserSessionListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class UserSessionListenerProxy implements com.apple.eawt.UserSessionListener {

    long __swiftObject;

    UserSessionListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.UserSessionListener.userSessionDeactivated(com.apple.eawt.AppEvent$UserSessionEvent)

    public native void __userSessionDeactivated( long __swiftObject, com.apple.eawt.AppEvent.UserSessionEvent arg0 );

    public void userSessionDeactivated( com.apple.eawt.AppEvent.UserSessionEvent arg0 ) {
        __userSessionDeactivated( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.UserSessionListener.userSessionActivated(com.apple.eawt.AppEvent$UserSessionEvent)

    public native void __userSessionActivated( long __swiftObject, com.apple.eawt.AppEvent.UserSessionEvent arg0 );

    public void userSessionActivated( com.apple.eawt.AppEvent.UserSessionEvent arg0 ) {
        __userSessionActivated( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
