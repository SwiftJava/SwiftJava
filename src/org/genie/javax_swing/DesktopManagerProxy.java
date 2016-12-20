
/// interface javax.swing.DesktopManager ///

package org.genie.javax_swing;

public class DesktopManagerProxy implements javax.swing.DesktopManager {

    long swiftObject;

    DesktopManagerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void javax.swing.DesktopManager.endDraggingFrame(javax.swing.JComponent)

    public native void __endDraggingFrame( javax.swing.JComponent arg0 );

    public void endDraggingFrame( javax.swing.JComponent arg0 ) {
        __endDraggingFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.beginDraggingFrame(javax.swing.JComponent)

    public native void __beginDraggingFrame( javax.swing.JComponent arg0 );

    public void beginDraggingFrame( javax.swing.JComponent arg0 ) {
        __beginDraggingFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.dragFrame(javax.swing.JComponent,int,int)

    public native void __dragFrame( javax.swing.JComponent arg0, int arg1, int arg2 );

    public void dragFrame( javax.swing.JComponent arg0, int arg1, int arg2 ) {
        __dragFrame( arg0, arg1, arg2 );
    }

    /// public abstract void javax.swing.DesktopManager.iconifyFrame(javax.swing.JInternalFrame)

    public native void __iconifyFrame( javax.swing.JInternalFrame arg0 );

    public void iconifyFrame( javax.swing.JInternalFrame arg0 ) {
        __iconifyFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.openFrame(javax.swing.JInternalFrame)

    public native void __openFrame( javax.swing.JInternalFrame arg0 );

    public void openFrame( javax.swing.JInternalFrame arg0 ) {
        __openFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.closeFrame(javax.swing.JInternalFrame)

    public native void __closeFrame( javax.swing.JInternalFrame arg0 );

    public void closeFrame( javax.swing.JInternalFrame arg0 ) {
        __closeFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.maximizeFrame(javax.swing.JInternalFrame)

    public native void __maximizeFrame( javax.swing.JInternalFrame arg0 );

    public void maximizeFrame( javax.swing.JInternalFrame arg0 ) {
        __maximizeFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.minimizeFrame(javax.swing.JInternalFrame)

    public native void __minimizeFrame( javax.swing.JInternalFrame arg0 );

    public void minimizeFrame( javax.swing.JInternalFrame arg0 ) {
        __minimizeFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.deiconifyFrame(javax.swing.JInternalFrame)

    public native void __deiconifyFrame( javax.swing.JInternalFrame arg0 );

    public void deiconifyFrame( javax.swing.JInternalFrame arg0 ) {
        __deiconifyFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.activateFrame(javax.swing.JInternalFrame)

    public native void __activateFrame( javax.swing.JInternalFrame arg0 );

    public void activateFrame( javax.swing.JInternalFrame arg0 ) {
        __activateFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.deactivateFrame(javax.swing.JInternalFrame)

    public native void __deactivateFrame( javax.swing.JInternalFrame arg0 );

    public void deactivateFrame( javax.swing.JInternalFrame arg0 ) {
        __deactivateFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.beginResizingFrame(javax.swing.JComponent,int)

    public native void __beginResizingFrame( javax.swing.JComponent arg0, int arg1 );

    public void beginResizingFrame( javax.swing.JComponent arg0, int arg1 ) {
        __beginResizingFrame( arg0, arg1 );
    }

    /// public abstract void javax.swing.DesktopManager.resizeFrame(javax.swing.JComponent,int,int,int,int)

    public native void __resizeFrame( javax.swing.JComponent arg0, int arg1, int arg2, int arg3, int arg4 );

    public void resizeFrame( javax.swing.JComponent arg0, int arg1, int arg2, int arg3, int arg4 ) {
        __resizeFrame( arg0, arg1, arg2, arg3, arg4 );
    }

    /// public abstract void javax.swing.DesktopManager.endResizingFrame(javax.swing.JComponent)

    public native void __endResizingFrame( javax.swing.JComponent arg0 );

    public void endResizingFrame( javax.swing.JComponent arg0 ) {
        __endResizingFrame( arg0 );
    }

    /// public abstract void javax.swing.DesktopManager.setBoundsForFrame(javax.swing.JComponent,int,int,int,int)

    public native void __setBoundsForFrame( javax.swing.JComponent arg0, int arg1, int arg2, int arg3, int arg4 );

    public void setBoundsForFrame( javax.swing.JComponent arg0, int arg1, int arg2, int arg3, int arg4 ) {
        __setBoundsForFrame( arg0, arg1, arg2, arg3, arg4 );
    }

}
