
/// class com.apple.eawt.ApplicationAdapter ///

package org.genie.com_apple;

public class ApplicationAdapterProxy extends com.apple.eawt.ApplicationAdapter {

    long swiftObject;

    /// public com.apple.eawt.ApplicationAdapter()

    ApplicationAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleOpenApplication(com.apple.eawt.ApplicationEvent)

    public native void __handleOpenApplication( com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleOpenApplication_0;

    public void handleOpenApplication( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleOpenApplication_0 ) {
            entered_handleOpenApplication_0 = true;
            __handleOpenApplication( arg0 );
            entered_handleOpenApplication_0 = false;
        }
        else
            super.handleOpenApplication( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleOpenFile(com.apple.eawt.ApplicationEvent)

    public native void __handleOpenFile( com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleOpenFile_1;

    public void handleOpenFile( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleOpenFile_1 ) {
            entered_handleOpenFile_1 = true;
            __handleOpenFile( arg0 );
            entered_handleOpenFile_1 = false;
        }
        else
            super.handleOpenFile( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handlePrintFile(com.apple.eawt.ApplicationEvent)

    public native void __handlePrintFile( com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handlePrintFile_2;

    public void handlePrintFile( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handlePrintFile_2 ) {
            entered_handlePrintFile_2 = true;
            __handlePrintFile( arg0 );
            entered_handlePrintFile_2 = false;
        }
        else
            super.handlePrintFile( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleQuit(com.apple.eawt.ApplicationEvent)

    public native void __handleQuit( com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleQuit_3;

    public void handleQuit( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleQuit_3 ) {
            entered_handleQuit_3 = true;
            __handleQuit( arg0 );
            entered_handleQuit_3 = false;
        }
        else
            super.handleQuit( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleReOpenApplication(com.apple.eawt.ApplicationEvent)

    public native void __handleReOpenApplication( com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleReOpenApplication_4;

    public void handleReOpenApplication( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleReOpenApplication_4 ) {
            entered_handleReOpenApplication_4 = true;
            __handleReOpenApplication( arg0 );
            entered_handleReOpenApplication_4 = false;
        }
        else
            super.handleReOpenApplication( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleAbout(com.apple.eawt.ApplicationEvent)

    public native void __handleAbout( com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleAbout_5;

    public void handleAbout( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleAbout_5 ) {
            entered_handleAbout_5 = true;
            __handleAbout( arg0 );
            entered_handleAbout_5 = false;
        }
        else
            super.handleAbout( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handlePreferences(com.apple.eawt.ApplicationEvent)

    public native void __handlePreferences( com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handlePreferences_6;

    public void handlePreferences( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handlePreferences_6 ) {
            entered_handlePreferences_6 = true;
            __handlePreferences( arg0 );
            entered_handlePreferences_6 = false;
        }
        else
            super.handlePreferences( arg0 );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_7;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_7 ) {
            entered_equals_7 = true;
            boolean __return = __equals( arg0 );
            entered_equals_7 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_8;

    public java.lang.String toString() {
        if ( !entered_toString_8 ) {
            entered_toString_8 = true;
            java.lang.String __return = __toString( );
            entered_toString_8 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_9;

    public int hashCode() {
        if ( !entered_hashCode_9 ) {
            entered_hashCode_9 = true;
            int __return = __hashCode( );
            entered_hashCode_9 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
