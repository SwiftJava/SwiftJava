
/// interface com.apple.eawt.ScreenSleepListener ///

package org.genie.com_apple;

public class ScreenSleepListenerProxy implements com.apple.eawt.ScreenSleepListener {

    long swiftObject;

    ScreenSleepListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.ScreenSleepListener.screenAwoke(com.apple.eawt.AppEvent$ScreenSleepEvent)

    public native void __screenAwoke( com.apple.eawt.AppEvent.ScreenSleepEvent arg0 );

    public void screenAwoke( com.apple.eawt.AppEvent.ScreenSleepEvent arg0 ) {
        __screenAwoke( arg0 );
    }

    /// public abstract void com.apple.eawt.ScreenSleepListener.screenAboutToSleep(com.apple.eawt.AppEvent$ScreenSleepEvent)

    public native void __screenAboutToSleep( com.apple.eawt.AppEvent.ScreenSleepEvent arg0 );

    public void screenAboutToSleep( com.apple.eawt.AppEvent.ScreenSleepEvent arg0 ) {
        __screenAboutToSleep( arg0 );
    }

}
