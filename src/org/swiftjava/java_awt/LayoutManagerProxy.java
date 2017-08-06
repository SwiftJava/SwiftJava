
/// interface java.awt.LayoutManager ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class LayoutManagerProxy implements java.awt.LayoutManager {

    long __swiftObject;

    LayoutManagerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.LayoutManager.removeLayoutComponent(java.awt.Component)

    public native void __removeLayoutComponent( long __swiftObject, java.awt.Component comp );

    public void removeLayoutComponent( java.awt.Component comp ) {
        __removeLayoutComponent( __swiftObject, comp );
    }

    /// public abstract void java.awt.LayoutManager.addLayoutComponent(java.lang.String,java.awt.Component)

    public native void __addLayoutComponent( long __swiftObject, java.lang.String name, java.awt.Component comp );

    public void addLayoutComponent( java.lang.String name, java.awt.Component comp ) {
        __addLayoutComponent( __swiftObject, name, comp );
    }

    /// public abstract void java.awt.LayoutManager.layoutContainer(java.awt.Container)

    public native void __layoutContainer( long __swiftObject, java.awt.Container parent );

    public void layoutContainer( java.awt.Container parent ) {
        __layoutContainer( __swiftObject, parent );
    }

    /// public abstract java.awt.Dimension java.awt.LayoutManager.preferredLayoutSize(java.awt.Container)

    public native java.awt.Dimension __preferredLayoutSize( long __swiftObject, java.awt.Container parent );

    public java.awt.Dimension preferredLayoutSize( java.awt.Container parent ) {
        return __preferredLayoutSize( __swiftObject, parent );
    }

    /// public abstract java.awt.Dimension java.awt.LayoutManager.minimumLayoutSize(java.awt.Container)

    public native java.awt.Dimension __minimumLayoutSize( long __swiftObject, java.awt.Container parent );

    public java.awt.Dimension minimumLayoutSize( java.awt.Container parent ) {
        return __minimumLayoutSize( __swiftObject, parent );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
