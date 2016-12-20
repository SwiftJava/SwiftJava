
/// class javax.swing.table.DefaultTableCellRenderer ///

package org.genie.javax_swing;

public class DefaultTableCellRendererProxy extends javax.swing.table.DefaultTableCellRenderer {

    long swiftObject;

    /// public javax.swing.table.DefaultTableCellRenderer()

    DefaultTableCellRendererProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public java.awt.Component javax.swing.table.DefaultTableCellRenderer.getTableCellRendererComponent(javax.swing.JTable,java.lang.Object,boolean,boolean,int,int)

    public native java.awt.Component __getTableCellRendererComponent( javax.swing.JTable arg0, java.lang.Object arg1, boolean arg2, boolean arg3, int arg4, int arg5 );

    boolean entered_getTableCellRendererComponent_0;

    public java.awt.Component getTableCellRendererComponent( javax.swing.JTable arg0, java.lang.Object arg1, boolean arg2, boolean arg3, int arg4, int arg5 ) {
        if ( !entered_getTableCellRendererComponent_0 ) {
            entered_getTableCellRendererComponent_0 = true;
            java.awt.Component __return = __getTableCellRendererComponent( arg0, arg1, arg2, arg3, arg4, arg5 );
            entered_getTableCellRendererComponent_0 = false;
            return __return;
        }
        else
            return super.getTableCellRendererComponent( arg0, arg1, arg2, arg3, arg4, arg5 );
    }

}
