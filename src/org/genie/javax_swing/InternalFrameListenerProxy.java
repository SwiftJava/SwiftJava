
/// interface javax.swing.event.InternalFrameListener ///

package org.genie.javax_swing;

public class InternalFrameListenerProxy implements javax.swing.event.InternalFrameListener {

    long swiftObject;

    InternalFrameListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameOpened(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameOpened( javax.swing.event.InternalFrameEvent e );

    public void internalFrameOpened( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameOpened( e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameClosing(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameClosing( javax.swing.event.InternalFrameEvent e );

    public void internalFrameClosing( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameClosing( e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameClosed(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameClosed( javax.swing.event.InternalFrameEvent e );

    public void internalFrameClosed( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameClosed( e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameIconified(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameIconified( javax.swing.event.InternalFrameEvent e );

    public void internalFrameIconified( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameIconified( e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameDeiconified(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameDeiconified( javax.swing.event.InternalFrameEvent e );

    public void internalFrameDeiconified( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameDeiconified( e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameActivated(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameActivated( javax.swing.event.InternalFrameEvent e );

    public void internalFrameActivated( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameActivated( e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameDeactivated(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameDeactivated( javax.swing.event.InternalFrameEvent e );

    public void internalFrameDeactivated( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameDeactivated( e );
    }

}
