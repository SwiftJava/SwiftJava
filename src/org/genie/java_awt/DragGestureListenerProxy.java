
/// interface java.awt.dnd.DragGestureListener ///

package org.genie.java_awt;

public class DragGestureListenerProxy implements java.awt.dnd.DragGestureListener {

    long swiftObject;

    DragGestureListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.dnd.DragGestureListener.dragGestureRecognized(java.awt.dnd.DragGestureEvent)

    public native void __dragGestureRecognized( java.awt.dnd.DragGestureEvent dge );

    public void dragGestureRecognized( java.awt.dnd.DragGestureEvent dge ) {
        __dragGestureRecognized( dge );
    }

}
