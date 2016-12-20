
/// interface java.awt.event.KeyListener ///

package org.genie.java_awt;

public class KeyListenerProxy implements java.awt.event.KeyListener {

    long swiftObject;

    KeyListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.KeyListener.keyTyped(java.awt.event.KeyEvent)

    public native void __keyTyped( java.awt.event.KeyEvent arg0 );

    public void keyTyped( java.awt.event.KeyEvent arg0 ) {
        __keyTyped( arg0 );
    }

    /// public abstract void java.awt.event.KeyListener.keyPressed(java.awt.event.KeyEvent)

    public native void __keyPressed( java.awt.event.KeyEvent arg0 );

    public void keyPressed( java.awt.event.KeyEvent arg0 ) {
        __keyPressed( arg0 );
    }

    /// public abstract void java.awt.event.KeyListener.keyReleased(java.awt.event.KeyEvent)

    public native void __keyReleased( java.awt.event.KeyEvent arg0 );

    public void keyReleased( java.awt.event.KeyEvent arg0 ) {
        __keyReleased( arg0 );
    }

}
