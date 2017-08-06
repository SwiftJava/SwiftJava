
/// interface javax.swing.event.MenuKeyListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class MenuKeyListenerProxy implements javax.swing.event.MenuKeyListener {

    long __swiftObject;

    MenuKeyListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.MenuKeyListener.menuKeyPressed(javax.swing.event.MenuKeyEvent)

    public native void __menuKeyPressed( long __swiftObject, javax.swing.event.MenuKeyEvent e );

    public void menuKeyPressed( javax.swing.event.MenuKeyEvent e ) {
        __menuKeyPressed( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.MenuKeyListener.menuKeyReleased(javax.swing.event.MenuKeyEvent)

    public native void __menuKeyReleased( long __swiftObject, javax.swing.event.MenuKeyEvent e );

    public void menuKeyReleased( javax.swing.event.MenuKeyEvent e ) {
        __menuKeyReleased( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.MenuKeyListener.menuKeyTyped(javax.swing.event.MenuKeyEvent)

    public native void __menuKeyTyped( long __swiftObject, javax.swing.event.MenuKeyEvent e );

    public void menuKeyTyped( javax.swing.event.MenuKeyEvent e ) {
        __menuKeyTyped( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
