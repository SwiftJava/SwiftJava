
/// class com.apple.eawt.event.GestureAdapter ///

package org.genie.com_apple;

public class GestureAdapterProxy extends com.apple.eawt.event.GestureAdapter {

    long swiftObject;

    /// public com.apple.eawt.event.GestureAdapter()

    GestureAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void com.apple.eawt.event.GestureAdapter.rotate(com.apple.eawt.event.RotationEvent)

    public native void __rotate( com.apple.eawt.event.RotationEvent arg0 );

    boolean entered_rotate_0;

    public void rotate( com.apple.eawt.event.RotationEvent arg0 ) {
        if ( !entered_rotate_0 ) {
            entered_rotate_0 = true;
            __rotate( arg0 );
            entered_rotate_0 = false;
        }
        else
            super.rotate( arg0 );
    }

    /// public void com.apple.eawt.event.GestureAdapter.gestureBegan(com.apple.eawt.event.GesturePhaseEvent)

    public native void __gestureBegan( com.apple.eawt.event.GesturePhaseEvent arg0 );

    boolean entered_gestureBegan_1;

    public void gestureBegan( com.apple.eawt.event.GesturePhaseEvent arg0 ) {
        if ( !entered_gestureBegan_1 ) {
            entered_gestureBegan_1 = true;
            __gestureBegan( arg0 );
            entered_gestureBegan_1 = false;
        }
        else
            super.gestureBegan( arg0 );
    }

    /// public void com.apple.eawt.event.GestureAdapter.gestureEnded(com.apple.eawt.event.GesturePhaseEvent)

    public native void __gestureEnded( com.apple.eawt.event.GesturePhaseEvent arg0 );

    boolean entered_gestureEnded_2;

    public void gestureEnded( com.apple.eawt.event.GesturePhaseEvent arg0 ) {
        if ( !entered_gestureEnded_2 ) {
            entered_gestureEnded_2 = true;
            __gestureEnded( arg0 );
            entered_gestureEnded_2 = false;
        }
        else
            super.gestureEnded( arg0 );
    }

    /// public void com.apple.eawt.event.GestureAdapter.magnify(com.apple.eawt.event.MagnificationEvent)

    public native void __magnify( com.apple.eawt.event.MagnificationEvent arg0 );

    boolean entered_magnify_3;

    public void magnify( com.apple.eawt.event.MagnificationEvent arg0 ) {
        if ( !entered_magnify_3 ) {
            entered_magnify_3 = true;
            __magnify( arg0 );
            entered_magnify_3 = false;
        }
        else
            super.magnify( arg0 );
    }

    /// public void com.apple.eawt.event.GestureAdapter.swipedDown(com.apple.eawt.event.SwipeEvent)

    public native void __swipedDown( com.apple.eawt.event.SwipeEvent arg0 );

    boolean entered_swipedDown_4;

    public void swipedDown( com.apple.eawt.event.SwipeEvent arg0 ) {
        if ( !entered_swipedDown_4 ) {
            entered_swipedDown_4 = true;
            __swipedDown( arg0 );
            entered_swipedDown_4 = false;
        }
        else
            super.swipedDown( arg0 );
    }

    /// public void com.apple.eawt.event.GestureAdapter.swipedLeft(com.apple.eawt.event.SwipeEvent)

    public native void __swipedLeft( com.apple.eawt.event.SwipeEvent arg0 );

    boolean entered_swipedLeft_5;

    public void swipedLeft( com.apple.eawt.event.SwipeEvent arg0 ) {
        if ( !entered_swipedLeft_5 ) {
            entered_swipedLeft_5 = true;
            __swipedLeft( arg0 );
            entered_swipedLeft_5 = false;
        }
        else
            super.swipedLeft( arg0 );
    }

    /// public void com.apple.eawt.event.GestureAdapter.swipedRight(com.apple.eawt.event.SwipeEvent)

    public native void __swipedRight( com.apple.eawt.event.SwipeEvent arg0 );

    boolean entered_swipedRight_6;

    public void swipedRight( com.apple.eawt.event.SwipeEvent arg0 ) {
        if ( !entered_swipedRight_6 ) {
            entered_swipedRight_6 = true;
            __swipedRight( arg0 );
            entered_swipedRight_6 = false;
        }
        else
            super.swipedRight( arg0 );
    }

    /// public void com.apple.eawt.event.GestureAdapter.swipedUp(com.apple.eawt.event.SwipeEvent)

    public native void __swipedUp( com.apple.eawt.event.SwipeEvent arg0 );

    boolean entered_swipedUp_7;

    public void swipedUp( com.apple.eawt.event.SwipeEvent arg0 ) {
        if ( !entered_swipedUp_7 ) {
            entered_swipedUp_7 = true;
            __swipedUp( arg0 );
            entered_swipedUp_7 = false;
        }
        else
            super.swipedUp( arg0 );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_8;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_8 ) {
            entered_equals_8 = true;
            boolean __return = __equals( arg0 );
            entered_equals_8 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_9;

    public java.lang.String toString() {
        if ( !entered_toString_9 ) {
            entered_toString_9 = true;
            java.lang.String __return = __toString( );
            entered_toString_9 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_10;

    public int hashCode() {
        if ( !entered_hashCode_10 ) {
            entered_hashCode_10 = true;
            int __return = __hashCode( );
            entered_hashCode_10 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
