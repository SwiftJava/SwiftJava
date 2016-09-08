
/// interface javax.swing.event.AncestorListener ///

package org.genie.javax_swing;

public class AncestorListenerProxy implements javax.swing.event.AncestorListener {

    long swiftObject;

    AncestorListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.AncestorListener.ancestorAdded(javax.swing.event.AncestorEvent)

    public native void __ancestorAdded( javax.swing.event.AncestorEvent event );

    public void ancestorAdded( javax.swing.event.AncestorEvent event ) {
        __ancestorAdded( event );
    }

    /// public abstract void javax.swing.event.AncestorListener.ancestorRemoved(javax.swing.event.AncestorEvent)

    public native void __ancestorRemoved( javax.swing.event.AncestorEvent event );

    public void ancestorRemoved( javax.swing.event.AncestorEvent event ) {
        __ancestorRemoved( event );
    }

    /// public abstract void javax.swing.event.AncestorListener.ancestorMoved(javax.swing.event.AncestorEvent)

    public native void __ancestorMoved( javax.swing.event.AncestorEvent event );

    public void ancestorMoved( javax.swing.event.AncestorEvent event ) {
        __ancestorMoved( event );
    }

}
