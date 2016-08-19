
/// interface com.apple.eawt.AppEventListener ///

package org.genie.com_apple;

public class AppEventListenerProxy implements com.apple.eawt.AppEventListener {

    long swiftObject;

    AppEventListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

}
