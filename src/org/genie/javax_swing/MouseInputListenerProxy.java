
/// interface javax.swing.event.MouseInputListener ///

package org.genie.javax_swing;

public class MouseInputListenerProxy implements javax.swing.event.MouseInputListener {

    long swiftObject;

    MouseInputListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.MouseListener.mousePressed(java.awt.event.MouseEvent)

    public native void __mousePressed( java.awt.event.MouseEvent e );

    public void mousePressed( java.awt.event.MouseEvent e ) {
        __mousePressed( e );
    }

    /// public abstract void java.awt.event.MouseListener.mouseReleased(java.awt.event.MouseEvent)

    public native void __mouseReleased( java.awt.event.MouseEvent e );

    public void mouseReleased( java.awt.event.MouseEvent e ) {
        __mouseReleased( e );
    }

    /// public abstract void java.awt.event.MouseListener.mouseClicked(java.awt.event.MouseEvent)

    public native void __mouseClicked( java.awt.event.MouseEvent e );

    public void mouseClicked( java.awt.event.MouseEvent e ) {
        __mouseClicked( e );
    }

    /// public abstract void java.awt.event.MouseListener.mouseExited(java.awt.event.MouseEvent)

    public native void __mouseExited( java.awt.event.MouseEvent e );

    public void mouseExited( java.awt.event.MouseEvent e ) {
        __mouseExited( e );
    }

    /// public abstract void java.awt.event.MouseListener.mouseEntered(java.awt.event.MouseEvent)

    public native void __mouseEntered( java.awt.event.MouseEvent e );

    public void mouseEntered( java.awt.event.MouseEvent e ) {
        __mouseEntered( e );
    }

    /// public abstract void java.awt.event.MouseMotionListener.mouseMoved(java.awt.event.MouseEvent)

    public native void __mouseMoved( java.awt.event.MouseEvent e );

    public void mouseMoved( java.awt.event.MouseEvent e ) {
        __mouseMoved( e );
    }

    /// public abstract void java.awt.event.MouseMotionListener.mouseDragged(java.awt.event.MouseEvent)

    public native void __mouseDragged( java.awt.event.MouseEvent e );

    public void mouseDragged( java.awt.event.MouseEvent e ) {
        __mouseDragged( e );
    }

}
