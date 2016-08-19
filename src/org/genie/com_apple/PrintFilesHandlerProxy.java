
/// interface com.apple.eawt.PrintFilesHandler ///

package org.genie.com_apple;

public class PrintFilesHandlerProxy implements com.apple.eawt.PrintFilesHandler {

    long swiftObject;

    PrintFilesHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.PrintFilesHandler.printFiles(com.apple.eawt.AppEvent$PrintFilesEvent)

    public native void __printFiles( com.apple.eawt.AppEvent.PrintFilesEvent arg0 );

    public void printFiles( com.apple.eawt.AppEvent.PrintFilesEvent arg0 ) {
        __printFiles( arg0 );
    }

}
