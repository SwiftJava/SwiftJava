
/// interface java.awt.event.MouseMotionListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class MouseMotionListenerProxy implements java.awt.event.MouseMotionListener {

    long __swiftObject;

    MouseMotionListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
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
