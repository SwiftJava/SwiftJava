
/// class java.awt.dnd.DragSourceAdapter ///

package org.genie.java_awt;

public class DragSourceAdapterProxy extends java.awt.dnd.DragSourceAdapter {

    long swiftObject;

    /// public java.awt.dnd.DragSourceAdapter()

    DragSourceAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragDropEnd(java.awt.dnd.DragSourceDropEvent)

    public native void __dragDropEnd( java.awt.dnd.DragSourceDropEvent dsde );

    boolean entered_dragDropEnd_0;

    public void dragDropEnd( java.awt.dnd.DragSourceDropEvent dsde ) {
        if ( !entered_dragDropEnd_0 ) {
            entered_dragDropEnd_0 = true;
            __dragDropEnd( dsde );
            entered_dragDropEnd_0 = false;
        }
        else
            super.dragDropEnd( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)

    public native void __dragMouseMoved( java.awt.dnd.DragSourceDragEvent dsde );

    boolean entered_dragMouseMoved_1;

    public void dragMouseMoved( java.awt.dnd.DragSourceDragEvent dsde ) {
        if ( !entered_dragMouseMoved_1 ) {
            entered_dragMouseMoved_1 = true;
            __dragMouseMoved( dsde );
            entered_dragMouseMoved_1 = false;
        }
        else
            super.dragMouseMoved( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragEnter(java.awt.dnd.DragSourceDragEvent)

    public native void __dragEnter( java.awt.dnd.DragSourceDragEvent dsde );

    boolean entered_dragEnter_2;

    public void dragEnter( java.awt.dnd.DragSourceDragEvent dsde ) {
        if ( !entered_dragEnter_2 ) {
            entered_dragEnter_2 = true;
            __dragEnter( dsde );
            entered_dragEnter_2 = false;
        }
        else
            super.dragEnter( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragOver(java.awt.dnd.DragSourceDragEvent)

    public native void __dragOver( java.awt.dnd.DragSourceDragEvent dsde );

    boolean entered_dragOver_3;

    public void dragOver( java.awt.dnd.DragSourceDragEvent dsde ) {
        if ( !entered_dragOver_3 ) {
            entered_dragOver_3 = true;
            __dragOver( dsde );
            entered_dragOver_3 = false;
        }
        else
            super.dragOver( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dropActionChanged(java.awt.dnd.DragSourceDragEvent)

    public native void __dropActionChanged( java.awt.dnd.DragSourceDragEvent dsde );

    boolean entered_dropActionChanged_4;

    public void dropActionChanged( java.awt.dnd.DragSourceDragEvent dsde ) {
        if ( !entered_dropActionChanged_4 ) {
            entered_dropActionChanged_4 = true;
            __dropActionChanged( dsde );
            entered_dropActionChanged_4 = false;
        }
        else
            super.dropActionChanged( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragExit(java.awt.dnd.DragSourceEvent)

    public native void __dragExit( java.awt.dnd.DragSourceEvent dse );

    boolean entered_dragExit_5;

    public void dragExit( java.awt.dnd.DragSourceEvent dse ) {
        if ( !entered_dragExit_5 ) {
            entered_dragExit_5 = true;
            __dragExit( dse );
            entered_dragExit_5 = false;
        }
        else
            super.dragExit( dse );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_6;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_6 ) {
            entered_equals_6 = true;
            boolean __return = __equals( arg0 );
            entered_equals_6 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_7;

    public java.lang.String toString() {
        if ( !entered_toString_7 ) {
            entered_toString_7 = true;
            java.lang.String __return = __toString( );
            entered_toString_7 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_8;

    public int hashCode() {
        if ( !entered_hashCode_8 ) {
            entered_hashCode_8 = true;
            int __return = __hashCode( );
            entered_hashCode_8 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
