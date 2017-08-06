
/// interface java.awt.event.ItemListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class ItemListenerProxy implements java.awt.event.ItemListener {

    long __swiftObject;

    ItemListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.ItemListener.itemStateChanged(java.awt.event.ItemEvent)

    public native void __itemStateChanged( long __swiftObject, java.awt.event.ItemEvent e );

    public void itemStateChanged( java.awt.event.ItemEvent e ) {
        __itemStateChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
