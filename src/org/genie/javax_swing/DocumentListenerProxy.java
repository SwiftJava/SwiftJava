
/// interface javax.swing.event.DocumentListener ///

package org.genie.javax_swing;

public class DocumentListenerProxy implements javax.swing.event.DocumentListener {

    long swiftObject;

    DocumentListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.DocumentListener.insertUpdate(javax.swing.event.DocumentEvent)

    public native void __insertUpdate( javax.swing.event.DocumentEvent e );

    public void insertUpdate( javax.swing.event.DocumentEvent e ) {
        __insertUpdate( e );
    }

    /// public abstract void javax.swing.event.DocumentListener.removeUpdate(javax.swing.event.DocumentEvent)

    public native void __removeUpdate( javax.swing.event.DocumentEvent e );

    public void removeUpdate( javax.swing.event.DocumentEvent e ) {
        __removeUpdate( e );
    }

    /// public abstract void javax.swing.event.DocumentListener.changedUpdate(javax.swing.event.DocumentEvent)

    public native void __changedUpdate( javax.swing.event.DocumentEvent e );

    public void changedUpdate( javax.swing.event.DocumentEvent e ) {
        __changedUpdate( e );
    }

}
