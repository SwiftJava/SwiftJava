
/// interface javax.swing.event.MenuKeyListener ///

package org.genie.javax_swing;

public class MenuKeyListenerProxy implements javax.swing.event.MenuKeyListener {

    long swiftObject;

    MenuKeyListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.MenuKeyListener.menuKeyPressed(javax.swing.event.MenuKeyEvent)

    public native void __menuKeyPressed( javax.swing.event.MenuKeyEvent arg0 );

    public void menuKeyPressed( javax.swing.event.MenuKeyEvent arg0 ) {
        __menuKeyPressed( arg0 );
    }

    /// public abstract void javax.swing.event.MenuKeyListener.menuKeyReleased(javax.swing.event.MenuKeyEvent)

    public native void __menuKeyReleased( javax.swing.event.MenuKeyEvent arg0 );

    public void menuKeyReleased( javax.swing.event.MenuKeyEvent arg0 ) {
        __menuKeyReleased( arg0 );
    }

    /// public abstract void javax.swing.event.MenuKeyListener.menuKeyTyped(javax.swing.event.MenuKeyEvent)

    public native void __menuKeyTyped( javax.swing.event.MenuKeyEvent arg0 );

    public void menuKeyTyped( javax.swing.event.MenuKeyEvent arg0 ) {
        __menuKeyTyped( arg0 );
    }

}
