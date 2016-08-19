
/// interface javax.swing.event.CaretListener ///

package org.genie.javax_swing;

public class CaretListenerProxy implements javax.swing.event.CaretListener {

    long swiftObject;

    CaretListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.CaretListener.caretUpdate(javax.swing.event.CaretEvent)

    public native void __caretUpdate( javax.swing.event.CaretEvent e );

    public void caretUpdate( javax.swing.event.CaretEvent e ) {
        __caretUpdate( e );
    }

}
