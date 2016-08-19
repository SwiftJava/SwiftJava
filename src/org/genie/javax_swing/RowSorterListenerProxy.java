
/// interface javax.swing.event.RowSorterListener ///

package org.genie.javax_swing;

public class RowSorterListenerProxy implements javax.swing.event.RowSorterListener {

    long swiftObject;

    RowSorterListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.RowSorterListener.sorterChanged(javax.swing.event.RowSorterEvent)

    public native void __sorterChanged( javax.swing.event.RowSorterEvent e );

    public void sorterChanged( javax.swing.event.RowSorterEvent e ) {
        __sorterChanged( e );
    }

}
