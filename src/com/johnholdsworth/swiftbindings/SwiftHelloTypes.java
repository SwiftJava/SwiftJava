
// Shared types/interfaces between Java and Swift in example applications

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
        @SuppressWarnings("unchecked")
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
        @SuppressWarnings("unchecked")
        public StringMapList(Map map) {
            super(map);
        }
    }

    public static enum Planet {
        MERCURY (3.303e+23, 2.4397e6),
        VENUS   (4.869e+24, 6.0518e6),
        EARTH   (5.976e+24, 6.37814e6),
        MARS    (6.421e+23, 3.3972e6),
        JUPITER (1.9e+27,   7.1492e7),
        SATURN  (5.688e+26, 6.0268e7),
        URANUS  (8.686e+25, 2.5559e7),
        NEPTUNE (1.024e+26, 2.4746e7);

        private final double mass;   // in kilograms
        private final double radius; // in meters
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }
        public double mass() { return mass; }
        public double radius() { return radius; }

        // universal gravitational constant  (m3 kg-1 s-2)
        public static final double G = 6.67300E-11;

        public double surfaceGravity() {
            return G * mass / (radius * radius);
        }
        public double surfaceWeight(double otherMass) {
            return otherMass * surfaceGravity();
        }
    }
}


