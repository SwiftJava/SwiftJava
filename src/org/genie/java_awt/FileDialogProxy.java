
/// class java.awt.FileDialog ///

package org.genie.java_awt;

public class FileDialogProxy extends java.awt.FileDialog {

    long swiftObject;

    /// public java.awt.FileDialog(java.awt.Dialog,java.lang.String)

    FileDialogProxy( java.awt.Dialog parent, java.lang.String title , long swiftObject ) {
        super( parent, title );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Dialog)

    FileDialogProxy( java.awt.Dialog parent , long swiftObject ) {
        super( parent );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Frame,java.lang.String,int)

    FileDialogProxy( java.awt.Frame parent, java.lang.String title, int mode , long swiftObject ) {
        super( parent, title, mode );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Dialog,java.lang.String,int)

    FileDialogProxy( java.awt.Dialog parent, java.lang.String title, int mode , long swiftObject ) {
        super( parent, title, mode );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Frame)

    FileDialogProxy( java.awt.Frame parent , long swiftObject ) {
        super( parent );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Frame,java.lang.String)

    FileDialogProxy( java.awt.Frame parent, java.lang.String title , long swiftObject ) {
        super( parent, title );
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
