
/// interface java.awt.event.ContainerListener ///

package org.genie.java_awt;

public class ContainerListenerProxy implements java.awt.event.ContainerListener {

    long swiftObject;

    ContainerListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.ContainerListener.componentAdded(java.awt.event.ContainerEvent)

    public native void __componentAdded( java.awt.event.ContainerEvent e );

    public void componentAdded( java.awt.event.ContainerEvent e ) {
        __componentAdded( e );
    }

    /// public abstract void java.awt.event.ContainerListener.componentRemoved(java.awt.event.ContainerEvent)

    public native void __componentRemoved( java.awt.event.ContainerEvent e );

    public void componentRemoved( java.awt.event.ContainerEvent e ) {
        __componentRemoved( e );
    }

}
