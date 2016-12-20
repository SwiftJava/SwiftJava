
/// interface java.awt.event.TextListener ///

package org.genie.java_awt;

public class TextListenerProxy implements java.awt.event.TextListener {

    long swiftObject;

    TextListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.TextListener.textValueChanged(java.awt.event.TextEvent)

    public native void __textValueChanged( java.awt.event.TextEvent arg0 );

    public void textValueChanged( java.awt.event.TextEvent arg0 ) {
        __textValueChanged( arg0 );
    }

}
