
/// interface javax.swing.event.TreeModelListener ///

package org.genie.javax_swing;

public class TreeModelListenerProxy implements javax.swing.event.TreeModelListener {

    long swiftObject;

    TreeModelListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesChanged(javax.swing.event.TreeModelEvent)

    public native void __treeNodesChanged( javax.swing.event.TreeModelEvent e );

    public void treeNodesChanged( javax.swing.event.TreeModelEvent e ) {
        __treeNodesChanged( e );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesInserted(javax.swing.event.TreeModelEvent)

    public native void __treeNodesInserted( javax.swing.event.TreeModelEvent e );

    public void treeNodesInserted( javax.swing.event.TreeModelEvent e ) {
        __treeNodesInserted( e );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeNodesRemoved(javax.swing.event.TreeModelEvent)

    public native void __treeNodesRemoved( javax.swing.event.TreeModelEvent e );

    public void treeNodesRemoved( javax.swing.event.TreeModelEvent e ) {
        __treeNodesRemoved( e );
    }

    /// public abstract void javax.swing.event.TreeModelListener.treeStructureChanged(javax.swing.event.TreeModelEvent)

    public native void __treeStructureChanged( javax.swing.event.TreeModelEvent e );

    public void treeStructureChanged( javax.swing.event.TreeModelEvent e ) {
        __treeStructureChanged( e );
    }

}
