
/// interface java.util.prefs.NodeChangeListener ///

package org.genie.java_util;

public class NodeChangeListenerProxy implements java.util.prefs.NodeChangeListener {

    long swiftObject;

    NodeChangeListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.util.prefs.NodeChangeListener.childAdded(java.util.prefs.NodeChangeEvent)

    public native void __childAdded( java.util.prefs.NodeChangeEvent arg0 );

    public void childAdded( java.util.prefs.NodeChangeEvent arg0 ) {
        __childAdded( arg0 );
    }

    /// public abstract void java.util.prefs.NodeChangeListener.childRemoved(java.util.prefs.NodeChangeEvent)

    public native void __childRemoved( java.util.prefs.NodeChangeEvent arg0 );

    public void childRemoved( java.util.prefs.NodeChangeEvent arg0 ) {
        __childRemoved( arg0 );
    }

}
