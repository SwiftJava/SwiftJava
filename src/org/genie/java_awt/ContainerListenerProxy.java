
/// interface java.awt.event.ContainerListener ///

package org.genie.java_awt;

public class ContainerListenerProxy implements java.awt.event.ContainerListener {

    long swiftObject;

    ContainerListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.ContainerListener.componentAdded(java.awt.event.ContainerEvent)

    public native void __componentAdded( java.awt.event.ContainerEvent arg0 );

    public void componentAdded( java.awt.event.ContainerEvent arg0 ) {
        __componentAdded( arg0 );
    }

    /// public abstract void java.awt.event.ContainerListener.componentRemoved(java.awt.event.ContainerEvent)

    public native void __componentRemoved( java.awt.event.ContainerEvent arg0 );

    public void componentRemoved( java.awt.event.ContainerEvent arg0 ) {
        __componentRemoved( arg0 );
    }

}
