
/// interface javax.swing.event.TableColumnModelListener ///

package org.genie.javax_swing;

public class TableColumnModelListenerProxy implements javax.swing.event.TableColumnModelListener {

    long swiftObject;

    TableColumnModelListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnAdded(javax.swing.event.TableColumnModelEvent)

    public native void __columnAdded( javax.swing.event.TableColumnModelEvent e );

    public void columnAdded( javax.swing.event.TableColumnModelEvent e ) {
        __columnAdded( e );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnRemoved(javax.swing.event.TableColumnModelEvent)

    public native void __columnRemoved( javax.swing.event.TableColumnModelEvent e );

    public void columnRemoved( javax.swing.event.TableColumnModelEvent e ) {
        __columnRemoved( e );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnMoved(javax.swing.event.TableColumnModelEvent)

    public native void __columnMoved( javax.swing.event.TableColumnModelEvent e );

    public void columnMoved( javax.swing.event.TableColumnModelEvent e ) {
        __columnMoved( e );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnMarginChanged(javax.swing.event.ChangeEvent)

    public native void __columnMarginChanged( javax.swing.event.ChangeEvent e );

    public void columnMarginChanged( javax.swing.event.ChangeEvent e ) {
        __columnMarginChanged( e );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnSelectionChanged(javax.swing.event.ListSelectionEvent)

    public native void __columnSelectionChanged( javax.swing.event.ListSelectionEvent e );

    public void columnSelectionChanged( javax.swing.event.ListSelectionEvent e ) {
        __columnSelectionChanged( e );
    }

}
