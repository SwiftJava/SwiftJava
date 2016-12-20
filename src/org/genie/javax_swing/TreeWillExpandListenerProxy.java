
/// interface javax.swing.event.TreeWillExpandListener ///

package org.genie.javax_swing;

public class TreeWillExpandListenerProxy implements javax.swing.event.TreeWillExpandListener {

    long swiftObject;

    TreeWillExpandListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TreeWillExpandListener.treeWillExpand(javax.swing.event.TreeExpansionEvent) throws javax.swing.tree.ExpandVetoException

    public native void __treeWillExpand( javax.swing.event.TreeExpansionEvent arg0 );

    public void treeWillExpand( javax.swing.event.TreeExpansionEvent arg0 ) throws javax.swing.tree.ExpandVetoException {
        __treeWillExpand( arg0 );
    }

    /// public abstract void javax.swing.event.TreeWillExpandListener.treeWillCollapse(javax.swing.event.TreeExpansionEvent) throws javax.swing.tree.ExpandVetoException

    public native void __treeWillCollapse( javax.swing.event.TreeExpansionEvent arg0 );

    public void treeWillCollapse( javax.swing.event.TreeExpansionEvent arg0 ) throws javax.swing.tree.ExpandVetoException {
        __treeWillCollapse( arg0 );
    }

}
