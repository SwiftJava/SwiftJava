
/// interface java.awt.event.HierarchyBoundsListener ///

package org.genie.java_awt;

public class HierarchyBoundsListenerProxy implements java.awt.event.HierarchyBoundsListener {

    long swiftObject;

    HierarchyBoundsListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.HierarchyBoundsListener.ancestorMoved(java.awt.event.HierarchyEvent)

    public native void __ancestorMoved( java.awt.event.HierarchyEvent e );

    public void ancestorMoved( java.awt.event.HierarchyEvent e ) {
        __ancestorMoved( e );
    }

    /// public abstract void java.awt.event.HierarchyBoundsListener.ancestorResized(java.awt.event.HierarchyEvent)

    public native void __ancestorResized( java.awt.event.HierarchyEvent e );

    public void ancestorResized( java.awt.event.HierarchyEvent e ) {
        __ancestorResized( e );
    }

}
