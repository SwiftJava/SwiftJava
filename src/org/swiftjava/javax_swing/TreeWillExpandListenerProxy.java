
/// interface javax.swing.event.TreeWillExpandListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class TreeWillExpandListenerProxy implements javax.swing.event.TreeWillExpandListener {

    long __swiftObject;

    TreeWillExpandListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.TreeWillExpandListener.treeWillExpand(javax.swing.event.TreeExpansionEvent) throws javax.swing.tree.ExpandVetoException

    public native void __treeWillExpand( long __swiftObject, javax.swing.event.TreeExpansionEvent event );

    public void treeWillExpand( javax.swing.event.TreeExpansionEvent event ) throws javax.swing.tree.ExpandVetoException {
        __treeWillExpand( __swiftObject, event );
    }

    /// public abstract void javax.swing.event.TreeWillExpandListener.treeWillCollapse(javax.swing.event.TreeExpansionEvent) throws javax.swing.tree.ExpandVetoException

    public native void __treeWillCollapse( long __swiftObject, javax.swing.event.TreeExpansionEvent event );

    public void treeWillCollapse( javax.swing.event.TreeExpansionEvent event ) throws javax.swing.tree.ExpandVetoException {
        __treeWillCollapse( __swiftObject, event );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
