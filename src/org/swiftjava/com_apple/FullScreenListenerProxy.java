
/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// interface com.apple.eawt.FullScreenListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class FullScreenListenerProxy implements com.apple.eawt.FullScreenListener {

    // address of proxy object
    long __swiftObject;

    FullScreenListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.FullScreenListener.windowEnteredFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowEnteredFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    public void windowEnteredFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        __windowEnteredFullScreen( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.FullScreenListener.windowEnteringFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowEnteringFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    public void windowEnteringFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        __windowEnteringFullScreen( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.FullScreenListener.windowExitedFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowExitedFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    public void windowExitedFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        __windowExitedFullScreen( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.FullScreenListener.windowExitingFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowExitingFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    public void windowExitingFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        __windowExitingFullScreen( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}