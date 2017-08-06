
/// interface com.apple.eawt.AppReOpenedListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class AppReOpenedListenerProxy implements com.apple.eawt.AppReOpenedListener {

    long __swiftObject;

    AppReOpenedListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.AppReOpenedListener.appReOpened(com.apple.eawt.AppEvent$AppReOpenedEvent)

    public native void __appReOpened( long __swiftObject, com.apple.eawt.AppEvent.AppReOpenedEvent arg0 );

    public void appReOpened( com.apple.eawt.AppEvent.AppReOpenedEvent arg0 ) {
        __appReOpened( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
