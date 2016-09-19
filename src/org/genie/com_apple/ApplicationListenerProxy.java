
/// interface com.apple.eawt.ApplicationListener ///

package org.genie.com_apple;

public class ApplicationListenerProxy implements com.apple.eawt.ApplicationListener {

    long swiftObject;

    ApplicationListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleOpenApplication(com.apple.eawt.ApplicationEvent)

    public native void __handleOpenApplication( com.apple.eawt.ApplicationEvent arg0 );

    public void handleOpenApplication( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleOpenApplication( arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleOpenFile(com.apple.eawt.ApplicationEvent)

    public native void __handleOpenFile( com.apple.eawt.ApplicationEvent arg0 );

    public void handleOpenFile( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleOpenFile( arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handlePrintFile(com.apple.eawt.ApplicationEvent)

    public native void __handlePrintFile( com.apple.eawt.ApplicationEvent arg0 );

    public void handlePrintFile( com.apple.eawt.ApplicationEvent arg0 ) {
        __handlePrintFile( arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleQuit(com.apple.eawt.ApplicationEvent)

    public native void __handleQuit( com.apple.eawt.ApplicationEvent arg0 );

    public void handleQuit( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleQuit( arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleReOpenApplication(com.apple.eawt.ApplicationEvent)

    public native void __handleReOpenApplication( com.apple.eawt.ApplicationEvent arg0 );

    public void handleReOpenApplication( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleReOpenApplication( arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handleAbout(com.apple.eawt.ApplicationEvent)

    public native void __handleAbout( com.apple.eawt.ApplicationEvent arg0 );

    public void handleAbout( com.apple.eawt.ApplicationEvent arg0 ) {
        __handleAbout( arg0 );
    }

    /// public abstract void com.apple.eawt.ApplicationListener.handlePreferences(com.apple.eawt.ApplicationEvent)

    public native void __handlePreferences( com.apple.eawt.ApplicationEvent arg0 );

    public void handlePreferences( com.apple.eawt.ApplicationEvent arg0 ) {
        __handlePreferences( arg0 );
    }

}
