
/// interface com.apple.eawt.OpenURIHandler ///

package org.genie.com_apple;

public class OpenURIHandlerProxy implements com.apple.eawt.OpenURIHandler {

    long swiftObject;

    OpenURIHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.OpenURIHandler.openURI(com.apple.eawt.AppEvent$OpenURIEvent)

    public native void __openURI( com.apple.eawt.AppEvent.OpenURIEvent arg0 );

    public void openURI( com.apple.eawt.AppEvent.OpenURIEvent arg0 ) {
        __openURI( arg0 );
    }

}
