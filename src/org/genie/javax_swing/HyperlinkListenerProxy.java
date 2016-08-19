
/// interface javax.swing.event.HyperlinkListener ///

package org.genie.javax_swing;

public class HyperlinkListenerProxy implements javax.swing.event.HyperlinkListener {

    long swiftObject;

    HyperlinkListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.HyperlinkListener.hyperlinkUpdate(javax.swing.event.HyperlinkEvent)

    public native void __hyperlinkUpdate( javax.swing.event.HyperlinkEvent e );

    public void hyperlinkUpdate( javax.swing.event.HyperlinkEvent e ) {
        __hyperlinkUpdate( e );
    }

}
