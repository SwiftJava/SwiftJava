
package com.johnholdsworth.bindings;

import com.johnholdsworth.bindings.SwiftHelloTypes.TextListener;
import com.johnholdsworth.bindings.SwiftHelloTypes.ListenerMap;
import com.johnholdsworth.bindings.SwiftHelloTypes.ListenerMapList;

public interface SwiftHelloBinding {

    // Messages from JavaActivity to Swift
    public interface Listener {

        public void setCacheDir( String cacheDir );

        public void processNumber( double number );

        public void processText( String text );

        public void processedMap( ListenerMap map );

        public void processedMapList( ListenerMapList map );

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

        public String[] debug( String msg );

        public SwiftHelloTest.TestListener testResponder( int loopback );

    }

}
