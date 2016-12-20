
/// interface java.awt.datatransfer.FlavorListener ///

package org.genie.java_awt;

public class FlavorListenerProxy implements java.awt.datatransfer.FlavorListener {

    long swiftObject;

    FlavorListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.datatransfer.FlavorListener.flavorsChanged(java.awt.datatransfer.FlavorEvent)

    public native void __flavorsChanged( java.awt.datatransfer.FlavorEvent arg0 );

    public void flavorsChanged( java.awt.datatransfer.FlavorEvent arg0 ) {
        __flavorsChanged( arg0 );
    }

}
