
/// interface java.awt.event.ContainerListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class ContainerListenerProxy implements java.awt.event.ContainerListener {

    long __swiftObject;

    ContainerListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.ContainerListener.componentAdded(java.awt.event.ContainerEvent)

    public native void __componentAdded( long __swiftObject, java.awt.event.ContainerEvent e );

    public void componentAdded( java.awt.event.ContainerEvent e ) {
        __componentAdded( __swiftObject, e );
    }

    /// public abstract void java.awt.event.ContainerListener.componentRemoved(java.awt.event.ContainerEvent)

    public native void __componentRemoved( long __swiftObject, java.awt.event.ContainerEvent e );

    public void componentRemoved( java.awt.event.ContainerEvent e ) {
        __componentRemoved( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
