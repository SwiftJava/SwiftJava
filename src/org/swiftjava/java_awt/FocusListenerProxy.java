
/// interface java.awt.event.FocusListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class FocusListenerProxy implements java.awt.event.FocusListener {

    long __swiftObject;

    FocusListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.FocusListener.focusGained(java.awt.event.FocusEvent)

    public native void __focusGained( long __swiftObject, java.awt.event.FocusEvent e );

    public void focusGained( java.awt.event.FocusEvent e ) {
        __focusGained( __swiftObject, e );
    }

    /// public abstract void java.awt.event.FocusListener.focusLost(java.awt.event.FocusEvent)

    public native void __focusLost( long __swiftObject, java.awt.event.FocusEvent e );

    public void focusLost( java.awt.event.FocusEvent e ) {
        __focusLost( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
