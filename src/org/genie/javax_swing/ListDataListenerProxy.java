
/// interface javax.swing.event.ListDataListener ///

package org.genie.javax_swing;

public class ListDataListenerProxy implements javax.swing.event.ListDataListener {

    long swiftObject;

    ListDataListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.ListDataListener.contentsChanged(javax.swing.event.ListDataEvent)

    public native void __contentsChanged( javax.swing.event.ListDataEvent e );

    public void contentsChanged( javax.swing.event.ListDataEvent e ) {
        __contentsChanged( e );
    }

    /// public abstract void javax.swing.event.ListDataListener.intervalAdded(javax.swing.event.ListDataEvent)

    public native void __intervalAdded( javax.swing.event.ListDataEvent e );

    public void intervalAdded( javax.swing.event.ListDataEvent e ) {
        __intervalAdded( e );
    }

    /// public abstract void javax.swing.event.ListDataListener.intervalRemoved(javax.swing.event.ListDataEvent)

    public native void __intervalRemoved( javax.swing.event.ListDataEvent e );

    public void intervalRemoved( javax.swing.event.ListDataEvent e ) {
        __intervalRemoved( e );
    }

}
