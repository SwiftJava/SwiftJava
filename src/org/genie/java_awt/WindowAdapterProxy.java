
/// class java.awt.event.WindowAdapter ///

package org.genie.java_awt;

public class WindowAdapterProxy extends java.awt.event.WindowAdapter {

    long swiftObject;

    /// public java.awt.event.WindowAdapter()

    WindowAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.event.WindowAdapter.windowOpened(java.awt.event.WindowEvent)

    public native void __windowOpened( java.awt.event.WindowEvent e );

    boolean entered_windowOpened_0;

    public void windowOpened( java.awt.event.WindowEvent e ) {
        if ( !entered_windowOpened_0 ) {
            entered_windowOpened_0 = true;
            __windowOpened( e );
            entered_windowOpened_0 = false;
        }
        else
            super.windowOpened( e );
    }

    /// public void java.awt.event.WindowAdapter.windowClosing(java.awt.event.WindowEvent)

    public native void __windowClosing( java.awt.event.WindowEvent e );

    boolean entered_windowClosing_1;

    public void windowClosing( java.awt.event.WindowEvent e ) {
        if ( !entered_windowClosing_1 ) {
            entered_windowClosing_1 = true;
            __windowClosing( e );
            entered_windowClosing_1 = false;
        }
        else
            super.windowClosing( e );
    }

    /// public void java.awt.event.WindowAdapter.windowClosed(java.awt.event.WindowEvent)

    public native void __windowClosed( java.awt.event.WindowEvent e );

    boolean entered_windowClosed_2;

    public void windowClosed( java.awt.event.WindowEvent e ) {
        if ( !entered_windowClosed_2 ) {
            entered_windowClosed_2 = true;
            __windowClosed( e );
            entered_windowClosed_2 = false;
        }
        else
            super.windowClosed( e );
    }

    /// public void java.awt.event.WindowAdapter.windowIconified(java.awt.event.WindowEvent)

    public native void __windowIconified( java.awt.event.WindowEvent e );

    boolean entered_windowIconified_3;

    public void windowIconified( java.awt.event.WindowEvent e ) {
        if ( !entered_windowIconified_3 ) {
            entered_windowIconified_3 = true;
            __windowIconified( e );
            entered_windowIconified_3 = false;
        }
        else
            super.windowIconified( e );
    }

    /// public void java.awt.event.WindowAdapter.windowDeiconified(java.awt.event.WindowEvent)

    public native void __windowDeiconified( java.awt.event.WindowEvent e );

    boolean entered_windowDeiconified_4;

    public void windowDeiconified( java.awt.event.WindowEvent e ) {
        if ( !entered_windowDeiconified_4 ) {
            entered_windowDeiconified_4 = true;
            __windowDeiconified( e );
            entered_windowDeiconified_4 = false;
        }
        else
            super.windowDeiconified( e );
    }

    /// public void java.awt.event.WindowAdapter.windowActivated(java.awt.event.WindowEvent)

    public native void __windowActivated( java.awt.event.WindowEvent e );

    boolean entered_windowActivated_5;

    public void windowActivated( java.awt.event.WindowEvent e ) {
        if ( !entered_windowActivated_5 ) {
            entered_windowActivated_5 = true;
            __windowActivated( e );
            entered_windowActivated_5 = false;
        }
        else
            super.windowActivated( e );
    }

    /// public void java.awt.event.WindowAdapter.windowDeactivated(java.awt.event.WindowEvent)

    public native void __windowDeactivated( java.awt.event.WindowEvent e );

    boolean entered_windowDeactivated_6;

    public void windowDeactivated( java.awt.event.WindowEvent e ) {
        if ( !entered_windowDeactivated_6 ) {
            entered_windowDeactivated_6 = true;
            __windowDeactivated( e );
            entered_windowDeactivated_6 = false;
        }
        else
            super.windowDeactivated( e );
    }

    /// public void java.awt.event.WindowAdapter.windowGainedFocus(java.awt.event.WindowEvent)

    public native void __windowGainedFocus( java.awt.event.WindowEvent e );

    boolean entered_windowGainedFocus_7;

    public void windowGainedFocus( java.awt.event.WindowEvent e ) {
        if ( !entered_windowGainedFocus_7 ) {
            entered_windowGainedFocus_7 = true;
            __windowGainedFocus( e );
            entered_windowGainedFocus_7 = false;
        }
        else
            super.windowGainedFocus( e );
    }

    /// public void java.awt.event.WindowAdapter.windowLostFocus(java.awt.event.WindowEvent)

    public native void __windowLostFocus( java.awt.event.WindowEvent e );

    boolean entered_windowLostFocus_8;

    public void windowLostFocus( java.awt.event.WindowEvent e ) {
        if ( !entered_windowLostFocus_8 ) {
            entered_windowLostFocus_8 = true;
            __windowLostFocus( e );
            entered_windowLostFocus_8 = false;
        }
        else
            super.windowLostFocus( e );
    }

    /// public void java.awt.event.WindowAdapter.windowStateChanged(java.awt.event.WindowEvent)

    public native void __windowStateChanged( java.awt.event.WindowEvent e );

    boolean entered_windowStateChanged_9;

    public void windowStateChanged( java.awt.event.WindowEvent e ) {
        if ( !entered_windowStateChanged_9 ) {
            entered_windowStateChanged_9 = true;
            __windowStateChanged( e );
            entered_windowStateChanged_9 = false;
        }
        else
            super.windowStateChanged( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_10;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_10 ) {
            entered_equals_10 = true;
            boolean __return = __equals( arg0 );
            entered_equals_10 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_11;

    public java.lang.String toString() {
        if ( !entered_toString_11 ) {
            entered_toString_11 = true;
            java.lang.String __return = __toString( );
            entered_toString_11 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_12;

    public int hashCode() {
        if ( !entered_hashCode_12 ) {
            entered_hashCode_12 = true;
            int __return = __hashCode( );
            entered_hashCode_12 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
