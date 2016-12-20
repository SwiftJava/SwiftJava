
/// interface javax.swing.event.TreeSelectionListener ///

package org.genie.javax_swing;

public class TreeSelectionListenerProxy implements javax.swing.event.TreeSelectionListener {

    long swiftObject;

    TreeSelectionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TreeSelectionListener.valueChanged(javax.swing.event.TreeSelectionEvent)

    public native void __valueChanged( javax.swing.event.TreeSelectionEvent arg0 );

    public void valueChanged( javax.swing.event.TreeSelectionEvent arg0 ) {
        __valueChanged( arg0 );
    }

}
