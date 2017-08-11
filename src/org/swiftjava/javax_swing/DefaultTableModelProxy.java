
/// class javax.swing.table.DefaultTableModel ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class DefaultTableModelProxy extends javax.swing.table.DefaultTableModel {

    long __swiftObject;

    /// public javax.swing.table.DefaultTableModel(java.util.Vector,int)

    DefaultTableModelProxy( java.util.Vector columnNames, int rowCount , long __swiftObject ) {
        super( columnNames, rowCount );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.lang.Object[],int)

    DefaultTableModelProxy( java.lang.Object[] columnNames, int rowCount , long __swiftObject ) {
        super( columnNames, rowCount );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.util.Vector,java.util.Vector)

    DefaultTableModelProxy( java.util.Vector data, java.util.Vector columnNames , long __swiftObject ) {
        super( data, columnNames );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(java.lang.Object[][],java.lang.Object[])

    DefaultTableModelProxy( java.lang.Object[][] data, java.lang.Object[] columnNames , long __swiftObject ) {
        super( data, columnNames );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel(int,int)

    DefaultTableModelProxy( int rowCount, int columnCount , long __swiftObject ) {
        super( rowCount, columnCount );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.table.DefaultTableModel()

    DefaultTableModelProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public boolean javax.swing.table.DefaultTableModel.isCellEditable(int,int)

    public native boolean __isCellEditable( long __swiftObject, int row, int column );

    boolean entered_isCellEditable_0;

    public boolean isCellEditable( int row, int column ) {
        if ( !entered_isCellEditable_0 ) {
            entered_isCellEditable_0 = true;
            boolean __return = __isCellEditable( __swiftObject, row, column);
            entered_isCellEditable_0 = false;
            return __return;
        }
        else
            return super.isCellEditable( row, column );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
