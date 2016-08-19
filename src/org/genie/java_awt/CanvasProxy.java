
/// class java.awt.Canvas ///

package org.genie.java_awt;

public class CanvasProxy extends java.awt.Canvas {

    long swiftObject;

    /// public java.awt.Canvas()

    CanvasProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Canvas(java.awt.GraphicsConfiguration)

    CanvasProxy( java.awt.GraphicsConfiguration config , long swiftObject ) {
        super( config );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.Canvas.update(java.awt.Graphics)

    public native void __update( java.awt.Graphics g );

    boolean entered_update_0;

    public void update( java.awt.Graphics g ) {
        if ( !entered_update_0 ) {
            entered_update_0 = true;
            __update( g );
            entered_update_0 = false;
        }
        else
            super.update( g );
    }

    /// public void java.awt.Canvas.paint(java.awt.Graphics)

    public native void __paint( java.awt.Graphics g );

    boolean entered_paint_1;

    public void paint( java.awt.Graphics g ) {
        if ( !entered_paint_1 ) {
            entered_paint_1 = true;
            __paint( g );
            entered_paint_1 = false;
        }
        else
            super.paint( g );
    }

}
