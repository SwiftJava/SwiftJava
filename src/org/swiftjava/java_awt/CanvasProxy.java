
/// class java.awt.Canvas ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class CanvasProxy extends java.awt.Canvas {

    long __swiftObject;

    /// public java.awt.Canvas()

    CanvasProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.Canvas(java.awt.GraphicsConfiguration)

    CanvasProxy( java.awt.GraphicsConfiguration config , long __swiftObject ) {
        super( config );
        this.__swiftObject = __swiftObject;
    }

    /// public void java.awt.Canvas.update(java.awt.Graphics)

    public native void __update( long __swiftObject, java.awt.Graphics g );

    boolean entered_update_0;

    public void update( java.awt.Graphics g ) {
        if ( !entered_update_0 ) {
            entered_update_0 = true;
            __update( __swiftObject, g);
            entered_update_0 = false;
        }
        else
            super.update( g );
    }

    /// public void java.awt.Canvas.paint(java.awt.Graphics)

    public native void __paint( long __swiftObject, java.awt.Graphics g );

    boolean entered_paint_1;

    public void paint( java.awt.Graphics g ) {
        if ( !entered_paint_1 ) {
            entered_paint_1 = true;
            __paint( __swiftObject, g);
            entered_paint_1 = false;
        }
        else
            super.paint( g );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
