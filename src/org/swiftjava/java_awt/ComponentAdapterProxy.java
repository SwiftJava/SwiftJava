
/// class java.awt.event.ComponentAdapter ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class ComponentAdapterProxy extends java.awt.event.ComponentAdapter {

    long __swiftObject;

    /// public java.awt.event.ComponentAdapter()

    ComponentAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void java.awt.event.ComponentAdapter.componentResized(java.awt.event.ComponentEvent)

    public native void __componentResized( long __swiftObject, java.awt.event.ComponentEvent e );

    boolean entered_componentResized_0;

    public void componentResized( java.awt.event.ComponentEvent e ) {
        if ( !entered_componentResized_0 ) {
            entered_componentResized_0 = true;
            __componentResized( __swiftObject, e);
            entered_componentResized_0 = false;
        }
        else
            super.componentResized( e );
    }

    /// public void java.awt.event.ComponentAdapter.componentMoved(java.awt.event.ComponentEvent)

    public native void __componentMoved( long __swiftObject, java.awt.event.ComponentEvent e );

    boolean entered_componentMoved_1;

    public void componentMoved( java.awt.event.ComponentEvent e ) {
        if ( !entered_componentMoved_1 ) {
            entered_componentMoved_1 = true;
            __componentMoved( __swiftObject, e);
            entered_componentMoved_1 = false;
        }
        else
            super.componentMoved( e );
    }

    /// public void java.awt.event.ComponentAdapter.componentShown(java.awt.event.ComponentEvent)

    public native void __componentShown( long __swiftObject, java.awt.event.ComponentEvent e );

    boolean entered_componentShown_2;

    public void componentShown( java.awt.event.ComponentEvent e ) {
        if ( !entered_componentShown_2 ) {
            entered_componentShown_2 = true;
            __componentShown( __swiftObject, e);
            entered_componentShown_2 = false;
        }
        else
            super.componentShown( e );
    }

    /// public void java.awt.event.ComponentAdapter.componentHidden(java.awt.event.ComponentEvent)

    public native void __componentHidden( long __swiftObject, java.awt.event.ComponentEvent e );

    boolean entered_componentHidden_3;

    public void componentHidden( java.awt.event.ComponentEvent e ) {
        if ( !entered_componentHidden_3 ) {
            entered_componentHidden_3 = true;
            __componentHidden( __swiftObject, e);
            entered_componentHidden_3 = false;
        }
        else
            super.componentHidden( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_4;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_4 ) {
            entered_equals_4 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_4 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_5;

    public java.lang.String toString() {
        if ( !entered_toString_5 ) {
            entered_toString_5 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_5 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_6;

    public int hashCode() {
        if ( !entered_hashCode_6 ) {
            entered_hashCode_6 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_6 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
