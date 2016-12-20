
/// interface javax.swing.event.DocumentListener ///

package org.genie.javax_swing;

public class DocumentListenerProxy implements javax.swing.event.DocumentListener {

    long swiftObject;

    DocumentListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.DocumentListener.insertUpdate(javax.swing.event.DocumentEvent)

    public native void __insertUpdate( javax.swing.event.DocumentEvent arg0 );

    public void insertUpdate( javax.swing.event.DocumentEvent arg0 ) {
        __insertUpdate( arg0 );
    }

    /// public abstract void javax.swing.event.DocumentListener.removeUpdate(javax.swing.event.DocumentEvent)

    public native void __removeUpdate( javax.swing.event.DocumentEvent arg0 );

    public void removeUpdate( javax.swing.event.DocumentEvent arg0 ) {
        __removeUpdate( arg0 );
    }

    /// public abstract void javax.swing.event.DocumentListener.changedUpdate(javax.swing.event.DocumentEvent)

    public native void __changedUpdate( javax.swing.event.DocumentEvent arg0 );

    public void changedUpdate( javax.swing.event.DocumentEvent arg0 ) {
        __changedUpdate( arg0 );
    }

}
