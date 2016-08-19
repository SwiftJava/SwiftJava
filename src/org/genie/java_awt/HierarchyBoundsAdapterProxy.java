
/// class java.awt.event.HierarchyBoundsAdapter ///

package org.genie.java_awt;

public class HierarchyBoundsAdapterProxy extends java.awt.event.HierarchyBoundsAdapter {

    long swiftObject;

    /// public java.awt.event.HierarchyBoundsAdapter()

    HierarchyBoundsAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.event.HierarchyBoundsAdapter.ancestorMoved(java.awt.event.HierarchyEvent)

    public native void __ancestorMoved( java.awt.event.HierarchyEvent e );

    boolean entered_ancestorMoved_0;

    public void ancestorMoved( java.awt.event.HierarchyEvent e ) {
        if ( !entered_ancestorMoved_0 ) {
            entered_ancestorMoved_0 = true;
            __ancestorMoved( e );
            entered_ancestorMoved_0 = false;
        }
        else
            super.ancestorMoved( e );
    }

    /// public void java.awt.event.HierarchyBoundsAdapter.ancestorResized(java.awt.event.HierarchyEvent)

    public native void __ancestorResized( java.awt.event.HierarchyEvent e );

    boolean entered_ancestorResized_1;

    public void ancestorResized( java.awt.event.HierarchyEvent e ) {
        if ( !entered_ancestorResized_1 ) {
            entered_ancestorResized_1 = true;
            __ancestorResized( e );
            entered_ancestorResized_1 = false;
        }
        else
            super.ancestorResized( e );
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
