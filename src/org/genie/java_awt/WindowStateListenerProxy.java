
/// interface java.awt.event.WindowStateListener ///

package org.genie.java_awt;

public class WindowStateListenerProxy implements java.awt.event.WindowStateListener {

    long swiftObject;

    WindowStateListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.WindowStateListener.windowStateChanged(java.awt.event.WindowEvent)

    public native void __windowStateChanged( java.awt.event.WindowEvent e );

    public void windowStateChanged( java.awt.event.WindowEvent e ) {
        __windowStateChanged( e );
    }

}
