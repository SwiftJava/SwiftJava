
/// interface javax.swing.event.TreeWillExpandListener ///

package org.genie.javax_swing;

public class TreeWillExpandListenerProxy implements javax.swing.event.TreeWillExpandListener {

    long swiftObject;

    TreeWillExpandListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TreeWillExpandListener.treeWillExpand(javax.swing.event.TreeExpansionEvent) throws javax.swing.tree.ExpandVetoException

    public native void __treeWillExpand( javax.swing.event.TreeExpansionEvent event );

    public void treeWillExpand( javax.swing.event.TreeExpansionEvent event ) throws javax.swing.tree.ExpandVetoException {
        __treeWillExpand( event );
    }

    /// public abstract void javax.swing.event.TreeWillExpandListener.treeWillCollapse(javax.swing.event.TreeExpansionEvent) throws javax.swing.tree.ExpandVetoException

    public native void __treeWillCollapse( javax.swing.event.TreeExpansionEvent event );

    public void treeWillCollapse( javax.swing.event.TreeExpansionEvent event ) throws javax.swing.tree.ExpandVetoException {
        __treeWillCollapse( event );
    }

}
