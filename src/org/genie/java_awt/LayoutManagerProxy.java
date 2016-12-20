
/// interface java.awt.LayoutManager ///

package org.genie.java_awt;

public class LayoutManagerProxy implements java.awt.LayoutManager {

    long swiftObject;

    LayoutManagerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.LayoutManager.removeLayoutComponent(java.awt.Component)

    public native void __removeLayoutComponent( java.awt.Component arg0 );

    public void removeLayoutComponent( java.awt.Component arg0 ) {
        __removeLayoutComponent( arg0 );
    }

    /// public abstract void java.awt.LayoutManager.addLayoutComponent(java.lang.String,java.awt.Component)

    public native void __addLayoutComponent( java.lang.String arg0, java.awt.Component arg1 );

    public void addLayoutComponent( java.lang.String arg0, java.awt.Component arg1 ) {
        __addLayoutComponent( arg0, arg1 );
    }

    /// public abstract void java.awt.LayoutManager.layoutContainer(java.awt.Container)

    public native void __layoutContainer( java.awt.Container arg0 );

    public void layoutContainer( java.awt.Container arg0 ) {
        __layoutContainer( arg0 );
    }

    /// public abstract java.awt.Dimension java.awt.LayoutManager.preferredLayoutSize(java.awt.Container)

    public native java.awt.Dimension __preferredLayoutSize( java.awt.Container arg0 );

    public java.awt.Dimension preferredLayoutSize( java.awt.Container arg0 ) {
        return __preferredLayoutSize( arg0 );
    }

    /// public abstract java.awt.Dimension java.awt.LayoutManager.minimumLayoutSize(java.awt.Container)

    public native java.awt.Dimension __minimumLayoutSize( java.awt.Container arg0 );

    public java.awt.Dimension minimumLayoutSize( java.awt.Container arg0 ) {
        return __minimumLayoutSize( arg0 );
    }

}
