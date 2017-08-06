
/// interface java.awt.event.TextListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class TextListenerProxy implements java.awt.event.TextListener {

    long __swiftObject;

    TextListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.TextListener.textValueChanged(java.awt.event.TextEvent)

    public native void __textValueChanged( long __swiftObject, java.awt.event.TextEvent e );

    public void textValueChanged( java.awt.event.TextEvent e ) {
        __textValueChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
