
/// interface java.awt.dnd.DragSourceListener ///

package org.genie.java_awt;

public class DragSourceListenerProxy implements java.awt.dnd.DragSourceListener {

    long swiftObject;

    DragSourceListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragEnter(java.awt.dnd.DragSourceDragEvent)

    public native void __dragEnter( java.awt.dnd.DragSourceDragEvent arg0 );

    public void dragEnter( java.awt.dnd.DragSourceDragEvent arg0 ) {
        __dragEnter( arg0 );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragOver(java.awt.dnd.DragSourceDragEvent)

    public native void __dragOver( java.awt.dnd.DragSourceDragEvent arg0 );

    public void dragOver( java.awt.dnd.DragSourceDragEvent arg0 ) {
        __dragOver( arg0 );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dropActionChanged(java.awt.dnd.DragSourceDragEvent)

    public native void __dropActionChanged( java.awt.dnd.DragSourceDragEvent arg0 );

    public void dropActionChanged( java.awt.dnd.DragSourceDragEvent arg0 ) {
        __dropActionChanged( arg0 );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragExit(java.awt.dnd.DragSourceEvent)

    public native void __dragExit( java.awt.dnd.DragSourceEvent arg0 );

    public void dragExit( java.awt.dnd.DragSourceEvent arg0 ) {
        __dragExit( arg0 );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragDropEnd(java.awt.dnd.DragSourceDropEvent)

    public native void __dragDropEnd( java.awt.dnd.DragSourceDropEvent arg0 );

    public void dragDropEnd( java.awt.dnd.DragSourceDropEvent arg0 ) {
        __dragDropEnd( arg0 );
    }

}
