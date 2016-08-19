
/// interface javax.swing.DesktopManager ///

package org.genie.javax_swing;

public class DesktopManagerProxy implements javax.swing.DesktopManager {

    long swiftObject;

    DesktopManagerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.DesktopManager.openFrame(javax.swing.JInternalFrame)

    public native void __openFrame( javax.swing.JInternalFrame f );

    public void openFrame( javax.swing.JInternalFrame f ) {
        __openFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.closeFrame(javax.swing.JInternalFrame)

    public native void __closeFrame( javax.swing.JInternalFrame f );

    public void closeFrame( javax.swing.JInternalFrame f ) {
        __closeFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.maximizeFrame(javax.swing.JInternalFrame)

    public native void __maximizeFrame( javax.swing.JInternalFrame f );

    public void maximizeFrame( javax.swing.JInternalFrame f ) {
        __maximizeFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.minimizeFrame(javax.swing.JInternalFrame)

    public native void __minimizeFrame( javax.swing.JInternalFrame f );

    public void minimizeFrame( javax.swing.JInternalFrame f ) {
        __minimizeFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.iconifyFrame(javax.swing.JInternalFrame)

    public native void __iconifyFrame( javax.swing.JInternalFrame f );

    public void iconifyFrame( javax.swing.JInternalFrame f ) {
        __iconifyFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.deiconifyFrame(javax.swing.JInternalFrame)

    public native void __deiconifyFrame( javax.swing.JInternalFrame f );

    public void deiconifyFrame( javax.swing.JInternalFrame f ) {
        __deiconifyFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.activateFrame(javax.swing.JInternalFrame)

    public native void __activateFrame( javax.swing.JInternalFrame f );

    public void activateFrame( javax.swing.JInternalFrame f ) {
        __activateFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.deactivateFrame(javax.swing.JInternalFrame)

    public native void __deactivateFrame( javax.swing.JInternalFrame f );

    public void deactivateFrame( javax.swing.JInternalFrame f ) {
        __deactivateFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.beginDraggingFrame(javax.swing.JComponent)

    public native void __beginDraggingFrame( javax.swing.JComponent f );

    public void beginDraggingFrame( javax.swing.JComponent f ) {
        __beginDraggingFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.dragFrame(javax.swing.JComponent,int,int)

    public native void __dragFrame( javax.swing.JComponent f, int newX, int newY );

    public void dragFrame( javax.swing.JComponent f, int newX, int newY ) {
        __dragFrame( f, newX, newY );
    }

    /// public abstract void javax.swing.DesktopManager.endDraggingFrame(javax.swing.JComponent)

    public native void __endDraggingFrame( javax.swing.JComponent f );

    public void endDraggingFrame( javax.swing.JComponent f ) {
        __endDraggingFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.beginResizingFrame(javax.swing.JComponent,int)

    public native void __beginResizingFrame( javax.swing.JComponent f, int direction );

    public void beginResizingFrame( javax.swing.JComponent f, int direction ) {
        __beginResizingFrame( f, direction );
    }

    /// public abstract void javax.swing.DesktopManager.resizeFrame(javax.swing.JComponent,int,int,int,int)

    public native void __resizeFrame( javax.swing.JComponent f, int newX, int newY, int newWidth, int newHeight );

    public void resizeFrame( javax.swing.JComponent f, int newX, int newY, int newWidth, int newHeight ) {
        __resizeFrame( f, newX, newY, newWidth, newHeight );
    }

    /// public abstract void javax.swing.DesktopManager.endResizingFrame(javax.swing.JComponent)

    public native void __endResizingFrame( javax.swing.JComponent f );

    public void endResizingFrame( javax.swing.JComponent f ) {
        __endResizingFrame( f );
    }

    /// public abstract void javax.swing.DesktopManager.setBoundsForFrame(javax.swing.JComponent,int,int,int,int)

    public native void __setBoundsForFrame( javax.swing.JComponent f, int newX, int newY, int newWidth, int newHeight );

    public void setBoundsForFrame( javax.swing.JComponent f, int newX, int newY, int newWidth, int newHeight ) {
        __setBoundsForFrame( f, newX, newY, newWidth, newHeight );
    }

}
