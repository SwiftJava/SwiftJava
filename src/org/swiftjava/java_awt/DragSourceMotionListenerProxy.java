
/// interface java.awt.dnd.DragSourceMotionListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class DragSourceMotionListenerProxy implements java.awt.dnd.DragSourceMotionListener {

    long __swiftObject;

    DragSourceMotionListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.dnd.DragSourceMotionListener.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)

    public native void __dragMouseMoved( long __swiftObject, java.awt.dnd.DragSourceDragEvent dsde );

    public void dragMouseMoved( java.awt.dnd.DragSourceDragEvent dsde ) {
        __dragMouseMoved( __swiftObject, dsde );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
