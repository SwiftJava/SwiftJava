
/// interface com.apple.eawt.AppHiddenListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class AppHiddenListenerProxy implements com.apple.eawt.AppHiddenListener {

    long __swiftObject;

    AppHiddenListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.AppHiddenListener.appHidden(com.apple.eawt.AppEvent$AppHiddenEvent)

    public native void __appHidden( long __swiftObject, com.apple.eawt.AppEvent.AppHiddenEvent arg0 );

    public void appHidden( com.apple.eawt.AppEvent.AppHiddenEvent arg0 ) {
        __appHidden( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.AppHiddenListener.appUnhidden(com.apple.eawt.AppEvent$AppHiddenEvent)

    public native void __appUnhidden( long __swiftObject, com.apple.eawt.AppEvent.AppHiddenEvent arg0 );

    public void appUnhidden( com.apple.eawt.AppEvent.AppHiddenEvent arg0 ) {
        __appUnhidden( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
