
/// class java.awt.event.ComponentAdapter ///

package org.genie.java_awt;

public class ComponentAdapterProxy extends java.awt.event.ComponentAdapter {

    long swiftObject;

    /// public java.awt.event.ComponentAdapter()

    ComponentAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.event.ComponentAdapter.componentResized(java.awt.event.ComponentEvent)

    public native void __componentResized( java.awt.event.ComponentEvent e );

    boolean entered_componentResized_0;

    public void componentResized( java.awt.event.ComponentEvent e ) {
        if ( !entered_componentResized_0 ) {
            entered_componentResized_0 = true;
            __componentResized( e );
            entered_componentResized_0 = false;
        }
        else
            super.componentResized( e );
    }

    /// public void java.awt.event.ComponentAdapter.componentMoved(java.awt.event.ComponentEvent)

    public native void __componentMoved( java.awt.event.ComponentEvent e );

    boolean entered_componentMoved_1;

    public void componentMoved( java.awt.event.ComponentEvent e ) {
        if ( !entered_componentMoved_1 ) {
            entered_componentMoved_1 = true;
            __componentMoved( e );
            entered_componentMoved_1 = false;
        }
        else
            super.componentMoved( e );
    }

    /// public void java.awt.event.ComponentAdapter.componentShown(java.awt.event.ComponentEvent)

    public native void __componentShown( java.awt.event.ComponentEvent e );

    boolean entered_componentShown_2;

    public void componentShown( java.awt.event.ComponentEvent e ) {
        if ( !entered_componentShown_2 ) {
            entered_componentShown_2 = true;
            __componentShown( e );
            entered_componentShown_2 = false;
        }
        else
            super.componentShown( e );
    }

    /// public void java.awt.event.ComponentAdapter.componentHidden(java.awt.event.ComponentEvent)

    public native void __componentHidden( java.awt.event.ComponentEvent e );

    boolean entered_componentHidden_3;

    public void componentHidden( java.awt.event.ComponentEvent e ) {
        if ( !entered_componentHidden_3 ) {
            entered_componentHidden_3 = true;
            __componentHidden( e );
            entered_componentHidden_3 = false;
        }
        else
            super.componentHidden( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_4;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_4 ) {
            entered_equals_4 = true;
            boolean __return = __equals( arg0 );
            entered_equals_4 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_5;

    public java.lang.String toString() {
        if ( !entered_toString_5 ) {
            entered_toString_5 = true;
            java.lang.String __return = __toString( );
            entered_toString_5 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_6;

    public int hashCode() {
        if ( !entered_hashCode_6 ) {
            entered_hashCode_6 = true;
            int __return = __hashCode( );
            entered_hashCode_6 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
