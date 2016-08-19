
/// class java.awt.event.MouseMotionAdapter ///

package org.genie.java_awt;

public class MouseMotionAdapterProxy extends java.awt.event.MouseMotionAdapter {

    long swiftObject;

    /// public java.awt.event.MouseMotionAdapter()

    MouseMotionAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.event.MouseMotionAdapter.mouseMoved(java.awt.event.MouseEvent)

    public native void __mouseMoved( java.awt.event.MouseEvent e );

    boolean entered_mouseMoved_0;

    public void mouseMoved( java.awt.event.MouseEvent e ) {
        if ( !entered_mouseMoved_0 ) {
            entered_mouseMoved_0 = true;
            __mouseMoved( e );
            entered_mouseMoved_0 = false;
        }
        else
            super.mouseMoved( e );
    }

    /// public void java.awt.event.MouseMotionAdapter.mouseDragged(java.awt.event.MouseEvent)

    public native void __mouseDragged( java.awt.event.MouseEvent e );

    boolean entered_mouseDragged_1;

    public void mouseDragged( java.awt.event.MouseEvent e ) {
        if ( !entered_mouseDragged_1 ) {
            entered_mouseDragged_1 = true;
            __mouseDragged( e );
            entered_mouseDragged_1 = false;
        }
        else
            super.mouseDragged( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_2;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_2 ) {
            entered_equals_2 = true;
            boolean __return = __equals( arg0 );
            entered_equals_2 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_3;

    public java.lang.String toString() {
        if ( !entered_toString_3 ) {
            entered_toString_3 = true;
            java.lang.String __return = __toString( );
            entered_toString_3 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_4;

    public int hashCode() {
        if ( !entered_hashCode_4 ) {
            entered_hashCode_4 = true;
            int __return = __hashCode( );
            entered_hashCode_4 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
