
/// interface javax.swing.event.UndoableEditListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class UndoableEditListenerProxy implements javax.swing.event.UndoableEditListener {

    long __swiftObject;

    UndoableEditListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.UndoableEditListener.undoableEditHappened(javax.swing.event.UndoableEditEvent)

    public native void __undoableEditHappened( long __swiftObject, javax.swing.event.UndoableEditEvent e );

    public void undoableEditHappened( javax.swing.event.UndoableEditEvent e ) {
        __undoableEditHappened( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
