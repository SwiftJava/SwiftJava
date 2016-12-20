
/// interface javax.swing.event.InternalFrameListener ///

package org.genie.javax_swing;

public class InternalFrameListenerProxy implements javax.swing.event.InternalFrameListener {

    long swiftObject;

    InternalFrameListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameClosing(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameClosing( javax.swing.event.InternalFrameEvent arg0 );

    public void internalFrameClosing( javax.swing.event.InternalFrameEvent arg0 ) {
        __internalFrameClosing( arg0 );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameOpened(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameOpened( javax.swing.event.InternalFrameEvent arg0 );

    public void internalFrameOpened( javax.swing.event.InternalFrameEvent arg0 ) {
        __internalFrameOpened( arg0 );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameClosed(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameClosed( javax.swing.event.InternalFrameEvent arg0 );

    public void internalFrameClosed( javax.swing.event.InternalFrameEvent arg0 ) {
        __internalFrameClosed( arg0 );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameIconified(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameIconified( javax.swing.event.InternalFrameEvent arg0 );

    public void internalFrameIconified( javax.swing.event.InternalFrameEvent arg0 ) {
        __internalFrameIconified( arg0 );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameDeiconified(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameDeiconified( javax.swing.event.InternalFrameEvent arg0 );

    public void internalFrameDeiconified( javax.swing.event.InternalFrameEvent arg0 ) {
        __internalFrameDeiconified( arg0 );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameActivated(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameActivated( javax.swing.event.InternalFrameEvent arg0 );

    public void internalFrameActivated( javax.swing.event.InternalFrameEvent arg0 ) {
        __internalFrameActivated( arg0 );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameDeactivated(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameDeactivated( javax.swing.event.InternalFrameEvent arg0 );

    public void internalFrameDeactivated( javax.swing.event.InternalFrameEvent arg0 ) {
        __internalFrameDeactivated( arg0 );
    }

}
