
/// interface java.awt.event.ActionListener ///

package org.genie.java_awt;

public class ActionListenerProxy implements java.awt.event.ActionListener {

    long swiftObject;

    ActionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.ActionListener.actionPerformed(java.awt.event.ActionEvent)

    public native void __actionPerformed( java.awt.event.ActionEvent arg0 );

    public void actionPerformed( java.awt.event.ActionEvent arg0 ) {
        __actionPerformed( arg0 );
    }

}
