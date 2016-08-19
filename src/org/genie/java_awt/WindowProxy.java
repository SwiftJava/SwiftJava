
/// class java.awt.Window ///

package org.genie.java_awt;

public class WindowProxy extends java.awt.Window {

    long swiftObject;

    /// public java.awt.Window(java.awt.Frame)

    WindowProxy( java.awt.Frame arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Window(java.awt.Window)

    WindowProxy( java.awt.Window arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Window(java.awt.Window,java.awt.GraphicsConfiguration)

    WindowProxy( java.awt.Window arg0, java.awt.GraphicsConfiguration arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// java.awt.Window(java.awt.GraphicsConfiguration)

    /// java.awt.Window() throws java.awt.HeadlessException

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
