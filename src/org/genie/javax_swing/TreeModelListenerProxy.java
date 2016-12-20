
/// interface javax.swing.event.TreeModelListener ///

package org.genie.javax_swing;

public class TreeModelListenerProxy implements javax.swing.event.TreeModelListener {

    long swiftObject;

    TreeModelListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesChanged(javax.swing.event.TreeModelEvent)

    public native void __treeNodesChanged( javax.swing.event.TreeModelEvent arg0 );

    public void treeNodesChanged( javax.swing.event.TreeModelEvent arg0 ) {
        __treeNodesChanged( arg0 );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesInserted(javax.swing.event.TreeModelEvent)

    public native void __treeNodesInserted( javax.swing.event.TreeModelEvent arg0 );

    public void treeNodesInserted( javax.swing.event.TreeModelEvent arg0 ) {
        __treeNodesInserted( arg0 );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesRemoved(javax.swing.event.TreeModelEvent)

    public native void __treeNodesRemoved( javax.swing.event.TreeModelEvent arg0 );

    public void treeNodesRemoved( javax.swing.event.TreeModelEvent arg0 ) {
        __treeNodesRemoved( arg0 );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeStructureChanged(javax.swing.event.TreeModelEvent)

    public native void __treeStructureChanged( javax.swing.event.TreeModelEvent arg0 );

    public void treeStructureChanged( javax.swing.event.TreeModelEvent arg0 ) {
        __treeStructureChanged( arg0 );
    }

}
