
/// class com.apple.eawt.FullScreenAdapter ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class FullScreenAdapterProxy extends com.apple.eawt.FullScreenAdapter {

    long __swiftObject;

    /// public com.apple.eawt.FullScreenAdapter()

    FullScreenAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void com.apple.eawt.FullScreenAdapter.windowEnteringFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowEnteringFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    boolean entered_windowEnteringFullScreen_0;

    public void windowEnteringFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        if ( !entered_windowEnteringFullScreen_0 ) {
            entered_windowEnteringFullScreen_0 = true;
            __windowEnteringFullScreen( __swiftObject, arg0);
            entered_windowEnteringFullScreen_0 = false;
        }
        else
            super.windowEnteringFullScreen( arg0 );
    }

    /// public void com.apple.eawt.FullScreenAdapter.windowEnteredFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowEnteredFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    boolean entered_windowEnteredFullScreen_1;

    public void windowEnteredFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        if ( !entered_windowEnteredFullScreen_1 ) {
            entered_windowEnteredFullScreen_1 = true;
            __windowEnteredFullScreen( __swiftObject, arg0);
            entered_windowEnteredFullScreen_1 = false;
        }
        else
            super.windowEnteredFullScreen( arg0 );
    }

    /// public void com.apple.eawt.FullScreenAdapter.windowExitingFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowExitingFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    boolean entered_windowExitingFullScreen_2;

    public void windowExitingFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        if ( !entered_windowExitingFullScreen_2 ) {
            entered_windowExitingFullScreen_2 = true;
            __windowExitingFullScreen( __swiftObject, arg0);
            entered_windowExitingFullScreen_2 = false;
        }
        else
            super.windowExitingFullScreen( arg0 );
    }

    /// public void com.apple.eawt.FullScreenAdapter.windowExitedFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowExitedFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    boolean entered_windowExitedFullScreen_3;

    public void windowExitedFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        if ( !entered_windowExitedFullScreen_3 ) {
            entered_windowExitedFullScreen_3 = true;
            __windowExitedFullScreen( __swiftObject, arg0);
            entered_windowExitedFullScreen_3 = false;
        }
        else
            super.windowExitedFullScreen( arg0 );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_4;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_4 ) {
            entered_equals_4 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_4 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_5;

    public java.lang.String toString() {
        if ( !entered_toString_5 ) {
            entered_toString_5 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_5 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_6;

    public int hashCode() {
        if ( !entered_hashCode_6 ) {
            entered_hashCode_6 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_6 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
