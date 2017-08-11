
package com.johnholdsworth.swiftbindings;

import com.johnholdsworth.swiftbindings.SwiftHelloTypes.TextListener;
import com.johnholdsworth.swiftbindings.SwiftHelloTypes.ListenerMap;
import com.johnholdsworth.swiftbindings.SwiftHelloTypes.ListenerMapList;
import com.johnholdsworth.swiftbindings.SwiftHelloTypes.StringMap;
import com.johnholdsworth.swiftbindings.SwiftHelloTypes.StringMapList;

public interface SwiftHelloBinding {

    // Messages from JavaActivity to Swift
    public interface Listener {

        public void setCacheDir( String cacheDir );

        public void processNumber( double number );

        public void processText( String text );

        public void processedMap( ListenerMap map );

        public void processedMapList( ListenerMapList map );

        public void processStringMap( StringMap map );

        public void processStringMapList( StringMapList map );

        public double throwException() throws Exception;

        public SwiftHelloTest.TestListener testResponder( int loopback );

    }

    // Messages from Swift back to Activity
    public interface Responder {

        public void processedNumber( double number );

        public void processedText( String text );

        public void processedTextListener( TextListener text );

        public void processedTextListenerArray( TextListener text[] );

        public void processedTextListener2dArray( TextListener text[][] );

        public void processMap( ListenerMap map );

        public void processMapList( ListenerMapList map );

        public void processedStringMap( StringMap map );

        public void processedStringMapList( StringMapList map );

        public String[] debug( String msg );

        public SwiftHelloTest.TestListener testResponder( int loopback );

    }

}

