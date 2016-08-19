
/// interface java.awt.event.KeyListener ///

package org.genie.java_awt;

public class KeyListenerProxy implements java.awt.event.KeyListener {

    long swiftObject;

    KeyListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.KeyListener.keyTyped(java.awt.event.KeyEvent)

    public native void __keyTyped( java.awt.event.KeyEvent e );

    public void keyTyped( java.awt.event.KeyEvent e ) {
        __keyTyped( e );
    }

    /// public abstract void java.awt.event.KeyListener.keyPressed(java.awt.event.KeyEvent)

    public native void __keyPressed( java.awt.event.KeyEvent e );

    public void keyPressed( java.awt.event.KeyEvent e ) {
        __keyPressed( e );
    }

    /// public abstract void java.awt.event.KeyListener.keyReleased(java.awt.event.KeyEvent)

    public native void __keyReleased( java.awt.event.KeyEvent e );

    public void keyReleased( java.awt.event.KeyEvent e ) {
        __keyReleased( e );
    }

}
