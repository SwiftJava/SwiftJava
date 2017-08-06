
/// interface java.awt.dnd.DropTargetListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class DropTargetListenerProxy implements java.awt.dnd.DropTargetListener {

    long __swiftObject;

    DropTargetListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragEnter(java.awt.dnd.DropTargetDragEvent)

    public native void __dragEnter( long __swiftObject, java.awt.dnd.DropTargetDragEvent dtde );

    public void dragEnter( java.awt.dnd.DropTargetDragEvent dtde ) {
        __dragEnter( __swiftObject, dtde );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragOver(java.awt.dnd.DropTargetDragEvent)

    public native void __dragOver( long __swiftObject, java.awt.dnd.DropTargetDragEvent dtde );

    public void dragOver( java.awt.dnd.DropTargetDragEvent dtde ) {
        __dragOver( __swiftObject, dtde );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dropActionChanged(java.awt.dnd.DropTargetDragEvent)

    public native void __dropActionChanged( long __swiftObject, java.awt.dnd.DropTargetDragEvent dtde );

    public void dropActionChanged( java.awt.dnd.DropTargetDragEvent dtde ) {
        __dropActionChanged( __swiftObject, dtde );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.dragExit(java.awt.dnd.DropTargetEvent)

    public native void __dragExit( long __swiftObject, java.awt.dnd.DropTargetEvent dte );

    public void dragExit( java.awt.dnd.DropTargetEvent dte ) {
        __dragExit( __swiftObject, dte );
    }

    /// public abstract void java.awt.dnd.DropTargetListener.drop(java.awt.dnd.DropTargetDropEvent)

    public native void __drop( long __swiftObject, java.awt.dnd.DropTargetDropEvent dtde );

    public void drop( java.awt.dnd.DropTargetDropEvent dtde ) {
        __drop( __swiftObject, dtde );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
