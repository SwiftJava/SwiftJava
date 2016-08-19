
/// interface java.util.prefs.PreferenceChangeListener ///

package org.genie.java_util;

public class PreferenceChangeListenerProxy implements java.util.prefs.PreferenceChangeListener {

    long swiftObject;

    PreferenceChangeListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.util.prefs.PreferenceChangeListener.preferenceChange(java.util.prefs.PreferenceChangeEvent)

    public native void __preferenceChange( java.util.prefs.PreferenceChangeEvent evt );

    public void preferenceChange( java.util.prefs.PreferenceChangeEvent evt ) {
        __preferenceChange( evt );
    }

}
