
/// interface com.apple.eawt.PrintFilesHandler ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class PrintFilesHandlerProxy implements com.apple.eawt.PrintFilesHandler {

    long __swiftObject;

    PrintFilesHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.PrintFilesHandler.printFiles(com.apple.eawt.AppEvent$PrintFilesEvent)

    public native void __printFiles( long __swiftObject, com.apple.eawt.AppEvent.PrintFilesEvent arg0 );

    public void printFiles( com.apple.eawt.AppEvent.PrintFilesEvent arg0 ) {
        __printFiles( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
