
/// class java.awt.Frame ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class FrameProxy extends java.awt.Frame {

    long __swiftObject;

    /// public java.awt.Frame(java.lang.String,java.awt.GraphicsConfiguration)

    FrameProxy( java.lang.String title, java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( title, gc );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.Frame(java.lang.String) throws java.awt.HeadlessException

    FrameProxy( java.lang.String title , long __swiftObject ) {
        super( title );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.Frame(java.awt.GraphicsConfiguration)

    FrameProxy( java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( gc );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.Frame() throws java.awt.HeadlessException

    FrameProxy( long __swiftObject ) {
        super( );
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
