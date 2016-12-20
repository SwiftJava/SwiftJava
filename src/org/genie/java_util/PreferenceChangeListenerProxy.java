
/// interface java.util.prefs.PreferenceChangeListener ///

package org.genie.java_util;

public class PreferenceChangeListenerProxy implements java.util.prefs.PreferenceChangeListener {

    long swiftObject;

    PreferenceChangeListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.util.prefs.PreferenceChangeListener.preferenceChange(java.util.prefs.PreferenceChangeEvent)

    public native void __preferenceChange( java.util.prefs.PreferenceChangeEvent arg0 );

    public void preferenceChange( java.util.prefs.PreferenceChangeEvent arg0 ) {
        __preferenceChange( arg0 );
    }

}
