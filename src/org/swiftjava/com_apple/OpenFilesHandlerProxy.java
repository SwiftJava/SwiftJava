
/// interface com.apple.eawt.OpenFilesHandler ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class OpenFilesHandlerProxy implements com.apple.eawt.OpenFilesHandler {

    long __swiftObject;

    OpenFilesHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.OpenFilesHandler.openFiles(com.apple.eawt.AppEvent$OpenFilesEvent)

    public native void __openFiles( long __swiftObject, com.apple.eawt.AppEvent.OpenFilesEvent arg0 );

    public void openFiles( com.apple.eawt.AppEvent.OpenFilesEvent arg0 ) {
        __openFiles( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
