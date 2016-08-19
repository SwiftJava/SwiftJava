
/// interface javax.swing.event.ListSelectionListener ///

package org.genie.javax_swing;

public class ListSelectionListenerProxy implements javax.swing.event.ListSelectionListener {

    long swiftObject;

    ListSelectionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.ListSelectionListener.valueChanged(javax.swing.event.ListSelectionEvent)

    public native void __valueChanged( javax.swing.event.ListSelectionEvent e );

    public void valueChanged( javax.swing.event.ListSelectionEvent e ) {
        __valueChanged( e );
    }

}
