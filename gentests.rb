#!/usr/bin/env ruby

types = ["boolean", "byte", "char", "short", "int", "long", "float", "double", "String"];

swiftTypes = {
    'boolean' => 'Bool',
    'byte' => 'Int8',
    'char' => 'UInt16',
    'short' => 'Int16',
    'int' => 'Int',
    'long' => 'Int64',
    'float' => 'Float',
    'double' => 'Double',
    'String' => 'String'
}

arrayException = {
    'int' => 'Int32'
}

referenceException = {
    'boolean' => 'true',
    'String' => '"123"'
}

java = File.open( "src/org/genie/SwiftTest.java", "w" )
java2 = File.open( "src/com/jh/SwiftHelloTest.java", "w" )

java.puts( <<JAVA )

package org.genie;

public class SwiftTest {

    public SwiftTest() {
    }

JAVA
    
java2.puts( <<JAVA )

package com.jh;

public interface SwiftHelloTest {

    public interface TestListener {

JAVA
        

swift = File.open( "org_genie/test_body.swift", "w" )
swift2 = File.open( "swift-android-samples/swifthello/src/main/swift/Sources/SwiftHelloTestImpl.swift", "w" )

swift2.puts( <<SWIFT )

import java_swift
import Foundation

public class SwiftTestListener: SwiftHelloTest_TestListenerBase {

SWIFT

for type in types

    java.puts( <<JAVA )
    public static #{type} #{type}FieldStatic;
    public #{type} #{type}Field;

    public static #{type} #{type}MethodStatic( #{type} arg ) {
        return arg;
    }

    public #{type} #{type}Method( #{type} arg ) {
        return arg;
    }

    public static #{type} #{type}ArrayFieldStatic[];
    public #{type} #{type}ArrayField[];

    public static #{type}[] #{type}ArrayMethodStatic( #{type} arg[] ) {
        return arg;
    }

    public #{type}[] #{type}ArrayMethod( #{type} arg[] ) {
        return arg;
    }

    public static #{type} #{type}2dArrayFieldStatic[][];
    public #{type} #{type}2dArrayField[][];

    public static #{type}[][] #{type}2dArrayMethodStatic( #{type} arg[][] ) {
        return arg;
    }

    public #{type}[][] #{type}2dArrayMethod( #{type} arg[][] ) {
        return arg;
    }

JAVA

    java2.puts( <<JAVA )
        public #{type} #{type}Method( #{type} arg );
        public #{type}[] #{type}ArrayMethod( #{type} arg[] );
        public #{type}[][] #{type}2dArrayMethod( #{type} arg[][] );

JAVA

    swift.puts( <<SWIFT )

        if true {
            let reference: #{swiftTypes[type]} = #{referenceException[type] || '123'}
            let referenceArray = [#{arrayException[type] || ''}(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.#{type}FieldStatic = reference
            XCTAssertEqual( SwiftTest.#{type}FieldStatic, reference )
            instance.#{type}Field = reference
            XCTAssertEqual( instance.#{type}Field, reference )

            SwiftTest.#{type}ArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.#{type}ArrayFieldStatic, referenceArray )
            instance.#{type}ArrayField = referenceArray
            XCTAssertEqual( instance.#{type}ArrayField, referenceArray )

            SwiftTest.#{type}2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.#{type}2dArrayFieldStatic[0], reference2dArray[0] )
            instance.#{type}2dArrayField = reference2dArray
            XCTAssertEqual( instance.#{type}2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.#{type}MethodStatic( reference ), reference )
            XCTAssertEqual( instance.#{type}Method( reference ), reference )

            XCTAssertEqual( SwiftTest.#{type}ArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.#{type}ArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.#{type}2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.#{type}2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }
SWIFT

    opt = type == "String" ? "?" : ""
    atype = arrayException[type] || swiftTypes[type]
    swift2.puts( <<SWIFT )
    override public func #{type}Method( arg: #{swiftTypes[type]}#{opt} ) -> #{swiftTypes[type]}#{opt} {
        return arg
    }

    override public func #{type}ArrayMethod( arg: [#{atype}]? ) -> [#{atype}]? {
        return arg
    }

    override public func #{type}2dArrayMethod( arg: [[#{atype}]]? ) -> [[#{atype}]]? {
        return arg
    }

SWIFT
end

java2.puts( <<JAVA )
    }

    public static class TestResponderImpl implements TestListener {

JAVA

swift2.puts( <<SWIFT )
}

public class SwiftTestResponder {

    static var tcount = 0

    public func respond( to responder: SwiftHelloTest_TestListener ) {
        SwiftTestResponder.tcount += 1
        NSLog("Testing \\(SwiftTestResponder.tcount)...")

SWIFT

for type in types
    java2.puts( <<JAVA )
        public #{type} #{type}Method( #{type} arg ) {
            return arg;
        }

        public #{type}[] #{type}ArrayMethod( #{type} arg[] ) {
            return arg;
        }

        public #{type}[][] #{type}2dArrayMethod( #{type} arg[][] ) {
            return arg;
        }

JAVA

    swift2.puts( <<SWIFT )
        if true {
            let reference: #{swiftTypes[type]} = #{referenceException[type] || '123'}
            let referenceArray = [#{arrayException[type] || ''}(reference)]
            //let reference2dArray = [referenceArray]

            let response = responder.#{type}Method( reference )
            if response != reference {
                NSLog("#{swiftTypes[type]}: \\(response) != \\(reference)")
            }
            let responseArray = responder.#{type}ArrayMethod( referenceArray )!
            if responseArray != referenceArray {
                NSLog("#{swiftTypes[type]}: \\(responseArray) != \\(referenceArray)")
            }
            //_ = responder.#{type}2dArrayMethod( reference2dArray )
        }

SWIFT
end

swift2.puts( "    }\n\n}\n" )
swift2.close()
swift.close()

java2.puts( "    }\n\n}\n" )
java2.close()

java.puts( "}\n" )
java.close()

system( "./genjar.sh && ./genswift.sh org/genie/SwiftTest genie.jar" );
