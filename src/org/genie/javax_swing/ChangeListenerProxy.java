
/// interface javax.swing.event.ChangeListener ///

package org.genie.javax_swing;

public class ChangeListenerProxy implements javax.swing.event.ChangeListener {

    long swiftObject;

    ChangeListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.ChangeListener.stateChanged(javax.swing.event.ChangeEvent)

    public native void __stateChanged( javax.swing.event.ChangeEvent arg0 );

    public void stateChanged( javax.swing.event.ChangeEvent arg0 ) {
        __stateChanged( arg0 );
    }

}
