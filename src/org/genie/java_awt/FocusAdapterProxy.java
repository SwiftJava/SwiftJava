
/// class java.awt.event.FocusAdapter ///

package org.genie.java_awt;

public class FocusAdapterProxy extends java.awt.event.FocusAdapter {

    long swiftObject;

    /// public java.awt.event.FocusAdapter()

    FocusAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.event.FocusAdapter.focusGained(java.awt.event.FocusEvent)

    public native void __focusGained( java.awt.event.FocusEvent e );

    boolean entered_focusGained_0;

    public void focusGained( java.awt.event.FocusEvent e ) {
        if ( !entered_focusGained_0 ) {
            entered_focusGained_0 = true;
            __focusGained( e );
            entered_focusGained_0 = false;
        }
        else
            super.focusGained( e );
    }

    /// public void java.awt.event.FocusAdapter.focusLost(java.awt.event.FocusEvent)

    public native void __focusLost( java.awt.event.FocusEvent e );

    boolean entered_focusLost_1;

    public void focusLost( java.awt.event.FocusEvent e ) {
        if ( !entered_focusLost_1 ) {
            entered_focusLost_1 = true;
            __focusLost( e );
            entered_focusLost_1 = false;
        }
        else
            super.focusLost( e );
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
