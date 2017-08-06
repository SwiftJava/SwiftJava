
/// interface java.awt.datatransfer.FlavorListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class FlavorListenerProxy implements java.awt.datatransfer.FlavorListener {

    long __swiftObject;

    FlavorListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.datatransfer.FlavorListener.flavorsChanged(java.awt.datatransfer.FlavorEvent)

    public native void __flavorsChanged( long __swiftObject, java.awt.datatransfer.FlavorEvent e );

    public void flavorsChanged( java.awt.datatransfer.FlavorEvent e ) {
        __flavorsChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
