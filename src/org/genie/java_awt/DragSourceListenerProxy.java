
/// interface java.awt.dnd.DragSourceListener ///

package org.genie.java_awt;

public class DragSourceListenerProxy implements java.awt.dnd.DragSourceListener {

    long swiftObject;

    DragSourceListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragDropEnd(java.awt.dnd.DragSourceDropEvent)

    public native void __dragDropEnd( java.awt.dnd.DragSourceDropEvent dsde );

    public void dragDropEnd( java.awt.dnd.DragSourceDropEvent dsde ) {
        __dragDropEnd( dsde );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragEnter(java.awt.dnd.DragSourceDragEvent)

    public native void __dragEnter( java.awt.dnd.DragSourceDragEvent dsde );

    public void dragEnter( java.awt.dnd.DragSourceDragEvent dsde ) {
        __dragEnter( dsde );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragOver(java.awt.dnd.DragSourceDragEvent)

    public native void __dragOver( java.awt.dnd.DragSourceDragEvent dsde );

    public void dragOver( java.awt.dnd.DragSourceDragEvent dsde ) {
        __dragOver( dsde );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dropActionChanged(java.awt.dnd.DragSourceDragEvent)

    public native void __dropActionChanged( java.awt.dnd.DragSourceDragEvent dsde );

    public void dropActionChanged( java.awt.dnd.DragSourceDragEvent dsde ) {
        __dropActionChanged( dsde );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragExit(java.awt.dnd.DragSourceEvent)

    public native void __dragExit( java.awt.dnd.DragSourceEvent dse );

    public void dragExit( java.awt.dnd.DragSourceEvent dse ) {
        __dragExit( dse );
    }

}
