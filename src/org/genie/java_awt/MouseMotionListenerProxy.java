
/// interface java.awt.event.MouseMotionListener ///

package org.genie.java_awt;

public class MouseMotionListenerProxy implements java.awt.event.MouseMotionListener {

    long swiftObject;

    MouseMotionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
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
