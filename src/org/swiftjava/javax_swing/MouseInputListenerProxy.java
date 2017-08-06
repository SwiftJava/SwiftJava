
/// interface javax.swing.event.MouseInputListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class MouseInputListenerProxy implements javax.swing.event.MouseInputListener {

    long __swiftObject;

    MouseInputListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.MouseListener.mousePressed(java.awt.event.MouseEvent)

    public native void __mousePressed( long __swiftObject, java.awt.event.MouseEvent e );

    public void mousePressed( java.awt.event.MouseEvent e ) {
        __mousePressed( __swiftObject, e );
    }

    /// public abstract void java.awt.event.MouseListener.mouseReleased(java.awt.event.MouseEvent)

    public native void __mouseReleased( long __swiftObject, java.awt.event.MouseEvent e );

    public void mouseReleased( java.awt.event.MouseEvent e ) {
        __mouseReleased( __swiftObject, e );
    }

    /// public abstract void java.awt.event.MouseListener.mouseClicked(java.awt.event.MouseEvent)

    public native void __mouseClicked( long __swiftObject, java.awt.event.MouseEvent e );

    public void mouseClicked( java.awt.event.MouseEvent e ) {
        __mouseClicked( __swiftObject, e );
    }

    /// public abstract void java.awt.event.MouseListener.mouseExited(java.awt.event.MouseEvent)

    public native void __mouseExited( long __swiftObject, java.awt.event.MouseEvent e );

    public void mouseExited( java.awt.event.MouseEvent e ) {
        __mouseExited( __swiftObject, e );
    }

    /// public abstract void java.awt.event.MouseListener.mouseEntered(java.awt.event.MouseEvent)

    public native void __mouseEntered( long __swiftObject, java.awt.event.MouseEvent e );

    public void mouseEntered( java.awt.event.MouseEvent e ) {
        __mouseEntered( __swiftObject, e );
    }

    /// public abstract void java.awt.event.MouseMotionListener.mouseMoved(java.awt.event.MouseEvent)

    public native void __mouseMoved( long __swiftObject, java.awt.event.MouseEvent e );

    public void mouseMoved( java.awt.event.MouseEvent e ) {
        __mouseMoved( __swiftObject, e );
    }

    /// public abstract void java.awt.event.MouseMotionListener.mouseDragged(java.awt.event.MouseEvent)

    public native void __mouseDragged( long __swiftObject, java.awt.event.MouseEvent e );

    public void mouseDragged( java.awt.event.MouseEvent e ) {
        __mouseDragged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
