
/// class java.awt.event.ContainerAdapter ///

package org.genie.java_awt;

public class ContainerAdapterProxy extends java.awt.event.ContainerAdapter {

    long swiftObject;

    /// public java.awt.event.ContainerAdapter()

    ContainerAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.event.ContainerAdapter.componentAdded(java.awt.event.ContainerEvent)

    public native void __componentAdded( java.awt.event.ContainerEvent e );

    boolean entered_componentAdded_0;

    public void componentAdded( java.awt.event.ContainerEvent e ) {
        if ( !entered_componentAdded_0 ) {
            entered_componentAdded_0 = true;
            __componentAdded( e );
            entered_componentAdded_0 = false;
        }
        else
            super.componentAdded( e );
    }

    /// public void java.awt.event.ContainerAdapter.componentRemoved(java.awt.event.ContainerEvent)

    public native void __componentRemoved( java.awt.event.ContainerEvent e );

    boolean entered_componentRemoved_1;

    public void componentRemoved( java.awt.event.ContainerEvent e ) {
        if ( !entered_componentRemoved_1 ) {
            entered_componentRemoved_1 = true;
            __componentRemoved( e );
            entered_componentRemoved_1 = false;
        }
        else
            super.componentRemoved( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_2;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_2 ) {
            entered_equals_2 = true;
            boolean __return = __equals( arg0 );
            entered_equals_2 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_3;

    public java.lang.String toString() {
        if ( !entered_toString_3 ) {
            entered_toString_3 = true;
            java.lang.String __return = __toString( );
            entered_toString_3 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_4;

    public int hashCode() {
        if ( !entered_hashCode_4 ) {
            entered_hashCode_4 = true;
            int __return = __hashCode( );
            entered_hashCode_4 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
