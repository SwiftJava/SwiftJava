
/// interface com.apple.eawt.OpenURIHandler ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class OpenURIHandlerProxy implements com.apple.eawt.OpenURIHandler {

    long __swiftObject;

    OpenURIHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.OpenURIHandler.openURI(com.apple.eawt.AppEvent$OpenURIEvent)

    public native void __openURI( long __swiftObject, com.apple.eawt.AppEvent.OpenURIEvent arg0 );

    public void openURI( com.apple.eawt.AppEvent.OpenURIEvent arg0 ) {
        __openURI( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
