
/// interface com.jh.SwiftHelloBinding$Listener ///

package org.genie.com_jh;

@SuppressWarnings("JniMissingFunction")
public class SwiftHelloBinding_ListenerProxy implements com.jh.SwiftHelloBinding.Listener {

    long swiftObject;

    SwiftHelloBinding_ListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.jh.SwiftHelloBinding$Listener.setCacheDir(java.lang.String)

    public native void __setCacheDir( java.lang.String cacheDir );

    public void setCacheDir( java.lang.String cacheDir ) {
        __setCacheDir( cacheDir );
    }

    /// public abstract void com.jh.SwiftHelloBinding$Listener.processNumber(double)

    public native void __processNumber( double number );

    public void processNumber( double number ) {
        __processNumber( number );
    }

    /// public abstract void com.jh.SwiftHelloBinding$Listener.processText(java.lang.String)

    public native void __processText( java.lang.String text );

    public void processText( java.lang.String text ) {
        __processText( text );
    }

}
