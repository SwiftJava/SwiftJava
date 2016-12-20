
/// interface java.awt.dnd.DropTargetListener ///

package org.genie.java_awt;

public class DropTargetListenerProxy implements java.awt.dnd.DropTargetListener {

    long swiftObject;

    DropTargetListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragEnter(java.awt.dnd.DropTargetDragEvent)

    public native void __dragEnter( java.awt.dnd.DropTargetDragEvent arg0 );

    public void dragEnter( java.awt.dnd.DropTargetDragEvent arg0 ) {
        __dragEnter( arg0 );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragOver(java.awt.dnd.DropTargetDragEvent)

    public native void __dragOver( java.awt.dnd.DropTargetDragEvent arg0 );

    public void dragOver( java.awt.dnd.DropTargetDragEvent arg0 ) {
        __dragOver( arg0 );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dropActionChanged(java.awt.dnd.DropTargetDragEvent)

    public native void __dropActionChanged( java.awt.dnd.DropTargetDragEvent arg0 );

    public void dropActionChanged( java.awt.dnd.DropTargetDragEvent arg0 ) {
        __dropActionChanged( arg0 );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragExit(java.awt.dnd.DropTargetEvent)

    public native void __dragExit( java.awt.dnd.DropTargetEvent arg0 );

    public void dragExit( java.awt.dnd.DropTargetEvent arg0 ) {
        __dragExit( arg0 );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.drop(java.awt.dnd.DropTargetDropEvent)

    public native void __drop( java.awt.dnd.DropTargetDropEvent arg0 );

    public void drop( java.awt.dnd.DropTargetDropEvent arg0 ) {
        __drop( arg0 );
    }

}
