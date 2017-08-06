
/// interface javax.swing.JComboBox$KeySelectionManager ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class JComboBox_KeySelectionManagerProxy implements javax.swing.JComboBox.KeySelectionManager {

    long __swiftObject;

    JComboBox_KeySelectionManagerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract int javax.swing.JComboBox$KeySelectionManager.selectionForKey(char,javax.swing.ComboBoxModel)

    public native int __selectionForKey( long __swiftObject, char aKey, javax.swing.ComboBoxModel aModel );

    public int selectionForKey( char aKey, javax.swing.ComboBoxModel aModel ) {
        return __selectionForKey( __swiftObject, aKey, aModel );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
