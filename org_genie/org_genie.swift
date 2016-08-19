//
//  org_genie.swift
//  org_genie
//
//  Created by John Holdsworth on 27/07/2016.
//  Copyright © 2016 John Holdsworth. All rights reserved.
//

import XCTest

class org_genie: XCTestCase {

    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }

    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }

    func testExample() {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct results.

        let instance = SwiftTest()

        if true {
            let reference: Bool = true
            let referenceArray = [(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.booleanFieldStatic = reference
            XCTAssertEqual( SwiftTest.booleanFieldStatic, reference )
            instance.booleanField = reference
            XCTAssertEqual( instance.booleanField, reference )

            SwiftTest.booleanArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.booleanArrayFieldStatic, referenceArray )
            instance.booleanArrayField = referenceArray
            XCTAssertEqual( instance.booleanArrayField, referenceArray )

            SwiftTest.boolean2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.boolean2dArrayFieldStatic[0], reference2dArray[0] )
            instance.boolean2dArrayField = reference2dArray
            XCTAssertEqual( instance.boolean2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.booleanMethodStatic( reference ), reference )
            XCTAssertEqual( instance.booleanMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.booleanArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.booleanArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.boolean2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.boolean2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }

        if true {
            let reference: Int8 = 123
            let referenceArray = [(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.byteFieldStatic = reference
            XCTAssertEqual( SwiftTest.byteFieldStatic, reference )
            instance.byteField = reference
            XCTAssertEqual( instance.byteField, reference )

            SwiftTest.byteArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.byteArrayFieldStatic, referenceArray )
            instance.byteArrayField = referenceArray
            XCTAssertEqual( instance.byteArrayField, referenceArray )

            SwiftTest.byte2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.byte2dArrayFieldStatic[0], reference2dArray[0] )
            instance.byte2dArrayField = reference2dArray
            XCTAssertEqual( instance.byte2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.byteMethodStatic( reference ), reference )
            XCTAssertEqual( instance.byteMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.byteArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.byteArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.byte2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.byte2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }

        if true {
            let reference: UInt16 = 123
            let referenceArray = [(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.charFieldStatic = reference
            XCTAssertEqual( SwiftTest.charFieldStatic, reference )
            instance.charField = reference
            XCTAssertEqual( instance.charField, reference )

            SwiftTest.charArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.charArrayFieldStatic, referenceArray )
            instance.charArrayField = referenceArray
            XCTAssertEqual( instance.charArrayField, referenceArray )

            SwiftTest.char2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.char2dArrayFieldStatic[0], reference2dArray[0] )
            instance.char2dArrayField = reference2dArray
            XCTAssertEqual( instance.char2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.charMethodStatic( reference ), reference )
            XCTAssertEqual( instance.charMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.charArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.charArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.char2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.char2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }

        if true {
            let reference: Int16 = 123
            let referenceArray = [(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.shortFieldStatic = reference
            XCTAssertEqual( SwiftTest.shortFieldStatic, reference )
            instance.shortField = reference
            XCTAssertEqual( instance.shortField, reference )

            SwiftTest.shortArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.shortArrayFieldStatic, referenceArray )
            instance.shortArrayField = referenceArray
            XCTAssertEqual( instance.shortArrayField, referenceArray )

            SwiftTest.short2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.short2dArrayFieldStatic[0], reference2dArray[0] )
            instance.short2dArrayField = reference2dArray
            XCTAssertEqual( instance.short2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.shortMethodStatic( reference ), reference )
            XCTAssertEqual( instance.shortMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.shortArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.shortArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.short2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.short2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }

        if true {
            let reference: Int = 123
            let referenceArray = [Int32(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.intFieldStatic = reference
            XCTAssertEqual( SwiftTest.intFieldStatic, reference )
            instance.intField = reference
            XCTAssertEqual( instance.intField, reference )

            SwiftTest.intArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.intArrayFieldStatic, referenceArray )
            instance.intArrayField = referenceArray
            XCTAssertEqual( instance.intArrayField, referenceArray )

            SwiftTest.int2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.int2dArrayFieldStatic[0], reference2dArray[0] )
            instance.int2dArrayField = reference2dArray
            XCTAssertEqual( instance.int2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.intMethodStatic( reference ), reference )
            XCTAssertEqual( instance.intMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.intArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.intArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.int2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.int2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }

        if true {
            let reference: Int64 = 123
            let referenceArray = [(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.longFieldStatic = reference
            XCTAssertEqual( SwiftTest.longFieldStatic, reference )
            instance.longField = reference
            XCTAssertEqual( instance.longField, reference )

            SwiftTest.longArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.longArrayFieldStatic, referenceArray )
            instance.longArrayField = referenceArray
            XCTAssertEqual( instance.longArrayField, referenceArray )

            SwiftTest.long2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.long2dArrayFieldStatic[0], reference2dArray[0] )
            instance.long2dArrayField = reference2dArray
            XCTAssertEqual( instance.long2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.longMethodStatic( reference ), reference )
            XCTAssertEqual( instance.longMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.longArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.longArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.long2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.long2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }

        if true {
            let reference: Float = 123
            let referenceArray = [(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.floatFieldStatic = reference
            XCTAssertEqual( SwiftTest.floatFieldStatic, reference )
            instance.floatField = reference
            XCTAssertEqual( instance.floatField, reference )

            SwiftTest.floatArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.floatArrayFieldStatic, referenceArray )
            instance.floatArrayField = referenceArray
            XCTAssertEqual( instance.floatArrayField, referenceArray )

            SwiftTest.float2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.float2dArrayFieldStatic[0], reference2dArray[0] )
            instance.float2dArrayField = reference2dArray
            XCTAssertEqual( instance.float2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.floatMethodStatic( reference ), reference )
            XCTAssertEqual( instance.floatMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.floatArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.floatArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.float2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.float2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }

        if true {
            let reference: Double = 123
            let referenceArray = [(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.doubleFieldStatic = reference
            XCTAssertEqual( SwiftTest.doubleFieldStatic, reference )
            instance.doubleField = reference
            XCTAssertEqual( instance.doubleField, reference )

            SwiftTest.doubleArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.doubleArrayFieldStatic, referenceArray )
            instance.doubleArrayField = referenceArray
            XCTAssertEqual( instance.doubleArrayField, referenceArray )

            SwiftTest.double2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.double2dArrayFieldStatic[0], reference2dArray[0] )
            instance.double2dArrayField = reference2dArray
            XCTAssertEqual( instance.double2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.doubleMethodStatic( reference ), reference )
            XCTAssertEqual( instance.doubleMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.doubleArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.doubleArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.double2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.double2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }

        if true {
            let reference: String = "123"
            let referenceArray = [(reference)]
            let reference2dArray = [referenceArray]

            SwiftTest.StringFieldStatic = reference
            XCTAssertEqual( SwiftTest.StringFieldStatic, reference )
            instance.StringField = reference
            XCTAssertEqual( instance.StringField, reference )

            SwiftTest.StringArrayFieldStatic = referenceArray
            XCTAssertEqual( SwiftTest.StringArrayFieldStatic, referenceArray )
            instance.StringArrayField = referenceArray
            XCTAssertEqual( instance.StringArrayField, referenceArray )

            SwiftTest.String2dArrayFieldStatic = reference2dArray
            XCTAssertEqual( SwiftTest.String2dArrayFieldStatic[0], reference2dArray[0] )
            instance.String2dArrayField = reference2dArray
            XCTAssertEqual( instance.String2dArrayField[0], reference2dArray[0] )

            XCTAssertEqual( SwiftTest.StringMethodStatic( reference ), reference )
            XCTAssertEqual( instance.StringMethod( reference ), reference )

            XCTAssertEqual( SwiftTest.StringArrayMethodStatic( referenceArray ), referenceArray )
            XCTAssertEqual( instance.StringArrayMethod( referenceArray ), referenceArray )

            XCTAssertEqual( SwiftTest.String2dArrayMethodStatic( reference2dArray )[0], reference2dArray[0] )
            XCTAssertEqual( instance.String2dArrayMethod( reference2dArray )[0], reference2dArray[0] )
        }
    }

    func testPerformanceExample() {
        // This is an example of a performance test case.
        self.measure {
            // Put the code you want to measure the time of here.
        }
    }

}
