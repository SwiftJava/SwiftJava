
/// interface java.awt.dnd.DragGestureListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class DragGestureListenerProxy implements java.awt.dnd.DragGestureListener {

    long __swiftObject;

    DragGestureListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.dnd.DragGestureListener.dragGestureRecognized(java.awt.dnd.DragGestureEvent)

    public native void __dragGestureRecognized( long __swiftObject, java.awt.dnd.DragGestureEvent dge );

    public void dragGestureRecognized( java.awt.dnd.DragGestureEvent dge ) {
        __dragGestureRecognized( __swiftObject, dge );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
