#!/usr/bin/env ruby -w

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

java.puts( <<JAVA )

package org.genie;

public class SwiftTest {

    public SwiftTest() {
    }

JAVA

swift = File.open( "org_genie/test_body.swift", "w" )

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
end

java.puts( "}\n" )
java.close()

system( "./genjar.sh && ./genswift.sh org/genie/SwiftTest genie.jar" );
