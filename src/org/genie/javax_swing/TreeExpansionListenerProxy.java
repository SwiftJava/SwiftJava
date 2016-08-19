
/// interface javax.swing.event.TreeExpansionListener ///

package org.genie.javax_swing;

public class TreeExpansionListenerProxy implements javax.swing.event.TreeExpansionListener {

    long swiftObject;

    TreeExpansionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TreeExpansionListener.treeExpanded(javax.swing.event.TreeExpansionEvent)

    public native void __treeExpanded( javax.swing.event.TreeExpansionEvent event );

    public void treeExpanded( javax.swing.event.TreeExpansionEvent event ) {
        __treeExpanded( event );
    }

    /// public abstract void javax.swing.event.TreeExpansionListener.treeCollapsed(javax.swing.event.TreeExpansionEvent)

    public native void __treeCollapsed( javax.swing.event.TreeExpansionEvent event );

    public void treeCollapsed( javax.swing.event.TreeExpansionEvent event ) {
        __treeCollapsed( event );
    }

}
