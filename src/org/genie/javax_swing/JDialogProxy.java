
/// class javax.swing.JDialog ///

package org.genie.javax_swing;

public class JDialogProxy extends javax.swing.JDialog {

    long swiftObject;

    /// public javax.swing.JDialog()

    JDialogProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame)

    JDialogProxy( java.awt.Frame arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame,boolean)

    JDialogProxy( java.awt.Frame arg0, boolean arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame,java.lang.String)

    JDialogProxy( java.awt.Frame arg0, java.lang.String arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame,java.lang.String,boolean)

    JDialogProxy( java.awt.Frame arg0, java.lang.String arg1, boolean arg2 , long swiftObject ) {
        super( arg0, arg1, arg2 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame,java.lang.String,boolean,java.awt.GraphicsConfiguration)

    JDialogProxy( java.awt.Frame arg0, java.lang.String arg1, boolean arg2, java.awt.GraphicsConfiguration arg3 , long swiftObject ) {
        super( arg0, arg1, arg2, arg3 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog)

    JDialogProxy( java.awt.Dialog arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog,boolean)

    JDialogProxy( java.awt.Dialog arg0, boolean arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog,java.lang.String)

    JDialogProxy( java.awt.Dialog arg0, java.lang.String arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog,java.lang.String,boolean)

    JDialogProxy( java.awt.Dialog arg0, java.lang.String arg1, boolean arg2 , long swiftObject ) {
        super( arg0, arg1, arg2 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog,java.lang.String,boolean,java.awt.GraphicsConfiguration)

    JDialogProxy( java.awt.Dialog arg0, java.lang.String arg1, boolean arg2, java.awt.GraphicsConfiguration arg3 , long swiftObject ) {
        super( arg0, arg1, arg2, arg3 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window)

    JDialogProxy( java.awt.Window arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window,java.awt.Dialog$ModalityType)

    JDialogProxy( java.awt.Window arg0, java.awt.Dialog.ModalityType arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window,java.lang.String)

    JDialogProxy( java.awt.Window arg0, java.lang.String arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window,java.lang.String,java.awt.Dialog$ModalityType)

    JDialogProxy( java.awt.Window arg0, java.lang.String arg1, java.awt.Dialog.ModalityType arg2 , long swiftObject ) {
        super( arg0, arg1, arg2 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window,java.lang.String,java.awt.Dialog$ModalityType,java.awt.GraphicsConfiguration)

    JDialogProxy( java.awt.Window arg0, java.lang.String arg1, java.awt.Dialog.ModalityType arg2, java.awt.GraphicsConfiguration arg3 , long swiftObject ) {
        super( arg0, arg1, arg2, arg3 );
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
