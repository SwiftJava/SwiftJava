
/// interface java.awt.event.AWTEventListener ///

package org.genie.java_awt;

public class AWTEventListenerProxy implements java.awt.event.AWTEventListener {

    long swiftObject;

    AWTEventListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.AWTEventListener.eventDispatched(java.awt.AWTEvent)

    public native void __eventDispatched( java.awt.AWTEvent arg0 );

    public void eventDispatched( java.awt.AWTEvent arg0 ) {
        __eventDispatched( arg0 );
    }

}
