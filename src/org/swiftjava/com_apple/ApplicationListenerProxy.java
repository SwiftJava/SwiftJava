
/// interface com.apple.eawt.ApplicationListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class ApplicationListenerProxy implements com.apple.eawt.ApplicationListener {

    long __swiftObject;

    ApplicationListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleAbout(com.apple.eawt.ApplicationEvent)

    public native void __handleAbout( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    public void handleAbout( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleAbout( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handlePreferences(com.apple.eawt.ApplicationEvent)

    public native void __handlePreferences( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    public void handlePreferences( com.apple.eawt.ApplicationEvent arg0 ) {
        __handlePreferences( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleOpenApplication(com.apple.eawt.ApplicationEvent)

    public native void __handleOpenApplication( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    public void handleOpenApplication( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleOpenApplication( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleOpenFile(com.apple.eawt.ApplicationEvent)

    public native void __handleOpenFile( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    public void handleOpenFile( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleOpenFile( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handlePrintFile(com.apple.eawt.ApplicationEvent)

    public native void __handlePrintFile( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    public void handlePrintFile( com.apple.eawt.ApplicationEvent arg0 ) {
        __handlePrintFile( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleQuit(com.apple.eawt.ApplicationEvent)

    public native void __handleQuit( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    public void handleQuit( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleQuit( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleReOpenApplication(com.apple.eawt.ApplicationEvent)

    public native void __handleReOpenApplication( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    public void handleReOpenApplication( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleReOpenApplication( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
