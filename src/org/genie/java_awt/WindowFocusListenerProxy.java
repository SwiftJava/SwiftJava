
/// interface java.awt.event.WindowFocusListener ///

package org.genie.java_awt;

public class WindowFocusListenerProxy implements java.awt.event.WindowFocusListener {

    long swiftObject;

    WindowFocusListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.WindowFocusListener.windowGainedFocus(java.awt.event.WindowEvent)

    public native void __windowGainedFocus( java.awt.event.WindowEvent arg0 );

    public void windowGainedFocus( java.awt.event.WindowEvent arg0 ) {
        __windowGainedFocus( arg0 );
    }

    /// public abstract void java.awt.event.WindowFocusListener.windowLostFocus(java.awt.event.WindowEvent)

    public native void __windowLostFocus( java.awt.event.WindowEvent arg0 );

    public void windowLostFocus( java.awt.event.WindowEvent arg0 ) {
        __windowLostFocus( arg0 );
    }

}
