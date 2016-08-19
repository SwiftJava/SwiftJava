
/// interface com.apple.eawt.PreferencesHandler ///

package org.genie.com_apple;

public class PreferencesHandlerProxy implements com.apple.eawt.PreferencesHandler {

    long swiftObject;

    PreferencesHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.PreferencesHandler.handlePreferences(com.apple.eawt.AppEvent$PreferencesEvent)

    public native void __handlePreferences( com.apple.eawt.AppEvent.PreferencesEvent arg0 );

    public void handlePreferences( com.apple.eawt.AppEvent.PreferencesEvent arg0 ) {
        __handlePreferences( arg0 );
    }

}
