
/// interface com.apple.eawt.AppReOpenedListener ///

package org.genie.com_apple;

public class AppReOpenedListenerProxy implements com.apple.eawt.AppReOpenedListener {

    long swiftObject;

    AppReOpenedListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.AppReOpenedListener.appReOpened(com.apple.eawt.AppEvent$AppReOpenedEvent)

    public native void __appReOpened( com.apple.eawt.AppEvent.AppReOpenedEvent arg0 );

    public void appReOpened( com.apple.eawt.AppEvent.AppReOpenedEvent arg0 ) {
        __appReOpened( arg0 );
    }

}
