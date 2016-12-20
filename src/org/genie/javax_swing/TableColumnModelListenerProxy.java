
/// interface javax.swing.event.TableColumnModelListener ///

package org.genie.javax_swing;

public class TableColumnModelListenerProxy implements javax.swing.event.TableColumnModelListener {

    long swiftObject;

    TableColumnModelListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnAdded(javax.swing.event.TableColumnModelEvent)

    public native void __columnAdded( javax.swing.event.TableColumnModelEvent arg0 );

    public void columnAdded( javax.swing.event.TableColumnModelEvent arg0 ) {
        __columnAdded( arg0 );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnRemoved(javax.swing.event.TableColumnModelEvent)

    public native void __columnRemoved( javax.swing.event.TableColumnModelEvent arg0 );

    public void columnRemoved( javax.swing.event.TableColumnModelEvent arg0 ) {
        __columnRemoved( arg0 );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnMoved(javax.swing.event.TableColumnModelEvent)

    public native void __columnMoved( javax.swing.event.TableColumnModelEvent arg0 );

    public void columnMoved( javax.swing.event.TableColumnModelEvent arg0 ) {
        __columnMoved( arg0 );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnMarginChanged(javax.swing.event.ChangeEvent)

    public native void __columnMarginChanged( javax.swing.event.ChangeEvent arg0 );

    public void columnMarginChanged( javax.swing.event.ChangeEvent arg0 ) {
        __columnMarginChanged( arg0 );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnSelectionChanged(javax.swing.event.ListSelectionEvent)

    public native void __columnSelectionChanged( javax.swing.event.ListSelectionEvent arg0 );

    public void columnSelectionChanged( javax.swing.event.ListSelectionEvent arg0 ) {
        __columnSelectionChanged( arg0 );
    }

}
