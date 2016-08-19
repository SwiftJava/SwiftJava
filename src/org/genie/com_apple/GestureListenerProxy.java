
/// interface com.apple.eawt.event.GestureListener ///

package org.genie.com_apple;

public class GestureListenerProxy implements com.apple.eawt.event.GestureListener {

    long swiftObject;

    GestureListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

}
