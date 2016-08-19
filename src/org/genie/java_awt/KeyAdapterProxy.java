
/// class java.awt.event.KeyAdapter ///

package org.genie.java_awt;

public class KeyAdapterProxy extends java.awt.event.KeyAdapter {

    long swiftObject;

    /// public java.awt.event.KeyAdapter()

    KeyAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.event.KeyAdapter.keyTyped(java.awt.event.KeyEvent)

    public native void __keyTyped( java.awt.event.KeyEvent e );

    boolean entered_keyTyped_0;

    public void keyTyped( java.awt.event.KeyEvent e ) {
        if ( !entered_keyTyped_0 ) {
            entered_keyTyped_0 = true;
            __keyTyped( e );
            entered_keyTyped_0 = false;
        }
        else
            super.keyTyped( e );
    }

    /// public void java.awt.event.KeyAdapter.keyPressed(java.awt.event.KeyEvent)

    public native void __keyPressed( java.awt.event.KeyEvent e );

    boolean entered_keyPressed_1;

    public void keyPressed( java.awt.event.KeyEvent e ) {
        if ( !entered_keyPressed_1 ) {
            entered_keyPressed_1 = true;
            __keyPressed( e );
            entered_keyPressed_1 = false;
        }
        else
            super.keyPressed( e );
    }

    /// public void java.awt.event.KeyAdapter.keyReleased(java.awt.event.KeyEvent)

    public native void __keyReleased( java.awt.event.KeyEvent e );

    boolean entered_keyReleased_2;

    public void keyReleased( java.awt.event.KeyEvent e ) {
        if ( !entered_keyReleased_2 ) {
            entered_keyReleased_2 = true;
            __keyReleased( e );
            entered_keyReleased_2 = false;
        }
        else
            super.keyReleased( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_3;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_3 ) {
            entered_equals_3 = true;
            boolean __return = __equals( arg0 );
            entered_equals_3 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_4;

    public java.lang.String toString() {
        if ( !entered_toString_4 ) {
            entered_toString_4 = true;
            java.lang.String __return = __toString( );
            entered_toString_4 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_5;

    public int hashCode() {
        if ( !entered_hashCode_5 ) {
            entered_hashCode_5 = true;
            int __return = __hashCode( );
            entered_hashCode_5 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
