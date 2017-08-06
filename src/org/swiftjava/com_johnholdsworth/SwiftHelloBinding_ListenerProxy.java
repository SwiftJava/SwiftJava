
/// interface com.johnholdsworth.bindings.SwiftHelloBinding$Listener ///

package org.swiftjava.com_johnholdsworth;

@SuppressWarnings("JniMissingFunction")
public class SwiftHelloBinding_ListenerProxy implements com.johnholdsworth.bindings.SwiftHelloBinding.Listener {

    long __swiftObject;

    SwiftHelloBinding_ListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.johnholdsworth.bindings.SwiftHelloBinding$Listener.setCacheDir(java.lang.String)

    public native void __setCacheDir( long __swiftObject, java.lang.String cacheDir );

    public void setCacheDir( java.lang.String cacheDir ) {
        __setCacheDir( __swiftObject, cacheDir );
    }

    /// public abstract void com.johnholdsworth.bindings.SwiftHelloBinding$Listener.processNumber(double)

    public native void __processNumber( long __swiftObject, double number );

    public void processNumber( double number ) {
        __processNumber( __swiftObject, number );
    }

    /// public abstract void com.johnholdsworth.bindings.SwiftHelloBinding$Listener.processText(java.lang.String)

    public native void __processText( long __swiftObject, java.lang.String text );

    public void processText( java.lang.String text ) {
        __processText( __swiftObject, text );
    }

    /// public abstract void com.johnholdsworth.bindings.SwiftHelloBinding$Listener.processedMap(com.johnholdsworth.bindings.SwiftHelloTypes$ListenerMap)

    public native void __processedMap( long __swiftObject, com.johnholdsworth.bindings.SwiftHelloTypes.ListenerMap map );

    public void processedMap( com.johnholdsworth.bindings.SwiftHelloTypes.ListenerMap map ) {
        __processedMap( __swiftObject, map );
    }

    /// public abstract void com.johnholdsworth.bindings.SwiftHelloBinding$Listener.processedMapList(com.johnholdsworth.bindings.SwiftHelloTypes$ListenerMapList)

    public native void __processedMapList( long __swiftObject, com.johnholdsworth.bindings.SwiftHelloTypes.ListenerMapList map );

    public void processedMapList( com.johnholdsworth.bindings.SwiftHelloTypes.ListenerMapList map ) {
        __processedMapList( __swiftObject, map );
    }

    /// public abstract com.johnholdsworth.bindings.SwiftHelloTest$TestListener com.johnholdsworth.bindings.SwiftHelloBinding$Listener.testResponder(int)

    public native com.johnholdsworth.bindings.SwiftHelloTest.TestListener __testResponder( long __swiftObject, int loopback );

    public com.johnholdsworth.bindings.SwiftHelloTest.TestListener testResponder( int loopback ) {
        return __testResponder( __swiftObject, loopback );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
