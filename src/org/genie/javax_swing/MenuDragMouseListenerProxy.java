
/// interface javax.swing.event.MenuDragMouseListener ///

package org.genie.javax_swing;

public class MenuDragMouseListenerProxy implements javax.swing.event.MenuDragMouseListener {

    long swiftObject;

    MenuDragMouseListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.MenuDragMouseListener.menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent)

    public native void __menuDragMouseEntered( javax.swing.event.MenuDragMouseEvent arg0 );

    public void menuDragMouseEntered( javax.swing.event.MenuDragMouseEvent arg0 ) {
        __menuDragMouseEntered( arg0 );
    }

    /// public abstract void javax.swing.event.MenuDragMouseListener.menuDragMouseExited(javax.swing.event.MenuDragMouseEvent)

    public native void __menuDragMouseExited( javax.swing.event.MenuDragMouseEvent arg0 );

    public void menuDragMouseExited( javax.swing.event.MenuDragMouseEvent arg0 ) {
        __menuDragMouseExited( arg0 );
    }

    /// public abstract void javax.swing.event.MenuDragMouseListener.menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent)

    public native void __menuDragMouseDragged( javax.swing.event.MenuDragMouseEvent arg0 );

    public void menuDragMouseDragged( javax.swing.event.MenuDragMouseEvent arg0 ) {
        __menuDragMouseDragged( arg0 );
    }

    /// public abstract void javax.swing.event.MenuDragMouseListener.menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent)

    public native void __menuDragMouseReleased( javax.swing.event.MenuDragMouseEvent arg0 );

    public void menuDragMouseReleased( javax.swing.event.MenuDragMouseEvent arg0 ) {
        __menuDragMouseReleased( arg0 );
    }

}
