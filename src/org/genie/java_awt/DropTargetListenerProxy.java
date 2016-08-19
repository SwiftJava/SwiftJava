
/// interface java.awt.dnd.DropTargetListener ///

package org.genie.java_awt;

public class DropTargetListenerProxy implements java.awt.dnd.DropTargetListener {

    long swiftObject;

    DropTargetListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragEnter(java.awt.dnd.DropTargetDragEvent)

    public native void __dragEnter( java.awt.dnd.DropTargetDragEvent dtde );

    public void dragEnter( java.awt.dnd.DropTargetDragEvent dtde ) {
        __dragEnter( dtde );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragOver(java.awt.dnd.DropTargetDragEvent)

    public native void __dragOver( java.awt.dnd.DropTargetDragEvent dtde );

    public void dragOver( java.awt.dnd.DropTargetDragEvent dtde ) {
        __dragOver( dtde );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dropActionChanged(java.awt.dnd.DropTargetDragEvent)

    public native void __dropActionChanged( java.awt.dnd.DropTargetDragEvent dtde );

    public void dropActionChanged( java.awt.dnd.DropTargetDragEvent dtde ) {
        __dropActionChanged( dtde );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragExit(java.awt.dnd.DropTargetEvent)

    public native void __dragExit( java.awt.dnd.DropTargetEvent dte );

    public void dragExit( java.awt.dnd.DropTargetEvent dte ) {
        __dragExit( dte );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.drop(java.awt.dnd.DropTargetDropEvent)

    public native void __drop( java.awt.dnd.DropTargetDropEvent dtde );

    public void drop( java.awt.dnd.DropTargetDropEvent dtde ) {
        __drop( dtde );
    }

}
