
/// class javax.swing.JFrame ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class JFrameProxy extends javax.swing.JFrame {

    long __swiftObject;

    /// public javax.swing.JFrame(java.lang.String,java.awt.GraphicsConfiguration)

    JFrameProxy( java.lang.String title, java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( title, gc );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JFrame(java.lang.String) throws java.awt.HeadlessException

    JFrameProxy( java.lang.String title , long __swiftObject ) {
        super( title );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JFrame(java.awt.GraphicsConfiguration)

    JFrameProxy( java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( gc );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JFrame() throws java.awt.HeadlessException

    JFrameProxy( long __swiftObject ) {
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
