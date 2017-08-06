
/// class javax.swing.JDialog ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class JDialogProxy extends javax.swing.JDialog {

    long __swiftObject;

    /// public javax.swing.JDialog(java.awt.Window)

    JDialogProxy( java.awt.Window owner , long __swiftObject ) {
        super( owner );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog,java.lang.String,boolean,java.awt.GraphicsConfiguration)

    JDialogProxy( java.awt.Dialog owner, java.lang.String title, boolean modal, java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( owner, title, modal, gc );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog,java.lang.String,boolean)

    JDialogProxy( java.awt.Dialog owner, java.lang.String title, boolean modal , long __swiftObject ) {
        super( owner, title, modal );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog,java.lang.String)

    JDialogProxy( java.awt.Dialog owner, java.lang.String title , long __swiftObject ) {
        super( owner, title );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window,java.lang.String,java.awt.Dialog$ModalityType,java.awt.GraphicsConfiguration)

    JDialogProxy( java.awt.Window owner, java.lang.String title, java.awt.Dialog.ModalityType modalityType, java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( owner, title, modalityType, gc );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window,java.lang.String,java.awt.Dialog$ModalityType)

    JDialogProxy( java.awt.Window owner, java.lang.String title, java.awt.Dialog.ModalityType modalityType , long __swiftObject ) {
        super( owner, title, modalityType );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window,java.lang.String)

    JDialogProxy( java.awt.Window owner, java.lang.String title , long __swiftObject ) {
        super( owner, title );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Window,java.awt.Dialog$ModalityType)

    JDialogProxy( java.awt.Window owner, java.awt.Dialog.ModalityType modalityType , long __swiftObject ) {
        super( owner, modalityType );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame,java.lang.String)

    JDialogProxy( java.awt.Frame owner, java.lang.String title , long __swiftObject ) {
        super( owner, title );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame,boolean)

    JDialogProxy( java.awt.Frame owner, boolean modal , long __swiftObject ) {
        super( owner, modal );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame)

    JDialogProxy( java.awt.Frame owner , long __swiftObject ) {
        super( owner );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog()

    JDialogProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog,boolean)

    JDialogProxy( java.awt.Dialog owner, boolean modal , long __swiftObject ) {
        super( owner, modal );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Dialog)

    JDialogProxy( java.awt.Dialog owner , long __swiftObject ) {
        super( owner );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame,java.lang.String,boolean,java.awt.GraphicsConfiguration)

    JDialogProxy( java.awt.Frame owner, java.lang.String title, boolean modal, java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( owner, title, modal, gc );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JDialog(java.awt.Frame,java.lang.String,boolean)

    JDialogProxy( java.awt.Frame owner, java.lang.String title, boolean modal , long __swiftObject ) {
        super( owner, title, modal );
        this.__swiftObject = __swiftObject;
    }

    /// public void java.awt.Window.paint(java.awt.Graphics)

    public native void __paint( long __swiftObject, java.awt.Graphics arg0 );

    boolean entered_paint_0;

    public void paint( java.awt.Graphics arg0 ) {
        if ( !entered_paint_0 ) {
            entered_paint_0 = true;
            __paint( __swiftObject, arg0);
            entered_paint_0 = false;
        }
        else
            super.paint( arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
