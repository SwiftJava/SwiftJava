
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

    CanvasProxy( java.awt.GraphicsConfiguration arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.Canvas.update(java.awt.Graphics)

    public native void __update( java.awt.Graphics arg0 );

    boolean entered_update_0;

    public void update( java.awt.Graphics arg0 ) {
        if ( !entered_update_0 ) {
            entered_update_0 = true;
            __update( arg0 );
            entered_update_0 = false;
        }
        else
            super.update( arg0 );
    }

    /// public void java.awt.Canvas.paint(java.awt.Graphics)

    public native void __paint( java.awt.Graphics arg0 );

    boolean entered_paint_1;

    public void paint( java.awt.Graphics arg0 ) {
        if ( !entered_paint_1 ) {
            entered_paint_1 = true;
            __paint( arg0 );
            entered_paint_1 = false;
        }
        else
            super.paint( arg0 );
    }

}
