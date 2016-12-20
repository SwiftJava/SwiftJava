
/// interface javax.swing.JComboBox$KeySelectionManager ///

package org.genie.javax_swing;

public class JComboBox_KeySelectionManagerProxy implements javax.swing.JComboBox.KeySelectionManager {

    long swiftObject;

    JComboBox_KeySelectionManagerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract int javax.swing.JComboBox$KeySelectionManager.selectionForKey(char,javax.swing.ComboBoxModel)

    public native int __selectionForKey( char arg0, javax.swing.ComboBoxModel arg1 );

    public int selectionForKey( char arg0, javax.swing.ComboBoxModel arg1 ) {
        return __selectionForKey( arg0, arg1 );
    }

}
