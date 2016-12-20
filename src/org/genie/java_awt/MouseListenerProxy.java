
/// interface java.awt.event.MouseListener ///

package org.genie.java_awt;

public class MouseListenerProxy implements java.awt.event.MouseListener {

    long swiftObject;

    MouseListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.MouseListener.mousePressed(java.awt.event.MouseEvent)

    public native void __mousePressed( java.awt.event.MouseEvent arg0 );

    public void mousePressed( java.awt.event.MouseEvent arg0 ) {
        __mousePressed( arg0 );
    }

    /// public abstract void java.awt.event.MouseListener.mouseReleased(java.awt.event.MouseEvent)

    public native void __mouseReleased( java.awt.event.MouseEvent arg0 );

    public void mouseReleased( java.awt.event.MouseEvent arg0 ) {
        __mouseReleased( arg0 );
    }

    /// public abstract void java.awt.event.MouseListener.mouseClicked(java.awt.event.MouseEvent)

    public native void __mouseClicked( java.awt.event.MouseEvent arg0 );

    public void mouseClicked( java.awt.event.MouseEvent arg0 ) {
        __mouseClicked( arg0 );
    }

    /// public abstract void java.awt.event.MouseListener.mouseExited(java.awt.event.MouseEvent)

    public native void __mouseExited( java.awt.event.MouseEvent arg0 );

    public void mouseExited( java.awt.event.MouseEvent arg0 ) {
        __mouseExited( arg0 );
    }

    /// public abstract void java.awt.event.MouseListener.mouseEntered(java.awt.event.MouseEvent)

    public native void __mouseEntered( java.awt.event.MouseEvent arg0 );

    public void mouseEntered( java.awt.event.MouseEvent arg0 ) {
        __mouseEntered( arg0 );
    }

}
