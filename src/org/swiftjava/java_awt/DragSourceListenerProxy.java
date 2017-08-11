
/// interface java.awt.dnd.DragSourceListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class DragSourceListenerProxy implements java.awt.dnd.DragSourceListener {

    long __swiftObject;

    DragSourceListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragDropEnd(java.awt.dnd.DragSourceDropEvent)

    public native void __dragDropEnd( long __swiftObject, java.awt.dnd.DragSourceDropEvent dsde );

    public void dragDropEnd( java.awt.dnd.DragSourceDropEvent dsde ) {
        __dragDropEnd( __swiftObject, dsde );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragEnter(java.awt.dnd.DragSourceDragEvent)

    public native void __dragEnter( long __swiftObject, java.awt.dnd.DragSourceDragEvent dsde );

    public void dragEnter( java.awt.dnd.DragSourceDragEvent dsde ) {
        __dragEnter( __swiftObject, dsde );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragOver(java.awt.dnd.DragSourceDragEvent)

    public native void __dragOver( long __swiftObject, java.awt.dnd.DragSourceDragEvent dsde );

    public void dragOver( java.awt.dnd.DragSourceDragEvent dsde ) {
        __dragOver( __swiftObject, dsde );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dropActionChanged(java.awt.dnd.DragSourceDragEvent)

    public native void __dropActionChanged( long __swiftObject, java.awt.dnd.DragSourceDragEvent dsde );

    public void dropActionChanged( java.awt.dnd.DragSourceDragEvent dsde ) {
        __dropActionChanged( __swiftObject, dsde );
    }

    /// public abstract void java.awt.dnd.DragSourceListener.dragExit(java.awt.dnd.DragSourceEvent)

    public native void __dragExit( long __swiftObject, java.awt.dnd.DragSourceEvent dse );

    public void dragExit( java.awt.dnd.DragSourceEvent dse ) {
        __dragExit( __swiftObject, dse );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
