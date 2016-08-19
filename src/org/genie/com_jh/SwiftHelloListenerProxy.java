
/// interface com.jh.SwiftHelloListener ///

package org.genie.com_jh;

public class SwiftHelloListenerProxy implements com.jh.SwiftHelloListener {

    long swiftObject;

    SwiftHelloListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.jh.SwiftHelloListener.processNumber(double)

    public native void __processNumber( double number );

    public void processNumber( double number ) {
        __processNumber( number );
    }

    /// public abstract void com.jh.SwiftHelloListener.processText(java.lang.String)

    public native void __processText( java.lang.String text );

    public void processText( java.lang.String text ) {
        __processText( text );
    }

}
