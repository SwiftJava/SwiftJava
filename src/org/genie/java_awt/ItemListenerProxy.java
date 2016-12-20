
/// interface java.awt.event.ItemListener ///

package org.genie.java_awt;

public class ItemListenerProxy implements java.awt.event.ItemListener {

    long swiftObject;

    ItemListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.ItemListener.itemStateChanged(java.awt.event.ItemEvent)

    public native void __itemStateChanged( java.awt.event.ItemEvent arg0 );

    public void itemStateChanged( java.awt.event.ItemEvent arg0 ) {
        __itemStateChanged( arg0 );
    }

}
