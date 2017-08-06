
/// interface javax.swing.event.RowSorterListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class RowSorterListenerProxy implements javax.swing.event.RowSorterListener {

    long __swiftObject;

    RowSorterListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.RowSorterListener.sorterChanged(javax.swing.event.RowSorterEvent)

    public native void __sorterChanged( long __swiftObject, javax.swing.event.RowSorterEvent e );

    public void sorterChanged( javax.swing.event.RowSorterEvent e ) {
        __sorterChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}