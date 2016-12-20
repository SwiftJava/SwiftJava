
/// class javax.swing.JWindow ///

package org.genie.javax_swing;

public class JWindowProxy extends javax.swing.JWindow {

    long swiftObject;

    /// public javax.swing.JWindow()

    JWindowProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JWindow(java.awt.GraphicsConfiguration)

    JWindowProxy( java.awt.GraphicsConfiguration arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JWindow(java.awt.Frame)

    JWindowProxy( java.awt.Frame arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JWindow(java.awt.Window)

    JWindowProxy( java.awt.Window arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JWindow(java.awt.Window,java.awt.GraphicsConfiguration)

    JWindowProxy( java.awt.Window arg0, java.awt.GraphicsConfiguration arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.Window.paint(java.awt.Graphics)

    public native void __paint( java.awt.Graphics arg0 );

    boolean entered_paint_0;

    public void paint( java.awt.Graphics arg0 ) {
        if ( !entered_paint_0 ) {
            entered_paint_0 = true;
            __paint( arg0 );
            entered_paint_0 = false;
        }
        else
            super.paint( arg0 );
    }

}
