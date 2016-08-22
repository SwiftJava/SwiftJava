
/// class javax.swing.table.DefaultTableModel ///

package org.genie.javax_swing;

public class DefaultTableModelProxy extends javax.swing.table.DefaultTableModel {

    long swiftObject;

    /// public javax.swing.table.DefaultTableModel(java.util.Vector,int)

    DefaultTableModelProxy( java.util.Vector columnNames, int rowCount , long swiftObject ) {
        super( columnNames, rowCount );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.lang.Object[],int)

    DefaultTableModelProxy( java.lang.Object[] columnNames, int rowCount , long swiftObject ) {
        super( columnNames, rowCount );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.util.Vector,java.util.Vector)

    DefaultTableModelProxy( java.util.Vector data, java.util.Vector columnNames , long swiftObject ) {
        super( data, columnNames );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.lang.Object[][],java.lang.Object[])

    DefaultTableModelProxy( java.lang.Object[][] data, java.lang.Object[] columnNames , long swiftObject ) {
        super( data, columnNames );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel()

    DefaultTableModelProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(int,int)

    DefaultTableModelProxy( int rowCount, int columnCount , long swiftObject ) {
        super( rowCount, columnCount );
        this.swiftObject = swiftObject;
    }

    /// public boolean javax.swing.table.DefaultTableModel.isCellEditable(int,int)

    public native boolean __isCellEditable( int row, int column );

    boolean entered_isCellEditable_0;

    public boolean isCellEditable( int row, int column ) {
        if ( !entered_isCellEditable_0 ) {
            entered_isCellEditable_0 = true;
            boolean __return = __isCellEditable( row, column );
            entered_isCellEditable_0 = false;
            return __return;
        }
        else
            return super.isCellEditable( row, column );
    }

}
