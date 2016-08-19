
/// class javax.swing.table.DefaultTableCellRenderer$UIResource ///

package org.genie.javax_swing;

public class DefaultTableCellRenderer_UIResourceProxy extends javax.swing.table.DefaultTableCellRenderer.UIResource {

    long swiftObject;

    /// public javax.swing.table.DefaultTableCellRenderer$UIResource()

    DefaultTableCellRenderer_UIResourceProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Component javax.swing.table.DefaultTableCellRenderer.getTableCellRendererComponent(javax.swing.JTable,java.lang.Object,boolean,boolean,int,int)

    public native java.awt.Component __getTableCellRendererComponent( javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column );

    boolean entered_getTableCellRendererComponent_0;

    public java.awt.Component getTableCellRendererComponent( javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column ) {
        if ( !entered_getTableCellRendererComponent_0 ) {
            entered_getTableCellRendererComponent_0 = true;
            java.awt.Component __return = __getTableCellRendererComponent( table, value, isSelected, hasFocus, row, column );
            entered_getTableCellRendererComponent_0 = false;
            return __return;
        }
        else
            return super.getTableCellRendererComponent( table, value, isSelected, hasFocus, row, column );
    }

}
