
/// interface javax.swing.event.HyperlinkListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class HyperlinkListenerProxy implements javax.swing.event.HyperlinkListener {

    long __swiftObject;

    HyperlinkListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.HyperlinkListener.hyperlinkUpdate(javax.swing.event.HyperlinkEvent)

    public native void __hyperlinkUpdate( long __swiftObject, javax.swing.event.HyperlinkEvent e );

    public void hyperlinkUpdate( javax.swing.event.HyperlinkEvent e ) {
        __hyperlinkUpdate( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
