
/// interface javax.swing.event.CellEditorListener ///

package org.genie.javax_swing;

public class CellEditorListenerProxy implements javax.swing.event.CellEditorListener {

    long swiftObject;

    CellEditorListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.CellEditorListener.editingStopped(javax.swing.event.ChangeEvent)

    public native void __editingStopped( javax.swing.event.ChangeEvent e );

    public void editingStopped( javax.swing.event.ChangeEvent e ) {
        __editingStopped( e );
    }

    /// public abstract void javax.swing.event.CellEditorListener.editingCanceled(javax.swing.event.ChangeEvent)

    public native void __editingCanceled( javax.swing.event.ChangeEvent e );

    public void editingCanceled( javax.swing.event.ChangeEvent e ) {
        __editingCanceled( e );
    }

}
