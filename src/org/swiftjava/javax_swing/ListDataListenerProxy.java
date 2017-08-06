
/// interface javax.swing.event.ListDataListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class ListDataListenerProxy implements javax.swing.event.ListDataListener {

    long __swiftObject;

    ListDataListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.ListDataListener.contentsChanged(javax.swing.event.ListDataEvent)

    public native void __contentsChanged( long __swiftObject, javax.swing.event.ListDataEvent e );

    public void contentsChanged( javax.swing.event.ListDataEvent e ) {
        __contentsChanged( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.ListDataListener.intervalAdded(javax.swing.event.ListDataEvent)

    public native void __intervalAdded( long __swiftObject, javax.swing.event.ListDataEvent e );

    public void intervalAdded( javax.swing.event.ListDataEvent e ) {
        __intervalAdded( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.ListDataListener.intervalRemoved(javax.swing.event.ListDataEvent)

    public native void __intervalRemoved( long __swiftObject, javax.swing.event.ListDataEvent e );

    public void intervalRemoved( javax.swing.event.ListDataEvent e ) {
        __intervalRemoved( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
