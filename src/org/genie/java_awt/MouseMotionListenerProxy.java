
/// interface java.awt.event.MouseMotionListener ///

package org.genie.java_awt;

public class MouseMotionListenerProxy implements java.awt.event.MouseMotionListener {

    long swiftObject;

    MouseMotionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.MouseMotionListener.mouseMoved(java.awt.event.MouseEvent)

    public native void __mouseMoved( java.awt.event.MouseEvent arg0 );

    public void mouseMoved( java.awt.event.MouseEvent arg0 ) {
        __mouseMoved( arg0 );
    }

    /// public abstract void java.awt.event.MouseMotionListener.mouseDragged(java.awt.event.MouseEvent)

    public native void __mouseDragged( java.awt.event.MouseEvent arg0 );

    public void mouseDragged( java.awt.event.MouseEvent arg0 ) {
        __mouseDragged( arg0 );
    }

}
