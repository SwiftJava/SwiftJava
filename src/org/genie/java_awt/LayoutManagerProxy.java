
/// interface java.awt.LayoutManager ///

package org.genie.java_awt;

public class LayoutManagerProxy implements java.awt.LayoutManager {

    long swiftObject;

    LayoutManagerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.LayoutManager.removeLayoutComponent(java.awt.Component)

    public native void __removeLayoutComponent( java.awt.Component comp );

    public void removeLayoutComponent( java.awt.Component comp ) {
        __removeLayoutComponent( comp );
    }

    /// public abstract void java.awt.LayoutManager.addLayoutComponent(java.lang.String,java.awt.Component)

    public native void __addLayoutComponent( java.lang.String name, java.awt.Component comp );

    public void addLayoutComponent( java.lang.String name, java.awt.Component comp ) {
        __addLayoutComponent( name, comp );
    }

    /// public abstract void java.awt.LayoutManager.layoutContainer(java.awt.Container)

    public native void __layoutContainer( java.awt.Container parent );

    public void layoutContainer( java.awt.Container parent ) {
        __layoutContainer( parent );
    }

    /// public abstract java.awt.Dimension java.awt.LayoutManager.preferredLayoutSize(java.awt.Container)

    public native java.awt.Dimension __preferredLayoutSize( java.awt.Container parent );

    public java.awt.Dimension preferredLayoutSize( java.awt.Container parent ) {
        return __preferredLayoutSize( parent );
    }

    /// public abstract java.awt.Dimension java.awt.LayoutManager.minimumLayoutSize(java.awt.Container)

    public native java.awt.Dimension __minimumLayoutSize( java.awt.Container parent );

    public java.awt.Dimension minimumLayoutSize( java.awt.Container parent ) {
        return __minimumLayoutSize( parent );
    }

}
