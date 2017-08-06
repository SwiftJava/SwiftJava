
/// interface java.awt.event.WindowStateListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class WindowStateListenerProxy implements java.awt.event.WindowStateListener {

    long __swiftObject;

    WindowStateListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.WindowStateListener.windowStateChanged(java.awt.event.WindowEvent)

    public native void __windowStateChanged( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowStateChanged( java.awt.event.WindowEvent e ) {
        __windowStateChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
