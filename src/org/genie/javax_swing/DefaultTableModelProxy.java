
/// class javax.swing.table.DefaultTableModel ///

package org.genie.javax_swing;

public class DefaultTableModelProxy extends javax.swing.table.DefaultTableModel {

    long swiftObject;

    /// public javax.swing.table.DefaultTableModel(java.util.Vector,int)

    DefaultTableModelProxy( java.util.Vector arg0, int arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel()

    DefaultTableModelProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(int,int)

    DefaultTableModelProxy( int arg0, int arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.lang.Object[][],java.lang.Object[])

    DefaultTableModelProxy( java.lang.Object[][] arg0, java.lang.Object[] arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.lang.Object[],int)

    DefaultTableModelProxy( java.lang.Object[] arg0, int arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.util.Vector,java.util.Vector)

    DefaultTableModelProxy( java.util.Vector arg0, java.util.Vector arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public boolean javax.swing.table.DefaultTableModel.isCellEditable(int,int)

    public native boolean __isCellEditable( int arg0, int arg1 );

    boolean entered_isCellEditable_0;

    public boolean isCellEditable( int arg0, int arg1 ) {
        if ( !entered_isCellEditable_0 ) {
            entered_isCellEditable_0 = true;
            boolean __return = __isCellEditable( arg0, arg1 );
            entered_isCellEditable_0 = false;
            return __return;
        }
        else
            return super.isCellEditable( arg0, arg1 );
    }

}
