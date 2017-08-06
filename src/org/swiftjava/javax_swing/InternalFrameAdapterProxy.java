
/// class javax.swing.event.InternalFrameAdapter ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class InternalFrameAdapterProxy extends javax.swing.event.InternalFrameAdapter {

    long __swiftObject;

    /// public javax.swing.event.InternalFrameAdapter()

    InternalFrameAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void javax.swing.event.InternalFrameAdapter.internalFrameOpened(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameOpened( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    boolean entered_internalFrameOpened_0;

    public void internalFrameOpened( javax.swing.event.InternalFrameEvent e ) {
        if ( !entered_internalFrameOpened_0 ) {
            entered_internalFrameOpened_0 = true;
            __internalFrameOpened( __swiftObject, e);
            entered_internalFrameOpened_0 = false;
        }
        else
            super.internalFrameOpened( e );
    }

    /// public void javax.swing.event.InternalFrameAdapter.internalFrameClosing(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameClosing( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    boolean entered_internalFrameClosing_1;

    public void internalFrameClosing( javax.swing.event.InternalFrameEvent e ) {
        if ( !entered_internalFrameClosing_1 ) {
            entered_internalFrameClosing_1 = true;
            __internalFrameClosing( __swiftObject, e);
            entered_internalFrameClosing_1 = false;
        }
        else
            super.internalFrameClosing( e );
    }

    /// public void javax.swing.event.InternalFrameAdapter.internalFrameClosed(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameClosed( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    boolean entered_internalFrameClosed_2;

    public void internalFrameClosed( javax.swing.event.InternalFrameEvent e ) {
        if ( !entered_internalFrameClosed_2 ) {
            entered_internalFrameClosed_2 = true;
            __internalFrameClosed( __swiftObject, e);
            entered_internalFrameClosed_2 = false;
        }
        else
            super.internalFrameClosed( e );
    }

    /// public void javax.swing.event.InternalFrameAdapter.internalFrameIconified(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameIconified( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    boolean entered_internalFrameIconified_3;

    public void internalFrameIconified( javax.swing.event.InternalFrameEvent e ) {
        if ( !entered_internalFrameIconified_3 ) {
            entered_internalFrameIconified_3 = true;
            __internalFrameIconified( __swiftObject, e);
            entered_internalFrameIconified_3 = false;
        }
        else
            super.internalFrameIconified( e );
    }

    /// public void javax.swing.event.InternalFrameAdapter.internalFrameDeiconified(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameDeiconified( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    boolean entered_internalFrameDeiconified_4;

    public void internalFrameDeiconified( javax.swing.event.InternalFrameEvent e ) {
        if ( !entered_internalFrameDeiconified_4 ) {
            entered_internalFrameDeiconified_4 = true;
            __internalFrameDeiconified( __swiftObject, e);
            entered_internalFrameDeiconified_4 = false;
        }
        else
            super.internalFrameDeiconified( e );
    }

    /// public void javax.swing.event.InternalFrameAdapter.internalFrameActivated(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameActivated( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    boolean entered_internalFrameActivated_5;

    public void internalFrameActivated( javax.swing.event.InternalFrameEvent e ) {
        if ( !entered_internalFrameActivated_5 ) {
            entered_internalFrameActivated_5 = true;
            __internalFrameActivated( __swiftObject, e);
            entered_internalFrameActivated_5 = false;
        }
        else
            super.internalFrameActivated( e );
    }

    /// public void javax.swing.event.InternalFrameAdapter.internalFrameDeactivated(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameDeactivated( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    boolean entered_internalFrameDeactivated_6;

    public void internalFrameDeactivated( javax.swing.event.InternalFrameEvent e ) {
        if ( !entered_internalFrameDeactivated_6 ) {
            entered_internalFrameDeactivated_6 = true;
            __internalFrameDeactivated( __swiftObject, e);
            entered_internalFrameDeactivated_6 = false;
        }
        else
            super.internalFrameDeactivated( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_7;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_7 ) {
            entered_equals_7 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_7 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_8;

    public java.lang.String toString() {
        if ( !entered_toString_8 ) {
            entered_toString_8 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_8 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_9;

    public int hashCode() {
        if ( !entered_hashCode_9 ) {
            entered_hashCode_9 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_9 = false;
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
