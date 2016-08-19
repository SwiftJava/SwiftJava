
/// interface com.apple.eawt.FullScreenListener ///

package org.genie.com_apple;

public class FullScreenListenerProxy implements com.apple.eawt.FullScreenListener {

    long swiftObject;

    FullScreenListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.FullScreenListener.windowEnteringFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowEnteringFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    public void windowEnteringFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        __windowEnteringFullScreen( arg0 );
    }

    /// public abstract void com.apple.eawt.FullScreenListener.windowEnteredFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowEnteredFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    public void windowEnteredFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        __windowEnteredFullScreen( arg0 );
    }

    /// public abstract void com.apple.eawt.FullScreenListener.windowExitingFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowExitingFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    public void windowExitingFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        __windowExitingFullScreen( arg0 );
    }

    /// public abstract void com.apple.eawt.FullScreenListener.windowExitedFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowExitedFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    public void windowExitedFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        __windowExitedFullScreen( arg0 );
    }

}
