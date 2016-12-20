
/// interface javax.swing.event.TreeExpansionListener ///

package org.genie.javax_swing;

public class TreeExpansionListenerProxy implements javax.swing.event.TreeExpansionListener {

    long swiftObject;

    TreeExpansionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TreeExpansionListener.treeCollapsed(javax.swing.event.TreeExpansionEvent)

    public native void __treeCollapsed( javax.swing.event.TreeExpansionEvent arg0 );

    public void treeCollapsed( javax.swing.event.TreeExpansionEvent arg0 ) {
        __treeCollapsed( arg0 );
    }

    /// public abstract void javax.swing.event.TreeExpansionListener.treeExpanded(javax.swing.event.TreeExpansionEvent)

    public native void __treeExpanded( javax.swing.event.TreeExpansionEvent arg0 );

    public void treeExpanded( javax.swing.event.TreeExpansionEvent arg0 ) {
        __treeExpanded( arg0 );
    }

}
