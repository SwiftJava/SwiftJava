
/// interface java.awt.event.FocusListener ///

package org.genie.java_awt;

public class FocusListenerProxy implements java.awt.event.FocusListener {

    long swiftObject;

    FocusListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.FocusListener.focusGained(java.awt.event.FocusEvent)

    public native void __focusGained( java.awt.event.FocusEvent arg0 );

    public void focusGained( java.awt.event.FocusEvent arg0 ) {
        __focusGained( arg0 );
    }

    /// public abstract void java.awt.event.FocusListener.focusLost(java.awt.event.FocusEvent)

    public native void __focusLost( java.awt.event.FocusEvent arg0 );

    public void focusLost( java.awt.event.FocusEvent arg0 ) {
        __focusLost( arg0 );
    }

}
