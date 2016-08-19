
/// interface com.apple.eawt.AppHiddenListener ///

package org.genie.com_apple;

public class AppHiddenListenerProxy implements com.apple.eawt.AppHiddenListener {

    long swiftObject;

    AppHiddenListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.AppHiddenListener.appHidden(com.apple.eawt.AppEvent$AppHiddenEvent)

    public native void __appHidden( com.apple.eawt.AppEvent.AppHiddenEvent arg0 );

    public void appHidden( com.apple.eawt.AppEvent.AppHiddenEvent arg0 ) {
        __appHidden( arg0 );
    }

    /// public abstract void com.apple.eawt.AppHiddenListener.appUnhidden(com.apple.eawt.AppEvent$AppHiddenEvent)

    public native void __appUnhidden( com.apple.eawt.AppEvent.AppHiddenEvent arg0 );

    public void appUnhidden( com.apple.eawt.AppEvent.AppHiddenEvent arg0 ) {
        __appUnhidden( arg0 );
    }

}
