
// Shared types/interfaces between Java and Swift

package com.johnholdsworth.swiftbindings;

import java.util.Map;
import java.util.HashMap;

public interface SwiftHelloTypes {

    // An example of publishing an object to Java.
    // Add the associated protocol to an class and
    // objects can be passed to a responder message.
    public interface TextListener {
        public String getText();
    }

    // These are required because of type erasure in Java jars
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

    public static class StringMap extends HashMap<String,String> {
        public static Class<?> valueClass() {
            return String.class;
        }
        public StringMap() {
            super();
        }
        public StringMap(Map map) {
            super(map);
        }
    }

    public static class StringMapList extends HashMap<String,String[]> {
        public static Class<?> valueClass() {
            return (new String [] {}).getClass();
        }
        public StringMapList() {
            super();
        }
        public StringMapList(Map map) {
            super(map);
        }
    }

}


