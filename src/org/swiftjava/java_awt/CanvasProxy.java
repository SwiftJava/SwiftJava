
/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// class java.awt.Canvas ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class CanvasProxy extends java.awt.Canvas {

    // address of proxy object
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

    /// public void java.awt.Canvas.paint(java.awt.Graphics)

    public native void __paint( long __swiftObject, java.awt.Graphics g );

    boolean entered_paint_0;

    public void paint( java.awt.Graphics g ) {
        if ( !entered_paint_0 ) {
            entered_paint_0 = true;
            __paint( __swiftObject, g);
            entered_paint_0 = false;
        }
        else
            super.paint( g );
    }

    /// public void java.awt.Canvas.update(java.awt.Graphics)

    public native void __update( long __swiftObject, java.awt.Graphics g );

    boolean entered_update_1;

    public void update( java.awt.Graphics g ) {
        if ( !entered_update_1 ) {
            entered_update_1 = true;
            __update( __swiftObject, g);
            entered_update_1 = false;
        }
        else
            super.update( g );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}