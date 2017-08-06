
/// interface javax.swing.event.ChangeListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class ChangeListenerProxy implements javax.swing.event.ChangeListener {

    long __swiftObject;

    ChangeListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.ChangeListener.stateChanged(javax.swing.event.ChangeEvent)

    public native void __stateChanged( long __swiftObject, javax.swing.event.ChangeEvent e );

    public void stateChanged( javax.swing.event.ChangeEvent e ) {
        __stateChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
