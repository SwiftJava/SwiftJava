
/// interface javax.swing.event.PopupMenuListener ///

package org.genie.javax_swing;

public class PopupMenuListenerProxy implements javax.swing.event.PopupMenuListener {

    long swiftObject;

    PopupMenuListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuWillBecomeVisible( javax.swing.event.PopupMenuEvent arg0 );

    public void popupMenuWillBecomeVisible( javax.swing.event.PopupMenuEvent arg0 ) {
        __popupMenuWillBecomeVisible( arg0 );
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuWillBecomeInvisible( javax.swing.event.PopupMenuEvent arg0 );

    public void popupMenuWillBecomeInvisible( javax.swing.event.PopupMenuEvent arg0 ) {
        __popupMenuWillBecomeInvisible( arg0 );
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuCanceled(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuCanceled( javax.swing.event.PopupMenuEvent arg0 );

    public void popupMenuCanceled( javax.swing.event.PopupMenuEvent arg0 ) {
        __popupMenuCanceled( arg0 );
    }

}
