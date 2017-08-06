
/// interface javax.swing.event.TreeExpansionListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class TreeExpansionListenerProxy implements javax.swing.event.TreeExpansionListener {

    long __swiftObject;

    TreeExpansionListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.TreeExpansionListener.treeExpanded(javax.swing.event.TreeExpansionEvent)

    public native void __treeExpanded( long __swiftObject, javax.swing.event.TreeExpansionEvent event );

    public void treeExpanded( javax.swing.event.TreeExpansionEvent event ) {
        __treeExpanded( __swiftObject, event );
    }

    /// public abstract void javax.swing.event.TreeExpansionListener.treeCollapsed(javax.swing.event.TreeExpansionEvent)

    public native void __treeCollapsed( long __swiftObject, javax.swing.event.TreeExpansionEvent event );

    public void treeCollapsed( javax.swing.event.TreeExpansionEvent event ) {
        __treeCollapsed( __swiftObject, event );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
