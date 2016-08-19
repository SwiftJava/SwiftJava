
/// class java.awt.Dialog ///

package org.genie.java_awt;

public class DialogProxy extends java.awt.Dialog {

    long swiftObject;

    /// public java.awt.Dialog(java.awt.Window,java.lang.String)

    DialogProxy( java.awt.Window arg0, java.lang.String arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Window)

    DialogProxy( java.awt.Window arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Dialog,java.lang.String,boolean,java.awt.GraphicsConfiguration)

    DialogProxy( java.awt.Dialog arg0, java.lang.String arg1, boolean arg2, java.awt.GraphicsConfiguration arg3 , long swiftObject ) {
        super( arg0, arg1, arg2, arg3 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Dialog,java.lang.String,boolean)

    DialogProxy( java.awt.Dialog arg0, java.lang.String arg1, boolean arg2 , long swiftObject ) {
        super( arg0, arg1, arg2 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Window,java.awt.Dialog$ModalityType)

    DialogProxy( java.awt.Window arg0, java.awt.Dialog.ModalityType arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Window,java.lang.String,java.awt.Dialog$ModalityType)

    DialogProxy( java.awt.Window arg0, java.lang.String arg1, java.awt.Dialog.ModalityType arg2 , long swiftObject ) {
        super( arg0, arg1, arg2 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Window,java.lang.String,java.awt.Dialog$ModalityType,java.awt.GraphicsConfiguration)

    DialogProxy( java.awt.Window arg0, java.lang.String arg1, java.awt.Dialog.ModalityType arg2, java.awt.GraphicsConfiguration arg3 , long swiftObject ) {
        super( arg0, arg1, arg2, arg3 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Frame,java.lang.String,boolean)

    DialogProxy( java.awt.Frame arg0, java.lang.String arg1, boolean arg2 , long swiftObject ) {
        super( arg0, arg1, arg2 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Frame,java.lang.String)

    DialogProxy( java.awt.Frame arg0, java.lang.String arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Frame,boolean)

    DialogProxy( java.awt.Frame arg0, boolean arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Frame)

    DialogProxy( java.awt.Frame arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Dialog,java.lang.String)

    DialogProxy( java.awt.Dialog arg0, java.lang.String arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Dialog)

    DialogProxy( java.awt.Dialog arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Dialog(java.awt.Frame,java.lang.String,boolean,java.awt.GraphicsConfiguration)

    DialogProxy( java.awt.Frame arg0, java.lang.String arg1, boolean arg2, java.awt.GraphicsConfiguration arg3 , long swiftObject ) {
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
