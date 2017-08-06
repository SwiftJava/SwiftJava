
/// interface java.awt.event.ActionListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class ActionListenerProxy implements java.awt.event.ActionListener {

    long __swiftObject;

    ActionListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.ActionListener.actionPerformed(java.awt.event.ActionEvent)

    public native void __actionPerformed( long __swiftObject, java.awt.event.ActionEvent e );

    public void actionPerformed( java.awt.event.ActionEvent e ) {
        __actionPerformed( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
