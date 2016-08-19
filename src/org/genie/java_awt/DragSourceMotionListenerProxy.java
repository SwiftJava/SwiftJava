
/// interface java.awt.dnd.DragSourceMotionListener ///

package org.genie.java_awt;

public class DragSourceMotionListenerProxy implements java.awt.dnd.DragSourceMotionListener {

    long swiftObject;

    DragSourceMotionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.dnd.DragSourceMotionListener.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)

    public native void __dragMouseMoved( java.awt.dnd.DragSourceDragEvent dsde );

    public void dragMouseMoved( java.awt.dnd.DragSourceDragEvent dsde ) {
        __dragMouseMoved( dsde );
    }

}
