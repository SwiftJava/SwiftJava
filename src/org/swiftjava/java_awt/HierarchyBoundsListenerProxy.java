
/// interface java.awt.event.HierarchyBoundsListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class HierarchyBoundsListenerProxy implements java.awt.event.HierarchyBoundsListener {

    long __swiftObject;

    HierarchyBoundsListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.HierarchyBoundsListener.ancestorMoved(java.awt.event.HierarchyEvent)

    public native void __ancestorMoved( long __swiftObject, java.awt.event.HierarchyEvent e );

    public void ancestorMoved( java.awt.event.HierarchyEvent e ) {
        __ancestorMoved( __swiftObject, e );
    }

    /// public abstract void java.awt.event.HierarchyBoundsListener.ancestorResized(java.awt.event.HierarchyEvent)

    public native void __ancestorResized( long __swiftObject, java.awt.event.HierarchyEvent e );

    public void ancestorResized( java.awt.event.HierarchyEvent e ) {
        __ancestorResized( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
