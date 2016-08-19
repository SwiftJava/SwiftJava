
/// interface com.apple.eawt.AboutHandler ///

package org.genie.com_apple;

public class AboutHandlerProxy implements com.apple.eawt.AboutHandler {

    long swiftObject;

    AboutHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.AboutHandler.handleAbout(com.apple.eawt.AppEvent$AboutEvent)

    public native void __handleAbout( com.apple.eawt.AppEvent.AboutEvent arg0 );

    public void handleAbout( com.apple.eawt.AppEvent.AboutEvent arg0 ) {
        __handleAbout( arg0 );
    }

}
