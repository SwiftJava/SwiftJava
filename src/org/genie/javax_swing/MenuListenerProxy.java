
/// interface javax.swing.event.MenuListener ///

package org.genie.javax_swing;

public class MenuListenerProxy implements javax.swing.event.MenuListener {

    long swiftObject;

    MenuListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.MenuListener.menuSelected(javax.swing.event.MenuEvent)

    public native void __menuSelected( javax.swing.event.MenuEvent e );

    public void menuSelected( javax.swing.event.MenuEvent e ) {
        __menuSelected( e );
    }

    /// public abstract void javax.swing.event.MenuListener.menuDeselected(javax.swing.event.MenuEvent)

    public native void __menuDeselected( javax.swing.event.MenuEvent e );

    public void menuDeselected( javax.swing.event.MenuEvent e ) {
        __menuDeselected( e );
    }

    /// public abstract void javax.swing.event.MenuListener.menuCanceled(javax.swing.event.MenuEvent)

    public native void __menuCanceled( javax.swing.event.MenuEvent e );

    public void menuCanceled( javax.swing.event.MenuEvent e ) {
        __menuCanceled( e );
    }

}
