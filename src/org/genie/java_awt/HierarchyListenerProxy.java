
/// interface java.awt.event.HierarchyListener ///

package org.genie.java_awt;

public class HierarchyListenerProxy implements java.awt.event.HierarchyListener {

    long swiftObject;

    HierarchyListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.HierarchyListener.hierarchyChanged(java.awt.event.HierarchyEvent)

    public native void __hierarchyChanged( java.awt.event.HierarchyEvent e );

    public void hierarchyChanged( java.awt.event.HierarchyEvent e ) {
        __hierarchyChanged( e );
    }

}
