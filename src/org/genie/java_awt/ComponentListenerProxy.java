
/// interface java.awt.event.ComponentListener ///

package org.genie.java_awt;

public class ComponentListenerProxy implements java.awt.event.ComponentListener {

    long swiftObject;

    ComponentListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.ComponentListener.componentResized(java.awt.event.ComponentEvent)

    public native void __componentResized( java.awt.event.ComponentEvent e );

    public void componentResized( java.awt.event.ComponentEvent e ) {
        __componentResized( e );
    }

    /// public abstract void java.awt.event.ComponentListener.componentMoved(java.awt.event.ComponentEvent)

    public native void __componentMoved( java.awt.event.ComponentEvent e );

    public void componentMoved( java.awt.event.ComponentEvent e ) {
        __componentMoved( e );
    }

    /// public abstract void java.awt.event.ComponentListener.componentShown(java.awt.event.ComponentEvent)

    public native void __componentShown( java.awt.event.ComponentEvent e );

    public void componentShown( java.awt.event.ComponentEvent e ) {
        __componentShown( e );
    }

    /// public abstract void java.awt.event.ComponentListener.componentHidden(java.awt.event.ComponentEvent)

    public native void __componentHidden( java.awt.event.ComponentEvent e );

    public void componentHidden( java.awt.event.ComponentEvent e ) {
        __componentHidden( e );
    }

}
