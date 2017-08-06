
/// interface com.apple.eawt.QuitHandler ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class QuitHandlerProxy implements com.apple.eawt.QuitHandler {

    long __swiftObject;

    QuitHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.QuitHandler.handleQuitRequestWith(com.apple.eawt.AppEvent$QuitEvent,com.apple.eawt.QuitResponse)

    public native void __handleQuitRequestWith( long __swiftObject, com.apple.eawt.AppEvent.QuitEvent arg0, com.apple.eawt.QuitResponse arg1 );

    public void handleQuitRequestWith( com.apple.eawt.AppEvent.QuitEvent arg0, com.apple.eawt.QuitResponse arg1 ) {
        __handleQuitRequestWith( __swiftObject, arg0, arg1 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
