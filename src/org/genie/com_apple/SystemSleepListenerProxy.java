
/// interface com.apple.eawt.SystemSleepListener ///

package org.genie.com_apple;

public class SystemSleepListenerProxy implements com.apple.eawt.SystemSleepListener {

    long swiftObject;

    SystemSleepListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.SystemSleepListener.systemAwoke(com.apple.eawt.AppEvent$SystemSleepEvent)

    public native void __systemAwoke( com.apple.eawt.AppEvent.SystemSleepEvent arg0 );

    public void systemAwoke( com.apple.eawt.AppEvent.SystemSleepEvent arg0 ) {
        __systemAwoke( arg0 );
    }

    /// public abstract void com.apple.eawt.SystemSleepListener.systemAboutToSleep(com.apple.eawt.AppEvent$SystemSleepEvent)

    public native void __systemAboutToSleep( com.apple.eawt.AppEvent.SystemSleepEvent arg0 );

    public void systemAboutToSleep( com.apple.eawt.AppEvent.SystemSleepEvent arg0 ) {
        __systemAboutToSleep( arg0 );
    }

}
