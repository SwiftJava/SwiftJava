
// Shared types/interfaces between Java and Swift

package com.johnholdsworth.bindings;

import java.util.HashMap;

public interface SwiftHelloTypes {

    // These are required becuase of type erasure in jars
    public static class ListenerMap extends HashMap<String,TextListener> {
        public static Class<?> valueClass() {
            return TextListener.class;
        }
    }

    public static class ListenerMapList extends HashMap<String,TextListener[]> {
        public static Class<?> valueClass() {
            return (new TextListener [] {}).getClass();
        }
    }

    // An example of publishing an object to Java.
    // Add the associated protocol to an class and
    // objects can be passed to a responder message.
    public interface TextListener {

        public String getText();

    }

}

