
/// interface javax.swing.event.PopupMenuListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class PopupMenuListenerProxy implements javax.swing.event.PopupMenuListener {

    long __swiftObject;

    PopupMenuListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuWillBecomeVisible( long __swiftObject, javax.swing.event.PopupMenuEvent e );

    public void popupMenuWillBecomeVisible( javax.swing.event.PopupMenuEvent e ) {
        __popupMenuWillBecomeVisible( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuWillBecomeInvisible( long __swiftObject, javax.swing.event.PopupMenuEvent e );

    public void popupMenuWillBecomeInvisible( javax.swing.event.PopupMenuEvent e ) {
        __popupMenuWillBecomeInvisible( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.PopupMenuListener.popupMenuCanceled(javax.swing.event.PopupMenuEvent)

    public native void __popupMenuCanceled( long __swiftObject, javax.swing.event.PopupMenuEvent e );

    public void popupMenuCanceled( javax.swing.event.PopupMenuEvent e ) {
        __popupMenuCanceled( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
