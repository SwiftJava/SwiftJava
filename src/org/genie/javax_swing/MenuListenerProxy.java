
/// interface javax.swing.event.MenuListener ///

package org.genie.javax_swing;

public class MenuListenerProxy implements javax.swing.event.MenuListener {

    long swiftObject;

    MenuListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.MenuListener.menuSelected(javax.swing.event.MenuEvent)

    public native void __menuSelected( javax.swing.event.MenuEvent arg0 );

    public void menuSelected( javax.swing.event.MenuEvent arg0 ) {
        __menuSelected( arg0 );
    }

    /// public abstract void javax.swing.event.MenuListener.menuDeselected(javax.swing.event.MenuEvent)

    public native void __menuDeselected( javax.swing.event.MenuEvent arg0 );

    public void menuDeselected( javax.swing.event.MenuEvent arg0 ) {
        __menuDeselected( arg0 );
    }

    /// public abstract void javax.swing.event.MenuListener.menuCanceled(javax.swing.event.MenuEvent)

    public native void __menuCanceled( javax.swing.event.MenuEvent arg0 );

    public void menuCanceled( javax.swing.event.MenuEvent arg0 ) {
        __menuCanceled( arg0 );
    }

}
