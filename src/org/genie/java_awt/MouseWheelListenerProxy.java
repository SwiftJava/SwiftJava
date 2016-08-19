
/// interface java.awt.event.MouseWheelListener ///

package org.genie.java_awt;

public class MouseWheelListenerProxy implements java.awt.event.MouseWheelListener {

    long swiftObject;

    MouseWheelListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.MouseWheelListener.mouseWheelMoved(java.awt.event.MouseWheelEvent)

    public native void __mouseWheelMoved( java.awt.event.MouseWheelEvent e );

    public void mouseWheelMoved( java.awt.event.MouseWheelEvent e ) {
        __mouseWheelMoved( e );
    }

}
