
/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// interface javax.swing.event.AncestorListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class AncestorListenerProxy implements javax.swing.event.AncestorListener {

    // address of proxy object
    long __swiftObject;

    AncestorListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.AncestorListener.ancestorAdded(javax.swing.event.AncestorEvent)

    public native void __ancestorAdded( long __swiftObject, javax.swing.event.AncestorEvent event );

    public void ancestorAdded( javax.swing.event.AncestorEvent event ) {
        __ancestorAdded( __swiftObject, event );
    }

    /// public abstract void javax.swing.event.AncestorListener.ancestorMoved(javax.swing.event.AncestorEvent)

    public native void __ancestorMoved( long __swiftObject, javax.swing.event.AncestorEvent event );

    public void ancestorMoved( javax.swing.event.AncestorEvent event ) {
        __ancestorMoved( __swiftObject, event );
    }

    /// public abstract void javax.swing.event.AncestorListener.ancestorRemoved(javax.swing.event.AncestorEvent)

    public native void __ancestorRemoved( long __swiftObject, javax.swing.event.AncestorEvent event );

    public void ancestorRemoved( javax.swing.event.AncestorEvent event ) {
        __ancestorRemoved( __swiftObject, event );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}