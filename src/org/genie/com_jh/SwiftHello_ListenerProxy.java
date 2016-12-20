
/// interface com.jh.SwiftHello$Listener ///

package org.genie.com_jh;

public class SwiftHello_ListenerProxy implements com.jh.SwiftHello.Listener {

    long swiftObject;

    SwiftHello_ListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.jh.SwiftHello$Listener.processNumber(double)

    public native void __processNumber( double arg0 );

    public void processNumber( double arg0 ) {
        __processNumber( arg0 );
    }

    /// public abstract void com.jh.SwiftHello$Listener.processText(java.lang.String)

    public native void __processText( java.lang.String arg0 );

    public void processText( java.lang.String arg0 ) {
        __processText( arg0 );
    }

}
