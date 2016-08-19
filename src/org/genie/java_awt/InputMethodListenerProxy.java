
/// interface java.awt.event.InputMethodListener ///

package org.genie.java_awt;

public class InputMethodListenerProxy implements java.awt.event.InputMethodListener {

    long swiftObject;

    InputMethodListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.InputMethodListener.inputMethodTextChanged(java.awt.event.InputMethodEvent)

    public native void __inputMethodTextChanged( java.awt.event.InputMethodEvent event );

    public void inputMethodTextChanged( java.awt.event.InputMethodEvent event ) {
        __inputMethodTextChanged( event );
    }

    /// public abstract void java.awt.event.InputMethodListener.caretPositionChanged(java.awt.event.InputMethodEvent)

    public native void __caretPositionChanged( java.awt.event.InputMethodEvent event );

    public void caretPositionChanged( java.awt.event.InputMethodEvent event ) {
        __caretPositionChanged( event );
    }

}
