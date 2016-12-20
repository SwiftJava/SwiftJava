
/// interface java.awt.event.InputMethodListener ///

package org.genie.java_awt;

public class InputMethodListenerProxy implements java.awt.event.InputMethodListener {

    long swiftObject;

    InputMethodListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.InputMethodListener.inputMethodTextChanged(java.awt.event.InputMethodEvent)

    public native void __inputMethodTextChanged( java.awt.event.InputMethodEvent arg0 );

    public void inputMethodTextChanged( java.awt.event.InputMethodEvent arg0 ) {
        __inputMethodTextChanged( arg0 );
    }

    /// public abstract void java.awt.event.InputMethodListener.caretPositionChanged(java.awt.event.InputMethodEvent)

    public native void __caretPositionChanged( java.awt.event.InputMethodEvent arg0 );

    public void caretPositionChanged( java.awt.event.InputMethodEvent arg0 ) {
        __caretPositionChanged( arg0 );
    }

}
