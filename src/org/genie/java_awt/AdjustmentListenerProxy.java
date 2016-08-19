
/// interface java.awt.event.AdjustmentListener ///

package org.genie.java_awt;

public class AdjustmentListenerProxy implements java.awt.event.AdjustmentListener {

    long swiftObject;

    AdjustmentListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.AdjustmentListener.adjustmentValueChanged(java.awt.event.AdjustmentEvent)

    public native void __adjustmentValueChanged( java.awt.event.AdjustmentEvent e );

    public void adjustmentValueChanged( java.awt.event.AdjustmentEvent e ) {
        __adjustmentValueChanged( e );
    }

}
