
/// interface java.awt.event.WindowStateListener ///

package org.genie.java_awt;

public class WindowStateListenerProxy implements java.awt.event.WindowStateListener {

    long swiftObject;

    WindowStateListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.WindowStateListener.windowStateChanged(java.awt.event.WindowEvent)

    public native void __windowStateChanged( java.awt.event.WindowEvent arg0 );

    public void windowStateChanged( java.awt.event.WindowEvent arg0 ) {
        __windowStateChanged( arg0 );
    }

}
