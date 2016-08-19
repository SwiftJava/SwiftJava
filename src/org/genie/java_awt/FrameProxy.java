
/// class java.awt.Frame ///

package org.genie.java_awt;

public class FrameProxy extends java.awt.Frame {

    long swiftObject;

    /// public java.awt.Frame(java.lang.String,java.awt.GraphicsConfiguration)

    FrameProxy( java.lang.String title, java.awt.GraphicsConfiguration gc , long swiftObject ) {
        super( title, gc );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Frame(java.lang.String) throws java.awt.HeadlessException

    FrameProxy( java.lang.String title , long swiftObject ) {
        super( title );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Frame(java.awt.GraphicsConfiguration)

    FrameProxy( java.awt.GraphicsConfiguration gc , long swiftObject ) {
        super( gc );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Frame() throws java.awt.HeadlessException

    FrameProxy( long swiftObject ) {
        super( );
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
