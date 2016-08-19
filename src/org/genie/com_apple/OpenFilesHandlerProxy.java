
/// interface com.apple.eawt.OpenFilesHandler ///

package org.genie.com_apple;

public class OpenFilesHandlerProxy implements com.apple.eawt.OpenFilesHandler {

    long swiftObject;

    OpenFilesHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.OpenFilesHandler.openFiles(com.apple.eawt.AppEvent$OpenFilesEvent)

    public native void __openFiles( com.apple.eawt.AppEvent.OpenFilesEvent arg0 );

    public void openFiles( com.apple.eawt.AppEvent.OpenFilesEvent arg0 ) {
        __openFiles( arg0 );
    }

}
