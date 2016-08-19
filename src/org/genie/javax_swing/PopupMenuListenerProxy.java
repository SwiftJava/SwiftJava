
/// interface javax.swing.event.PopupMenuListener ///

package org.genie.javax_swing;

public class PopupMenuListenerProxy implements javax.swing.event.PopupMenuListener {

    long swiftObject;

    PopupMenuListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuWillBecomeVisible( javax.swing.event.PopupMenuEvent e );

    public void popupMenuWillBecomeVisible( javax.swing.event.PopupMenuEvent e ) {
        __popupMenuWillBecomeVisible( e );
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuWillBecomeInvisible( javax.swing.event.PopupMenuEvent e );

    public void popupMenuWillBecomeInvisible( javax.swing.event.PopupMenuEvent e ) {
        __popupMenuWillBecomeInvisible( e );
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuCanceled(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuCanceled( javax.swing.event.PopupMenuEvent e );

    public void popupMenuCanceled( javax.swing.event.PopupMenuEvent e ) {
        __popupMenuCanceled( e );
    }

}
