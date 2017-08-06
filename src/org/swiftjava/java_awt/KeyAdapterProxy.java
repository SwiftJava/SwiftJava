
/// class java.awt.event.KeyAdapter ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class KeyAdapterProxy extends java.awt.event.KeyAdapter {

    long __swiftObject;

    /// public java.awt.event.KeyAdapter()

    KeyAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void java.awt.event.KeyAdapter.keyTyped(java.awt.event.KeyEvent)

    public native void __keyTyped( long __swiftObject, java.awt.event.KeyEvent e );

    boolean entered_keyTyped_0;

    public void keyTyped( java.awt.event.KeyEvent e ) {
        if ( !entered_keyTyped_0 ) {
            entered_keyTyped_0 = true;
            __keyTyped( __swiftObject, e);
            entered_keyTyped_0 = false;
        }
        else
            super.keyTyped( e );
    }

    /// public void java.awt.event.KeyAdapter.keyPressed(java.awt.event.KeyEvent)

    public native void __keyPressed( long __swiftObject, java.awt.event.KeyEvent e );

    boolean entered_keyPressed_1;

    public void keyPressed( java.awt.event.KeyEvent e ) {
        if ( !entered_keyPressed_1 ) {
            entered_keyPressed_1 = true;
            __keyPressed( __swiftObject, e);
            entered_keyPressed_1 = false;
        }
        else
            super.keyPressed( e );
    }

    /// public void java.awt.event.KeyAdapter.keyReleased(java.awt.event.KeyEvent)

    public native void __keyReleased( long __swiftObject, java.awt.event.KeyEvent e );

    boolean entered_keyReleased_2;

    public void keyReleased( java.awt.event.KeyEvent e ) {
        if ( !entered_keyReleased_2 ) {
            entered_keyReleased_2 = true;
            __keyReleased( __swiftObject, e);
            entered_keyReleased_2 = false;
        }
        else
            super.keyReleased( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_3;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_3 ) {
            entered_equals_3 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_3 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_4;

    public java.lang.String toString() {
        if ( !entered_toString_4 ) {
            entered_toString_4 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_4 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_5;

    public int hashCode() {
        if ( !entered_hashCode_5 ) {
            entered_hashCode_5 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_5 = false;
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
