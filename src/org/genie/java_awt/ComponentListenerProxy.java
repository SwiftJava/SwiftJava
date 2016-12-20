
/// interface java.awt.event.ComponentListener ///

package org.genie.java_awt;

public class ComponentListenerProxy implements java.awt.event.ComponentListener {

    long swiftObject;

    ComponentListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.ComponentListener.componentResized(java.awt.event.ComponentEvent)

    public native void __componentResized( java.awt.event.ComponentEvent arg0 );

    public void componentResized( java.awt.event.ComponentEvent arg0 ) {
        __componentResized( arg0 );
    }

    /// public abstract void java.awt.event.ComponentListener.componentMoved(java.awt.event.ComponentEvent)

    public native void __componentMoved( java.awt.event.ComponentEvent arg0 );

    public void componentMoved( java.awt.event.ComponentEvent arg0 ) {
        __componentMoved( arg0 );
    }

    /// public abstract void java.awt.event.ComponentListener.componentShown(java.awt.event.ComponentEvent)

    public native void __componentShown( java.awt.event.ComponentEvent arg0 );

    public void componentShown( java.awt.event.ComponentEvent arg0 ) {
        __componentShown( arg0 );
    }

    /// public abstract void java.awt.event.ComponentListener.componentHidden(java.awt.event.ComponentEvent)

    public native void __componentHidden( java.awt.event.ComponentEvent arg0 );

    public void componentHidden( java.awt.event.ComponentEvent arg0 ) {
        __componentHidden( arg0 );
    }

}
