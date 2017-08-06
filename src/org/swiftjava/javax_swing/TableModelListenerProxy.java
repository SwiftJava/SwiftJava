
/// interface javax.swing.event.TableModelListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class TableModelListenerProxy implements javax.swing.event.TableModelListener {

    long __swiftObject;

    TableModelListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.TableModelListener.tableChanged(javax.swing.event.TableModelEvent)

    public native void __tableChanged( long __swiftObject, javax.swing.event.TableModelEvent e );

    public void tableChanged( javax.swing.event.TableModelEvent e ) {
        __tableChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
