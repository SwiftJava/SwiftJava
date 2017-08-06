
/// interface com.apple.eawt.AppEventListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class AppEventListenerProxy implements com.apple.eawt.AppEventListener {

    long __swiftObject;

    AppEventListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
