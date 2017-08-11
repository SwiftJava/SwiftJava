
/// class com.apple.eawt.ApplicationAdapter ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class ApplicationAdapterProxy extends com.apple.eawt.ApplicationAdapter {

    long __swiftObject;

    /// public com.apple.eawt.ApplicationAdapter()

    ApplicationAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleOpenApplication(com.apple.eawt.ApplicationEvent)

    public native void __handleOpenApplication( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleOpenApplication_0;

    public void handleOpenApplication( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleOpenApplication_0 ) {
            entered_handleOpenApplication_0 = true;
            __handleOpenApplication( __swiftObject, arg0);
            entered_handleOpenApplication_0 = false;
        }
        else
            super.handleOpenApplication( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleOpenFile(com.apple.eawt.ApplicationEvent)

    public native void __handleOpenFile( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleOpenFile_1;

    public void handleOpenFile( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleOpenFile_1 ) {
            entered_handleOpenFile_1 = true;
            __handleOpenFile( __swiftObject, arg0);
            entered_handleOpenFile_1 = false;
        }
        else
            super.handleOpenFile( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handlePrintFile(com.apple.eawt.ApplicationEvent)

    public native void __handlePrintFile( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handlePrintFile_2;

    public void handlePrintFile( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handlePrintFile_2 ) {
            entered_handlePrintFile_2 = true;
            __handlePrintFile( __swiftObject, arg0);
            entered_handlePrintFile_2 = false;
        }
        else
            super.handlePrintFile( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleQuit(com.apple.eawt.ApplicationEvent)

    public native void __handleQuit( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleQuit_3;

    public void handleQuit( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleQuit_3 ) {
            entered_handleQuit_3 = true;
            __handleQuit( __swiftObject, arg0);
            entered_handleQuit_3 = false;
        }
        else
            super.handleQuit( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleReOpenApplication(com.apple.eawt.ApplicationEvent)

    public native void __handleReOpenApplication( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleReOpenApplication_4;

    public void handleReOpenApplication( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleReOpenApplication_4 ) {
            entered_handleReOpenApplication_4 = true;
            __handleReOpenApplication( __swiftObject, arg0);
            entered_handleReOpenApplication_4 = false;
        }
        else
            super.handleReOpenApplication( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handleAbout(com.apple.eawt.ApplicationEvent)

    public native void __handleAbout( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handleAbout_5;

    public void handleAbout( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handleAbout_5 ) {
            entered_handleAbout_5 = true;
            __handleAbout( __swiftObject, arg0);
            entered_handleAbout_5 = false;
        }
        else
            super.handleAbout( arg0 );
    }

    /// public void com.apple.eawt.ApplicationAdapter.handlePreferences(com.apple.eawt.ApplicationEvent)

    public native void __handlePreferences( long __swiftObject, com.apple.eawt.ApplicationEvent arg0 );

    boolean entered_handlePreferences_6;

    public void handlePreferences( com.apple.eawt.ApplicationEvent arg0 ) {
        if ( !entered_handlePreferences_6 ) {
            entered_handlePreferences_6 = true;
            __handlePreferences( __swiftObject, arg0);
            entered_handlePreferences_6 = false;
        }
        else
            super.handlePreferences( arg0 );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_7;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_7 ) {
            entered_equals_7 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_7 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_8;

    public java.lang.String toString() {
        if ( !entered_toString_8 ) {
            entered_toString_8 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_8 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_9;

    public int hashCode() {
        if ( !entered_hashCode_9 ) {
            entered_hashCode_9 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_9 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
