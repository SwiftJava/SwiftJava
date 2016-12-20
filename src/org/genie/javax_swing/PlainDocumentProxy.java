
/// class javax.swing.text.PlainDocument ///

package org.genie.javax_swing;

public class PlainDocumentProxy extends javax.swing.text.PlainDocument {

    long swiftObject;

    /// public javax.swing.text.PlainDocument()

    PlainDocumentProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.text.PlainDocument(javax.swing.text.AbstractDocument$Content)

    PlainDocumentProxy( javax.swing.text.AbstractDocument.Content arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public void javax.swing.text.PlainDocument.insertString(int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException

    public native void __insertString( int arg0, java.lang.String arg1, javax.swing.text.AttributeSet arg2 );

    boolean entered_insertString_0;

    public void insertString( int arg0, java.lang.String arg1, javax.swing.text.AttributeSet arg2 ) throws javax.swing.text.BadLocationException {
        if ( !entered_insertString_0 ) {
            entered_insertString_0 = true;
            __insertString( arg0, arg1, arg2 );
            entered_insertString_0 = false;
        }
        else
            super.insertString( arg0, arg1, arg2 );
    }

}
