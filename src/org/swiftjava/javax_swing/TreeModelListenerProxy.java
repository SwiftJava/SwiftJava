
/// interface javax.swing.event.TreeModelListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class TreeModelListenerProxy implements javax.swing.event.TreeModelListener {

    long __swiftObject;

    TreeModelListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesChanged(javax.swing.event.TreeModelEvent)

    public native void __treeNodesChanged( long __swiftObject, javax.swing.event.TreeModelEvent e );

    public void treeNodesChanged( javax.swing.event.TreeModelEvent e ) {
        __treeNodesChanged( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesInserted(javax.swing.event.TreeModelEvent)

    public native void __treeNodesInserted( long __swiftObject, javax.swing.event.TreeModelEvent e );

    public void treeNodesInserted( javax.swing.event.TreeModelEvent e ) {
        __treeNodesInserted( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesRemoved(javax.swing.event.TreeModelEvent)

    public native void __treeNodesRemoved( long __swiftObject, javax.swing.event.TreeModelEvent e );

    public void treeNodesRemoved( javax.swing.event.TreeModelEvent e ) {
        __treeNodesRemoved( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeStructureChanged(javax.swing.event.TreeModelEvent)

    public native void __treeStructureChanged( long __swiftObject, javax.swing.event.TreeModelEvent e );

    public void treeStructureChanged( javax.swing.event.TreeModelEvent e ) {
        __treeStructureChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
