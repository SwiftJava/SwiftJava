
/// interface com.apple.eawt.event.SwipeListener ///

package org.genie.com_apple;

public class SwipeListenerProxy implements com.apple.eawt.event.SwipeListener {

    long swiftObject;

    SwipeListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.event.SwipeListener.swipedDown(com.apple.eawt.event.SwipeEvent)

    public native void __swipedDown( com.apple.eawt.event.SwipeEvent arg0 );

    public void swipedDown( com.apple.eawt.event.SwipeEvent arg0 ) {
        __swipedDown( arg0 );
    }

    /// public abstract void com.apple.eawt.event.SwipeListener.swipedLeft(com.apple.eawt.event.SwipeEvent)

    public native void __swipedLeft( com.apple.eawt.event.SwipeEvent arg0 );

    public void swipedLeft( com.apple.eawt.event.SwipeEvent arg0 ) {
        __swipedLeft( arg0 );
    }

    /// public abstract void com.apple.eawt.event.SwipeListener.swipedRight(com.apple.eawt.event.SwipeEvent)

    public native void __swipedRight( com.apple.eawt.event.SwipeEvent arg0 );

    public void swipedRight( com.apple.eawt.event.SwipeEvent arg0 ) {
        __swipedRight( arg0 );
    }

    /// public abstract void com.apple.eawt.event.SwipeListener.swipedUp(com.apple.eawt.event.SwipeEvent)

    public native void __swipedUp( com.apple.eawt.event.SwipeEvent arg0 );

    public void swipedUp( com.apple.eawt.event.SwipeEvent arg0 ) {
        __swipedUp( arg0 );
    }

}
