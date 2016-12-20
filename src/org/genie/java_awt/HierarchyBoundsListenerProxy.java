
/// interface java.awt.event.HierarchyBoundsListener ///

package org.genie.java_awt;

public class HierarchyBoundsListenerProxy implements java.awt.event.HierarchyBoundsListener {

    long swiftObject;

    HierarchyBoundsListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.HierarchyBoundsListener.ancestorMoved(java.awt.event.HierarchyEvent)

    public native void __ancestorMoved( java.awt.event.HierarchyEvent arg0 );

    public void ancestorMoved( java.awt.event.HierarchyEvent arg0 ) {
        __ancestorMoved( arg0 );
    }

    /// public abstract void java.awt.event.HierarchyBoundsListener.ancestorResized(java.awt.event.HierarchyEvent)

    public native void __ancestorResized( java.awt.event.HierarchyEvent arg0 );

    public void ancestorResized( java.awt.event.HierarchyEvent arg0 ) {
        __ancestorResized( arg0 );
    }

}
