
/// interface com.apple.eawt.QuitHandler ///

package org.genie.com_apple;

public class QuitHandlerProxy implements com.apple.eawt.QuitHandler {

    long swiftObject;

    QuitHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.QuitHandler.handleQuitRequestWith(com.apple.eawt.AppEvent$QuitEvent,com.apple.eawt.QuitResponse)

    public native void __handleQuitRequestWith( com.apple.eawt.AppEvent.QuitEvent arg0, com.apple.eawt.QuitResponse arg1 );

    public void handleQuitRequestWith( com.apple.eawt.AppEvent.QuitEvent arg0, com.apple.eawt.QuitResponse arg1 ) {
        __handleQuitRequestWith( arg0, arg1 );
    }

}
