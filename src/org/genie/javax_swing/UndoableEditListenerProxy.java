
/// interface javax.swing.event.UndoableEditListener ///

package org.genie.javax_swing;

public class UndoableEditListenerProxy implements javax.swing.event.UndoableEditListener {

    long swiftObject;

    UndoableEditListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.UndoableEditListener.undoableEditHappened(javax.swing.event.UndoableEditEvent)

    public native void __undoableEditHappened( javax.swing.event.UndoableEditEvent arg0 );

    public void undoableEditHappened( javax.swing.event.UndoableEditEvent arg0 ) {
        __undoableEditHappened( arg0 );
    }

}
