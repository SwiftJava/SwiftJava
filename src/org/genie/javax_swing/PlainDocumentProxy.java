
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

    PlainDocumentProxy( javax.swing.text.AbstractDocument.Content c , long swiftObject ) {
        super( c );
        this.swiftObject = swiftObject;
    }

    /// public void javax.swing.text.PlainDocument.insertString(int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException

    public native void __insertString( int offs, java.lang.String str, javax.swing.text.AttributeSet a );

    boolean entered_insertString_0;

    public void insertString( int offs, java.lang.String str, javax.swing.text.AttributeSet a ) throws javax.swing.text.BadLocationException {
        if ( !entered_insertString_0 ) {
            entered_insertString_0 = true;
            __insertString( offs, str, a );
            entered_insertString_0 = false;
        }
        else
            super.insertString( offs, str, a );
    }

}
