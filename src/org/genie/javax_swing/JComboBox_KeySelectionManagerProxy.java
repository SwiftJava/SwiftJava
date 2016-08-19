
/// interface javax.swing.JComboBox$KeySelectionManager ///

package org.genie.javax_swing;

public class JComboBox_KeySelectionManagerProxy implements javax.swing.JComboBox.KeySelectionManager {

    long swiftObject;

    JComboBox_KeySelectionManagerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract int javax.swing.JComboBox$KeySelectionManager.selectionForKey(char,javax.swing.ComboBoxModel)

    public native int __selectionForKey( char aKey, javax.swing.ComboBoxModel aModel );

    public int selectionForKey( char aKey, javax.swing.ComboBoxModel aModel ) {
        return __selectionForKey( aKey, aModel );
    }

}
