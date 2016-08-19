
/// class javax.swing.JTable ///

package org.genie.javax_swing;

public class JTableProxy extends javax.swing.JTable {

    long swiftObject;

    /// public javax.swing.JTable(javax.swing.table.TableModel,javax.swing.table.TableColumnModel,javax.swing.ListSelectionModel)

    JTableProxy( javax.swing.table.TableModel arg0, javax.swing.table.TableColumnModel arg1, javax.swing.ListSelectionModel arg2 , long swiftObject ) {
        super( arg0, arg1, arg2 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JTable(int,int)

    JTableProxy( int arg0, int arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JTable(java.util.Vector,java.util.Vector)

    JTableProxy( java.util.Vector arg0, java.util.Vector arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JTable(java.lang.Object[][],java.lang.Object[])

    JTableProxy( java.lang.Object[][] arg0, java.lang.Object[] arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JTable()

    JTableProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JTable(javax.swing.table.TableModel)

    JTableProxy( javax.swing.table.TableModel arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JTable(javax.swing.table.TableModel,javax.swing.table.TableColumnModel)

    JTableProxy( javax.swing.table.TableModel arg0, javax.swing.table.TableColumnModel arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public void javax.swing.JTable.changeSelection(int,int,boolean,boolean)

    public native void __changeSelection( int arg0, int arg1, boolean arg2, boolean arg3 );

    boolean entered_changeSelection_0;

    public void changeSelection( int arg0, int arg1, boolean arg2, boolean arg3 ) {
        if ( !entered_changeSelection_0 ) {
            entered_changeSelection_0 = true;
            __changeSelection( arg0, arg1, arg2, arg3 );
            entered_changeSelection_0 = false;
        }
        else
            super.changeSelection( arg0, arg1, arg2, arg3 );
    }

    /// public java.awt.Component javax.swing.JTable.prepareRenderer(javax.swing.table.TableCellRenderer,int,int)

    public native java.awt.Component __prepareRenderer( javax.swing.table.TableCellRenderer arg0, int arg1, int arg2 );

    boolean entered_prepareRenderer_1;

    public java.awt.Component prepareRenderer( javax.swing.table.TableCellRenderer arg0, int arg1, int arg2 ) {
        if ( !entered_prepareRenderer_1 ) {
            entered_prepareRenderer_1 = true;
            java.awt.Component __return = __prepareRenderer( arg0, arg1, arg2 );
            entered_prepareRenderer_1 = false;
            return __return;
        }
        else
            return super.prepareRenderer( arg0, arg1, arg2 );
    }

}
