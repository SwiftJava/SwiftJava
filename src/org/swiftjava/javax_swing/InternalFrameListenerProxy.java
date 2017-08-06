
/// interface javax.swing.event.InternalFrameListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class InternalFrameListenerProxy implements javax.swing.event.InternalFrameListener {

    long __swiftObject;

    InternalFrameListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameOpened(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameOpened( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    public void internalFrameOpened( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameOpened( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameClosing(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameClosing( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    public void internalFrameClosing( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameClosing( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameClosed(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameClosed( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    public void internalFrameClosed( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameClosed( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameIconified(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameIconified( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    public void internalFrameIconified( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameIconified( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameDeiconified(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameDeiconified( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    public void internalFrameDeiconified( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameDeiconified( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameActivated(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameActivated( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    public void internalFrameActivated( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameActivated( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.InternalFrameListener.internalFrameDeactivated(javax.swing.event.InternalFrameEvent)

    public native void __internalFrameDeactivated( long __swiftObject, javax.swing.event.InternalFrameEvent e );

    public void internalFrameDeactivated( javax.swing.event.InternalFrameEvent e ) {
        __internalFrameDeactivated( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
