
/// interface javax.swing.event.TableModelListener ///

package org.genie.javax_swing;

public class TableModelListenerProxy implements javax.swing.event.TableModelListener {

    long swiftObject;

    TableModelListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TableModelListener.tableChanged(javax.swing.event.TableModelEvent)

    public native void __tableChanged( javax.swing.event.TableModelEvent e );

    public void tableChanged( javax.swing.event.TableModelEvent e ) {
        __tableChanged( e );
    }

}
