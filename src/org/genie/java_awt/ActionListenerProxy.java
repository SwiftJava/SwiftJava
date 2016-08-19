
/// interface java.awt.event.ActionListener ///

package org.genie.java_awt;

public class ActionListenerProxy implements java.awt.event.ActionListener {

    long swiftObject;

    ActionListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.ActionListener.actionPerformed(java.awt.event.ActionEvent)

    public native void __actionPerformed( java.awt.event.ActionEvent e );

    public void actionPerformed( java.awt.event.ActionEvent e ) {
        __actionPerformed( e );
    }

}
