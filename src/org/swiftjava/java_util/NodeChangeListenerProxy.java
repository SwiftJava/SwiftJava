
/// interface java.util.prefs.NodeChangeListener ///

package org.swiftjava.java_util;

@SuppressWarnings("JniMissingFunction")
public class NodeChangeListenerProxy implements java.util.prefs.NodeChangeListener {

    long __swiftObject;

    NodeChangeListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.util.prefs.NodeChangeListener.childAdded(java.util.prefs.NodeChangeEvent)

    public native void __childAdded( long __swiftObject, java.util.prefs.NodeChangeEvent evt );

    public void childAdded( java.util.prefs.NodeChangeEvent evt ) {
        __childAdded( __swiftObject, evt );
    }

    /// public abstract void java.util.prefs.NodeChangeListener.childRemoved(java.util.prefs.NodeChangeEvent)

    public native void __childRemoved( long __swiftObject, java.util.prefs.NodeChangeEvent evt );

    public void childRemoved( java.util.prefs.NodeChangeEvent evt ) {
        __childRemoved( __swiftObject, evt );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
