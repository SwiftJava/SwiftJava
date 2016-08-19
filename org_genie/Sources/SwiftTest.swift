
import java_lang

/// class org.genie.SwiftTest ///

public class SwiftTest: java_lang.JavaObject {

    public convenience init?( casting object: java_lang.JavaObject, _ file: StaticString = #file, _ line: Int = #line ) {
        self.init( javaObject: object.javaObject )
        if !object.validDownCast( toJavaClass: "org.genie.SwiftTest", file, line ) {
            return nil
        }
    }

    private static var SwiftTestJNIClass: jclass?

    /// public static boolean org.genie.SwiftTest.booleanFieldStatic

    private static var booleanFieldStatic_FieldID: jfieldID?

    public static var booleanFieldStatic: Bool {
        get {
            let value = JNIField.GetStaticBooleanField( fieldName: "booleanFieldStatic", fieldType: "Z", fieldCache: &booleanFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: Bool(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticBooleanField( fieldName: "booleanFieldStatic", fieldType: "Z", fieldCache: &booleanFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.z )
        }
    }

    /// public boolean org.genie.SwiftTest.booleanField

    private static var booleanField_FieldID: jfieldID?

    public var booleanField: Bool {
        get {
            let value = JNIField.GetBooleanField( fieldName: "booleanField", fieldType: "Z", fieldCache: &SwiftTest.booleanField_FieldID, object: javaObject )
            return JNIType.decode( type: Bool(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetBooleanField( fieldName: "booleanField", fieldType: "Z", fieldCache: &SwiftTest.booleanField_FieldID, object: javaObject, value: value.z )
        }
    }

    /// public static boolean[] org.genie.SwiftTest.booleanArrayFieldStatic

    private static var booleanArrayFieldStatic_FieldID: jfieldID?

    public static var booleanArrayFieldStatic: [Bool]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "booleanArrayFieldStatic", fieldType: "[Z", fieldCache: &booleanArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [Bool](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "booleanArrayFieldStatic", fieldType: "[Z", fieldCache: &booleanArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public boolean[] org.genie.SwiftTest.booleanArrayField

    private static var booleanArrayField_FieldID: jfieldID?

    public var booleanArrayField: [Bool]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "booleanArrayField", fieldType: "[Z", fieldCache: &SwiftTest.booleanArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [Bool](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "booleanArrayField", fieldType: "[Z", fieldCache: &SwiftTest.booleanArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static boolean[][] org.genie.SwiftTest.boolean2dArrayFieldStatic

    private static var boolean2dArrayFieldStatic_FieldID: jfieldID?

    public static var boolean2dArrayFieldStatic: [[Bool]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "boolean2dArrayFieldStatic", fieldType: "[[Z", fieldCache: &boolean2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[Bool]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "boolean2dArrayFieldStatic", fieldType: "[[Z", fieldCache: &boolean2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public boolean[][] org.genie.SwiftTest.boolean2dArrayField

    private static var boolean2dArrayField_FieldID: jfieldID?

    public var boolean2dArrayField: [[Bool]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "boolean2dArrayField", fieldType: "[[Z", fieldCache: &SwiftTest.boolean2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[Bool]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "boolean2dArrayField", fieldType: "[[Z", fieldCache: &SwiftTest.boolean2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static byte org.genie.SwiftTest.byteFieldStatic

    private static var byteFieldStatic_FieldID: jfieldID?

    public static var byteFieldStatic: Int8 {
        get {
            let value = JNIField.GetStaticByteField( fieldName: "byteFieldStatic", fieldType: "B", fieldCache: &byteFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: Int8(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticByteField( fieldName: "byteFieldStatic", fieldType: "B", fieldCache: &byteFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.b )
        }
    }

    /// public byte org.genie.SwiftTest.byteField

    private static var byteField_FieldID: jfieldID?

    public var byteField: Int8 {
        get {
            let value = JNIField.GetByteField( fieldName: "byteField", fieldType: "B", fieldCache: &SwiftTest.byteField_FieldID, object: javaObject )
            return JNIType.decode( type: Int8(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetByteField( fieldName: "byteField", fieldType: "B", fieldCache: &SwiftTest.byteField_FieldID, object: javaObject, value: value.b )
        }
    }

    /// public static byte[] org.genie.SwiftTest.byteArrayFieldStatic

    private static var byteArrayFieldStatic_FieldID: jfieldID?

    public static var byteArrayFieldStatic: [Int8]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "byteArrayFieldStatic", fieldType: "[B", fieldCache: &byteArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [Int8](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "byteArrayFieldStatic", fieldType: "[B", fieldCache: &byteArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public byte[] org.genie.SwiftTest.byteArrayField

    private static var byteArrayField_FieldID: jfieldID?

    public var byteArrayField: [Int8]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "byteArrayField", fieldType: "[B", fieldCache: &SwiftTest.byteArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [Int8](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "byteArrayField", fieldType: "[B", fieldCache: &SwiftTest.byteArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static byte[][] org.genie.SwiftTest.byte2dArrayFieldStatic

    private static var byte2dArrayFieldStatic_FieldID: jfieldID?

    public static var byte2dArrayFieldStatic: [[Int8]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "byte2dArrayFieldStatic", fieldType: "[[B", fieldCache: &byte2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[Int8]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "byte2dArrayFieldStatic", fieldType: "[[B", fieldCache: &byte2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public byte[][] org.genie.SwiftTest.byte2dArrayField

    private static var byte2dArrayField_FieldID: jfieldID?

    public var byte2dArrayField: [[Int8]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "byte2dArrayField", fieldType: "[[B", fieldCache: &SwiftTest.byte2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[Int8]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "byte2dArrayField", fieldType: "[[B", fieldCache: &SwiftTest.byte2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static char org.genie.SwiftTest.charFieldStatic

    private static var charFieldStatic_FieldID: jfieldID?

    public static var charFieldStatic: UInt16 {
        get {
            let value = JNIField.GetStaticCharField( fieldName: "charFieldStatic", fieldType: "C", fieldCache: &charFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: UInt16(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticCharField( fieldName: "charFieldStatic", fieldType: "C", fieldCache: &charFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.c )
        }
    }

    /// public char org.genie.SwiftTest.charField

    private static var charField_FieldID: jfieldID?

    public var charField: UInt16 {
        get {
            let value = JNIField.GetCharField( fieldName: "charField", fieldType: "C", fieldCache: &SwiftTest.charField_FieldID, object: javaObject )
            return JNIType.decode( type: UInt16(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetCharField( fieldName: "charField", fieldType: "C", fieldCache: &SwiftTest.charField_FieldID, object: javaObject, value: value.c )
        }
    }

    /// public static char[] org.genie.SwiftTest.charArrayFieldStatic

    private static var charArrayFieldStatic_FieldID: jfieldID?

    public static var charArrayFieldStatic: [UInt16]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "charArrayFieldStatic", fieldType: "[C", fieldCache: &charArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [UInt16](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "charArrayFieldStatic", fieldType: "[C", fieldCache: &charArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public char[] org.genie.SwiftTest.charArrayField

    private static var charArrayField_FieldID: jfieldID?

    public var charArrayField: [UInt16]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "charArrayField", fieldType: "[C", fieldCache: &SwiftTest.charArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [UInt16](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "charArrayField", fieldType: "[C", fieldCache: &SwiftTest.charArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static char[][] org.genie.SwiftTest.char2dArrayFieldStatic

    private static var char2dArrayFieldStatic_FieldID: jfieldID?

    public static var char2dArrayFieldStatic: [[UInt16]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "char2dArrayFieldStatic", fieldType: "[[C", fieldCache: &char2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[UInt16]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "char2dArrayFieldStatic", fieldType: "[[C", fieldCache: &char2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public char[][] org.genie.SwiftTest.char2dArrayField

    private static var char2dArrayField_FieldID: jfieldID?

    public var char2dArrayField: [[UInt16]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "char2dArrayField", fieldType: "[[C", fieldCache: &SwiftTest.char2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[UInt16]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "char2dArrayField", fieldType: "[[C", fieldCache: &SwiftTest.char2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static short org.genie.SwiftTest.shortFieldStatic

    private static var shortFieldStatic_FieldID: jfieldID?

    public static var shortFieldStatic: Int16 {
        get {
            let value = JNIField.GetStaticShortField( fieldName: "shortFieldStatic", fieldType: "S", fieldCache: &shortFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: Int16(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticShortField( fieldName: "shortFieldStatic", fieldType: "S", fieldCache: &shortFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.s )
        }
    }

    /// public short org.genie.SwiftTest.shortField

    private static var shortField_FieldID: jfieldID?

    public var shortField: Int16 {
        get {
            let value = JNIField.GetShortField( fieldName: "shortField", fieldType: "S", fieldCache: &SwiftTest.shortField_FieldID, object: javaObject )
            return JNIType.decode( type: Int16(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetShortField( fieldName: "shortField", fieldType: "S", fieldCache: &SwiftTest.shortField_FieldID, object: javaObject, value: value.s )
        }
    }

    /// public static short[] org.genie.SwiftTest.shortArrayFieldStatic

    private static var shortArrayFieldStatic_FieldID: jfieldID?

    public static var shortArrayFieldStatic: [Int16]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "shortArrayFieldStatic", fieldType: "[S", fieldCache: &shortArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [Int16](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "shortArrayFieldStatic", fieldType: "[S", fieldCache: &shortArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public short[] org.genie.SwiftTest.shortArrayField

    private static var shortArrayField_FieldID: jfieldID?

    public var shortArrayField: [Int16]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "shortArrayField", fieldType: "[S", fieldCache: &SwiftTest.shortArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [Int16](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "shortArrayField", fieldType: "[S", fieldCache: &SwiftTest.shortArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static short[][] org.genie.SwiftTest.short2dArrayFieldStatic

    private static var short2dArrayFieldStatic_FieldID: jfieldID?

    public static var short2dArrayFieldStatic: [[Int16]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "short2dArrayFieldStatic", fieldType: "[[S", fieldCache: &short2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[Int16]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "short2dArrayFieldStatic", fieldType: "[[S", fieldCache: &short2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public short[][] org.genie.SwiftTest.short2dArrayField

    private static var short2dArrayField_FieldID: jfieldID?

    public var short2dArrayField: [[Int16]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "short2dArrayField", fieldType: "[[S", fieldCache: &SwiftTest.short2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[Int16]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "short2dArrayField", fieldType: "[[S", fieldCache: &SwiftTest.short2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static int org.genie.SwiftTest.intFieldStatic

    private static var intFieldStatic_FieldID: jfieldID?

    public static var intFieldStatic: Int {
        get {
            let value = JNIField.GetStaticIntField( fieldName: "intFieldStatic", fieldType: "I", fieldCache: &intFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: Int(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticIntField( fieldName: "intFieldStatic", fieldType: "I", fieldCache: &intFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.i )
        }
    }

    /// public int org.genie.SwiftTest.intField

    private static var intField_FieldID: jfieldID?

    public var intField: Int {
        get {
            let value = JNIField.GetIntField( fieldName: "intField", fieldType: "I", fieldCache: &SwiftTest.intField_FieldID, object: javaObject )
            return JNIType.decode( type: Int(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetIntField( fieldName: "intField", fieldType: "I", fieldCache: &SwiftTest.intField_FieldID, object: javaObject, value: value.i )
        }
    }

    /// public static int[] org.genie.SwiftTest.intArrayFieldStatic

    private static var intArrayFieldStatic_FieldID: jfieldID?

    public static var intArrayFieldStatic: [Int32]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "intArrayFieldStatic", fieldType: "[I", fieldCache: &intArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [Int32](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "intArrayFieldStatic", fieldType: "[I", fieldCache: &intArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public int[] org.genie.SwiftTest.intArrayField

    private static var intArrayField_FieldID: jfieldID?

    public var intArrayField: [Int32]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "intArrayField", fieldType: "[I", fieldCache: &SwiftTest.intArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [Int32](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "intArrayField", fieldType: "[I", fieldCache: &SwiftTest.intArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static int[][] org.genie.SwiftTest.int2dArrayFieldStatic

    private static var int2dArrayFieldStatic_FieldID: jfieldID?

    public static var int2dArrayFieldStatic: [[Int32]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "int2dArrayFieldStatic", fieldType: "[[I", fieldCache: &int2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[Int32]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "int2dArrayFieldStatic", fieldType: "[[I", fieldCache: &int2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public int[][] org.genie.SwiftTest.int2dArrayField

    private static var int2dArrayField_FieldID: jfieldID?

    public var int2dArrayField: [[Int32]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "int2dArrayField", fieldType: "[[I", fieldCache: &SwiftTest.int2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[Int32]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "int2dArrayField", fieldType: "[[I", fieldCache: &SwiftTest.int2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static long org.genie.SwiftTest.longFieldStatic

    private static var longFieldStatic_FieldID: jfieldID?

    public static var longFieldStatic: Int64 {
        get {
            let value = JNIField.GetStaticLongField( fieldName: "longFieldStatic", fieldType: "J", fieldCache: &longFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: Int64(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticLongField( fieldName: "longFieldStatic", fieldType: "J", fieldCache: &longFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.j )
        }
    }

    /// public long org.genie.SwiftTest.longField

    private static var longField_FieldID: jfieldID?

    public var longField: Int64 {
        get {
            let value = JNIField.GetLongField( fieldName: "longField", fieldType: "J", fieldCache: &SwiftTest.longField_FieldID, object: javaObject )
            return JNIType.decode( type: Int64(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetLongField( fieldName: "longField", fieldType: "J", fieldCache: &SwiftTest.longField_FieldID, object: javaObject, value: value.j )
        }
    }

    /// public static long[] org.genie.SwiftTest.longArrayFieldStatic

    private static var longArrayFieldStatic_FieldID: jfieldID?

    public static var longArrayFieldStatic: [Int64]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "longArrayFieldStatic", fieldType: "[J", fieldCache: &longArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [Int64](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "longArrayFieldStatic", fieldType: "[J", fieldCache: &longArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public long[] org.genie.SwiftTest.longArrayField

    private static var longArrayField_FieldID: jfieldID?

    public var longArrayField: [Int64]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "longArrayField", fieldType: "[J", fieldCache: &SwiftTest.longArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [Int64](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "longArrayField", fieldType: "[J", fieldCache: &SwiftTest.longArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static long[][] org.genie.SwiftTest.long2dArrayFieldStatic

    private static var long2dArrayFieldStatic_FieldID: jfieldID?

    public static var long2dArrayFieldStatic: [[Int64]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "long2dArrayFieldStatic", fieldType: "[[J", fieldCache: &long2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[Int64]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "long2dArrayFieldStatic", fieldType: "[[J", fieldCache: &long2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public long[][] org.genie.SwiftTest.long2dArrayField

    private static var long2dArrayField_FieldID: jfieldID?

    public var long2dArrayField: [[Int64]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "long2dArrayField", fieldType: "[[J", fieldCache: &SwiftTest.long2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[Int64]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "long2dArrayField", fieldType: "[[J", fieldCache: &SwiftTest.long2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static float org.genie.SwiftTest.floatFieldStatic

    private static var floatFieldStatic_FieldID: jfieldID?

    public static var floatFieldStatic: Float {
        get {
            let value = JNIField.GetStaticFloatField( fieldName: "floatFieldStatic", fieldType: "F", fieldCache: &floatFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: Float(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticFloatField( fieldName: "floatFieldStatic", fieldType: "F", fieldCache: &floatFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.f )
        }
    }

    /// public float org.genie.SwiftTest.floatField

    private static var floatField_FieldID: jfieldID?

    public var floatField: Float {
        get {
            let value = JNIField.GetFloatField( fieldName: "floatField", fieldType: "F", fieldCache: &SwiftTest.floatField_FieldID, object: javaObject )
            return JNIType.decode( type: Float(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetFloatField( fieldName: "floatField", fieldType: "F", fieldCache: &SwiftTest.floatField_FieldID, object: javaObject, value: value.f )
        }
    }

    /// public static float[] org.genie.SwiftTest.floatArrayFieldStatic

    private static var floatArrayFieldStatic_FieldID: jfieldID?

    public static var floatArrayFieldStatic: [Float]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "floatArrayFieldStatic", fieldType: "[F", fieldCache: &floatArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [Float](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "floatArrayFieldStatic", fieldType: "[F", fieldCache: &floatArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public float[] org.genie.SwiftTest.floatArrayField

    private static var floatArrayField_FieldID: jfieldID?

    public var floatArrayField: [Float]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "floatArrayField", fieldType: "[F", fieldCache: &SwiftTest.floatArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [Float](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "floatArrayField", fieldType: "[F", fieldCache: &SwiftTest.floatArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static float[][] org.genie.SwiftTest.float2dArrayFieldStatic

    private static var float2dArrayFieldStatic_FieldID: jfieldID?

    public static var float2dArrayFieldStatic: [[Float]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "float2dArrayFieldStatic", fieldType: "[[F", fieldCache: &float2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[Float]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "float2dArrayFieldStatic", fieldType: "[[F", fieldCache: &float2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public float[][] org.genie.SwiftTest.float2dArrayField

    private static var float2dArrayField_FieldID: jfieldID?

    public var float2dArrayField: [[Float]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "float2dArrayField", fieldType: "[[F", fieldCache: &SwiftTest.float2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[Float]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "float2dArrayField", fieldType: "[[F", fieldCache: &SwiftTest.float2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static double org.genie.SwiftTest.doubleFieldStatic

    private static var doubleFieldStatic_FieldID: jfieldID?

    public static var doubleFieldStatic: Double {
        get {
            let value = JNIField.GetStaticDoubleField( fieldName: "doubleFieldStatic", fieldType: "D", fieldCache: &doubleFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: Double(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticDoubleField( fieldName: "doubleFieldStatic", fieldType: "D", fieldCache: &doubleFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.d )
        }
    }

    /// public double org.genie.SwiftTest.doubleField

    private static var doubleField_FieldID: jfieldID?

    public var doubleField: Double {
        get {
            let value = JNIField.GetDoubleField( fieldName: "doubleField", fieldType: "D", fieldCache: &SwiftTest.doubleField_FieldID, object: javaObject )
            return JNIType.decode( type: Double(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetDoubleField( fieldName: "doubleField", fieldType: "D", fieldCache: &SwiftTest.doubleField_FieldID, object: javaObject, value: value.d )
        }
    }

    /// public static double[] org.genie.SwiftTest.doubleArrayFieldStatic

    private static var doubleArrayFieldStatic_FieldID: jfieldID?

    public static var doubleArrayFieldStatic: [Double]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "doubleArrayFieldStatic", fieldType: "[D", fieldCache: &doubleArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [Double](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "doubleArrayFieldStatic", fieldType: "[D", fieldCache: &doubleArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public double[] org.genie.SwiftTest.doubleArrayField

    private static var doubleArrayField_FieldID: jfieldID?

    public var doubleArrayField: [Double]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "doubleArrayField", fieldType: "[D", fieldCache: &SwiftTest.doubleArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [Double](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "doubleArrayField", fieldType: "[D", fieldCache: &SwiftTest.doubleArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static double[][] org.genie.SwiftTest.double2dArrayFieldStatic

    private static var double2dArrayFieldStatic_FieldID: jfieldID?

    public static var double2dArrayFieldStatic: [[Double]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "double2dArrayFieldStatic", fieldType: "[[D", fieldCache: &double2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[Double]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "double2dArrayFieldStatic", fieldType: "[[D", fieldCache: &double2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public double[][] org.genie.SwiftTest.double2dArrayField

    private static var double2dArrayField_FieldID: jfieldID?

    public var double2dArrayField: [[Double]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "double2dArrayField", fieldType: "[[D", fieldCache: &SwiftTest.double2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[Double]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "double2dArrayField", fieldType: "[[D", fieldCache: &SwiftTest.double2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static java.lang.String org.genie.SwiftTest.StringFieldStatic

    private static var StringFieldStatic_FieldID: jfieldID?

    public static var StringFieldStatic: String! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "StringFieldStatic", fieldType: "Ljava/lang/String;", fieldCache: &StringFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: String(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "StringFieldStatic", fieldType: "Ljava/lang/String;", fieldCache: &StringFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public java.lang.String org.genie.SwiftTest.StringField

    private static var StringField_FieldID: jfieldID?

    public var StringField: String! {
        get {
            let value = JNIField.GetObjectField( fieldName: "StringField", fieldType: "Ljava/lang/String;", fieldCache: &SwiftTest.StringField_FieldID, object: javaObject )
            return JNIType.decode( type: String(), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "StringField", fieldType: "Ljava/lang/String;", fieldCache: &SwiftTest.StringField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static java.lang.String[] org.genie.SwiftTest.StringArrayFieldStatic

    private static var StringArrayFieldStatic_FieldID: jfieldID?

    public static var StringArrayFieldStatic: [String]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "StringArrayFieldStatic", fieldType: "[Ljava/lang/String;", fieldCache: &StringArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [String](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "StringArrayFieldStatic", fieldType: "[Ljava/lang/String;", fieldCache: &StringArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public java.lang.String[] org.genie.SwiftTest.StringArrayField

    private static var StringArrayField_FieldID: jfieldID?

    public var StringArrayField: [String]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "StringArrayField", fieldType: "[Ljava/lang/String;", fieldCache: &SwiftTest.StringArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [String](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "StringArrayField", fieldType: "[Ljava/lang/String;", fieldCache: &SwiftTest.StringArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public static java.lang.String[][] org.genie.SwiftTest.String2dArrayFieldStatic

    private static var String2dArrayFieldStatic_FieldID: jfieldID?

    public static var String2dArrayFieldStatic: [[String]]! {
        get {
            let value = JNIField.GetStaticObjectField( fieldName: "String2dArrayFieldStatic", fieldType: "[[Ljava/lang/String;", fieldCache: &String2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass )
            return JNIType.decode( type: [[String]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetStaticObjectField( fieldName: "String2dArrayFieldStatic", fieldType: "[[Ljava/lang/String;", fieldCache: &String2dArrayFieldStatic_FieldID, className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, value: value.l )
        }
    }

    /// public java.lang.String[][] org.genie.SwiftTest.String2dArrayField

    private static var String2dArrayField_FieldID: jfieldID?

    public var String2dArrayField: [[String]]! {
        get {
            let value = JNIField.GetObjectField( fieldName: "String2dArrayField", fieldType: "[[Ljava/lang/String;", fieldCache: &SwiftTest.String2dArrayField_FieldID, object: javaObject )
            return JNIType.decode( type: [[String]](), from: value )
        }
        set(newValue) {
            let value = JNIType.encode( value: newValue, locals: nil )
            JNIField.SetObjectField( fieldName: "String2dArrayField", fieldType: "[[Ljava/lang/String;", fieldCache: &SwiftTest.String2dArrayField_FieldID, object: javaObject, value: value.l )
        }
    }

    /// public org.genie.SwiftTest()

    private static var new_MethodID_1: jmethodID?

    public convenience init() {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        let __object = JNIMethod.NewObject( className: "org/genie/SwiftTest", classCache: &SwiftTest.SwiftTestJNIClass, methodSig: "()V", methodCache: &SwiftTest.new_MethodID_1, args: &__args, locals: nil )
        self.init( javaObject: __object )
    }

    /// public static boolean org.genie.SwiftTest.booleanMethodStatic(boolean)

    private static var booleanMethodStatic_MethodID_2: jmethodID?

    public class func booleanMethodStatic( arg0: Bool ) -> Bool {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticBooleanMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "booleanMethodStatic", methodSig: "(Z)Z", methodCache: &booleanMethodStatic_MethodID_2, args: &__args, locals: &__locals )
        return JNIType.decode( type: Bool(), from: __return )
    }

    public class func booleanMethodStatic( _ _arg0: Bool ) -> Bool {
        return booleanMethodStatic( arg0: _arg0 )
    }

    /// public boolean org.genie.SwiftTest.booleanMethod(boolean)

    private static var booleanMethod_MethodID_3: jmethodID?

    public func booleanMethod( arg0: Bool ) -> Bool {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallBooleanMethod( object: javaObject, methodName: "booleanMethod", methodSig: "(Z)Z", methodCache: &SwiftTest.booleanMethod_MethodID_3, args: &__args, locals: &__locals )
        return JNIType.decode( type: Bool(), from: __return )
    }

    public func booleanMethod( _ _arg0: Bool ) -> Bool {
        return booleanMethod( arg0: _arg0 )
    }

    /// public static boolean[] org.genie.SwiftTest.booleanArrayMethodStatic(boolean[])

    private static var booleanArrayMethodStatic_MethodID_4: jmethodID?

    public class func booleanArrayMethodStatic( arg0: [Bool]? ) -> [Bool]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "booleanArrayMethodStatic", methodSig: "([Z)[Z", methodCache: &booleanArrayMethodStatic_MethodID_4, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Bool](), from: __return )
    }

    public class func booleanArrayMethodStatic( _ _arg0: [Bool]? ) -> [Bool]! {
        return booleanArrayMethodStatic( arg0: _arg0 )
    }

    /// public boolean[] org.genie.SwiftTest.booleanArrayMethod(boolean[])

    private static var booleanArrayMethod_MethodID_5: jmethodID?

    public func booleanArrayMethod( arg0: [Bool]? ) -> [Bool]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "booleanArrayMethod", methodSig: "([Z)[Z", methodCache: &SwiftTest.booleanArrayMethod_MethodID_5, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Bool](), from: __return )
    }

    public func booleanArrayMethod( _ _arg0: [Bool]? ) -> [Bool]! {
        return booleanArrayMethod( arg0: _arg0 )
    }

    /// public static boolean[][] org.genie.SwiftTest.boolean2dArrayMethodStatic(boolean[][])

    private static var boolean2dArrayMethodStatic_MethodID_6: jmethodID?

    public class func boolean2dArrayMethodStatic( arg0: [[Bool]]? ) -> [[Bool]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "boolean2dArrayMethodStatic", methodSig: "([[Z)[[Z", methodCache: &boolean2dArrayMethodStatic_MethodID_6, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Bool]](), from: __return )
    }

    public class func boolean2dArrayMethodStatic( _ _arg0: [[Bool]]? ) -> [[Bool]]! {
        return boolean2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public boolean[][] org.genie.SwiftTest.boolean2dArrayMethod(boolean[][])

    private static var boolean2dArrayMethod_MethodID_7: jmethodID?

    public func boolean2dArrayMethod( arg0: [[Bool]]? ) -> [[Bool]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "boolean2dArrayMethod", methodSig: "([[Z)[[Z", methodCache: &SwiftTest.boolean2dArrayMethod_MethodID_7, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Bool]](), from: __return )
    }

    public func boolean2dArrayMethod( _ _arg0: [[Bool]]? ) -> [[Bool]]! {
        return boolean2dArrayMethod( arg0: _arg0 )
    }

    /// public static byte org.genie.SwiftTest.byteMethodStatic(byte)

    private static var byteMethodStatic_MethodID_8: jmethodID?

    public class func byteMethodStatic( arg0: Int8 ) -> Int8 {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticByteMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "byteMethodStatic", methodSig: "(B)B", methodCache: &byteMethodStatic_MethodID_8, args: &__args, locals: &__locals )
        return JNIType.decode( type: Int8(), from: __return )
    }

    public class func byteMethodStatic( _ _arg0: Int8 ) -> Int8 {
        return byteMethodStatic( arg0: _arg0 )
    }

    /// public byte org.genie.SwiftTest.byteMethod(byte)

    private static var byteMethod_MethodID_9: jmethodID?

    public func byteMethod( arg0: Int8 ) -> Int8 {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallByteMethod( object: javaObject, methodName: "byteMethod", methodSig: "(B)B", methodCache: &SwiftTest.byteMethod_MethodID_9, args: &__args, locals: &__locals )
        return JNIType.decode( type: Int8(), from: __return )
    }

    public func byteMethod( _ _arg0: Int8 ) -> Int8 {
        return byteMethod( arg0: _arg0 )
    }

    /// public static byte[] org.genie.SwiftTest.byteArrayMethodStatic(byte[])

    private static var byteArrayMethodStatic_MethodID_10: jmethodID?

    public class func byteArrayMethodStatic( arg0: [Int8]? ) -> [Int8]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "byteArrayMethodStatic", methodSig: "([B)[B", methodCache: &byteArrayMethodStatic_MethodID_10, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Int8](), from: __return )
    }

    public class func byteArrayMethodStatic( _ _arg0: [Int8]? ) -> [Int8]! {
        return byteArrayMethodStatic( arg0: _arg0 )
    }

    /// public byte[] org.genie.SwiftTest.byteArrayMethod(byte[])

    private static var byteArrayMethod_MethodID_11: jmethodID?

    public func byteArrayMethod( arg0: [Int8]? ) -> [Int8]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "byteArrayMethod", methodSig: "([B)[B", methodCache: &SwiftTest.byteArrayMethod_MethodID_11, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Int8](), from: __return )
    }

    public func byteArrayMethod( _ _arg0: [Int8]? ) -> [Int8]! {
        return byteArrayMethod( arg0: _arg0 )
    }

    /// public static byte[][] org.genie.SwiftTest.byte2dArrayMethodStatic(byte[][])

    private static var byte2dArrayMethodStatic_MethodID_12: jmethodID?

    public class func byte2dArrayMethodStatic( arg0: [[Int8]]? ) -> [[Int8]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "byte2dArrayMethodStatic", methodSig: "([[B)[[B", methodCache: &byte2dArrayMethodStatic_MethodID_12, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Int8]](), from: __return )
    }

    public class func byte2dArrayMethodStatic( _ _arg0: [[Int8]]? ) -> [[Int8]]! {
        return byte2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public byte[][] org.genie.SwiftTest.byte2dArrayMethod(byte[][])

    private static var byte2dArrayMethod_MethodID_13: jmethodID?

    public func byte2dArrayMethod( arg0: [[Int8]]? ) -> [[Int8]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "byte2dArrayMethod", methodSig: "([[B)[[B", methodCache: &SwiftTest.byte2dArrayMethod_MethodID_13, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Int8]](), from: __return )
    }

    public func byte2dArrayMethod( _ _arg0: [[Int8]]? ) -> [[Int8]]! {
        return byte2dArrayMethod( arg0: _arg0 )
    }

    /// public static char org.genie.SwiftTest.charMethodStatic(char)

    private static var charMethodStatic_MethodID_14: jmethodID?

    public class func charMethodStatic( arg0: UInt16 ) -> UInt16 {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticCharMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "charMethodStatic", methodSig: "(C)C", methodCache: &charMethodStatic_MethodID_14, args: &__args, locals: &__locals )
        return JNIType.decode( type: UInt16(), from: __return )
    }

    public class func charMethodStatic( _ _arg0: UInt16 ) -> UInt16 {
        return charMethodStatic( arg0: _arg0 )
    }

    /// public char org.genie.SwiftTest.charMethod(char)

    private static var charMethod_MethodID_15: jmethodID?

    public func charMethod( arg0: UInt16 ) -> UInt16 {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallCharMethod( object: javaObject, methodName: "charMethod", methodSig: "(C)C", methodCache: &SwiftTest.charMethod_MethodID_15, args: &__args, locals: &__locals )
        return JNIType.decode( type: UInt16(), from: __return )
    }

    public func charMethod( _ _arg0: UInt16 ) -> UInt16 {
        return charMethod( arg0: _arg0 )
    }

    /// public static char[] org.genie.SwiftTest.charArrayMethodStatic(char[])

    private static var charArrayMethodStatic_MethodID_16: jmethodID?

    public class func charArrayMethodStatic( arg0: [UInt16]? ) -> [UInt16]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "charArrayMethodStatic", methodSig: "([C)[C", methodCache: &charArrayMethodStatic_MethodID_16, args: &__args, locals: &__locals )
        return JNIType.decode( type: [UInt16](), from: __return )
    }

    public class func charArrayMethodStatic( _ _arg0: [UInt16]? ) -> [UInt16]! {
        return charArrayMethodStatic( arg0: _arg0 )
    }

    /// public char[] org.genie.SwiftTest.charArrayMethod(char[])

    private static var charArrayMethod_MethodID_17: jmethodID?

    public func charArrayMethod( arg0: [UInt16]? ) -> [UInt16]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "charArrayMethod", methodSig: "([C)[C", methodCache: &SwiftTest.charArrayMethod_MethodID_17, args: &__args, locals: &__locals )
        return JNIType.decode( type: [UInt16](), from: __return )
    }

    public func charArrayMethod( _ _arg0: [UInt16]? ) -> [UInt16]! {
        return charArrayMethod( arg0: _arg0 )
    }

    /// public static char[][] org.genie.SwiftTest.char2dArrayMethodStatic(char[][])

    private static var char2dArrayMethodStatic_MethodID_18: jmethodID?

    public class func char2dArrayMethodStatic( arg0: [[UInt16]]? ) -> [[UInt16]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "char2dArrayMethodStatic", methodSig: "([[C)[[C", methodCache: &char2dArrayMethodStatic_MethodID_18, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[UInt16]](), from: __return )
    }

    public class func char2dArrayMethodStatic( _ _arg0: [[UInt16]]? ) -> [[UInt16]]! {
        return char2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public char[][] org.genie.SwiftTest.char2dArrayMethod(char[][])

    private static var char2dArrayMethod_MethodID_19: jmethodID?

    public func char2dArrayMethod( arg0: [[UInt16]]? ) -> [[UInt16]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "char2dArrayMethod", methodSig: "([[C)[[C", methodCache: &SwiftTest.char2dArrayMethod_MethodID_19, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[UInt16]](), from: __return )
    }

    public func char2dArrayMethod( _ _arg0: [[UInt16]]? ) -> [[UInt16]]! {
        return char2dArrayMethod( arg0: _arg0 )
    }

    /// public static short org.genie.SwiftTest.shortMethodStatic(short)

    private static var shortMethodStatic_MethodID_20: jmethodID?

    public class func shortMethodStatic( arg0: Int16 ) -> Int16 {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticShortMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "shortMethodStatic", methodSig: "(S)S", methodCache: &shortMethodStatic_MethodID_20, args: &__args, locals: &__locals )
        return JNIType.decode( type: Int16(), from: __return )
    }

    public class func shortMethodStatic( _ _arg0: Int16 ) -> Int16 {
        return shortMethodStatic( arg0: _arg0 )
    }

    /// public short org.genie.SwiftTest.shortMethod(short)

    private static var shortMethod_MethodID_21: jmethodID?

    public func shortMethod( arg0: Int16 ) -> Int16 {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallShortMethod( object: javaObject, methodName: "shortMethod", methodSig: "(S)S", methodCache: &SwiftTest.shortMethod_MethodID_21, args: &__args, locals: &__locals )
        return JNIType.decode( type: Int16(), from: __return )
    }

    public func shortMethod( _ _arg0: Int16 ) -> Int16 {
        return shortMethod( arg0: _arg0 )
    }

    /// public static short[] org.genie.SwiftTest.shortArrayMethodStatic(short[])

    private static var shortArrayMethodStatic_MethodID_22: jmethodID?

    public class func shortArrayMethodStatic( arg0: [Int16]? ) -> [Int16]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "shortArrayMethodStatic", methodSig: "([S)[S", methodCache: &shortArrayMethodStatic_MethodID_22, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Int16](), from: __return )
    }

    public class func shortArrayMethodStatic( _ _arg0: [Int16]? ) -> [Int16]! {
        return shortArrayMethodStatic( arg0: _arg0 )
    }

    /// public short[] org.genie.SwiftTest.shortArrayMethod(short[])

    private static var shortArrayMethod_MethodID_23: jmethodID?

    public func shortArrayMethod( arg0: [Int16]? ) -> [Int16]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "shortArrayMethod", methodSig: "([S)[S", methodCache: &SwiftTest.shortArrayMethod_MethodID_23, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Int16](), from: __return )
    }

    public func shortArrayMethod( _ _arg0: [Int16]? ) -> [Int16]! {
        return shortArrayMethod( arg0: _arg0 )
    }

    /// public static short[][] org.genie.SwiftTest.short2dArrayMethodStatic(short[][])

    private static var short2dArrayMethodStatic_MethodID_24: jmethodID?

    public class func short2dArrayMethodStatic( arg0: [[Int16]]? ) -> [[Int16]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "short2dArrayMethodStatic", methodSig: "([[S)[[S", methodCache: &short2dArrayMethodStatic_MethodID_24, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Int16]](), from: __return )
    }

    public class func short2dArrayMethodStatic( _ _arg0: [[Int16]]? ) -> [[Int16]]! {
        return short2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public short[][] org.genie.SwiftTest.short2dArrayMethod(short[][])

    private static var short2dArrayMethod_MethodID_25: jmethodID?

    public func short2dArrayMethod( arg0: [[Int16]]? ) -> [[Int16]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "short2dArrayMethod", methodSig: "([[S)[[S", methodCache: &SwiftTest.short2dArrayMethod_MethodID_25, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Int16]](), from: __return )
    }

    public func short2dArrayMethod( _ _arg0: [[Int16]]? ) -> [[Int16]]! {
        return short2dArrayMethod( arg0: _arg0 )
    }

    /// public static int org.genie.SwiftTest.intMethodStatic(int)

    private static var intMethodStatic_MethodID_26: jmethodID?

    public class func intMethodStatic( arg0: Int ) -> Int {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticIntMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "intMethodStatic", methodSig: "(I)I", methodCache: &intMethodStatic_MethodID_26, args: &__args, locals: &__locals )
        return JNIType.decode( type: Int(), from: __return )
    }

    public class func intMethodStatic( _ _arg0: Int ) -> Int {
        return intMethodStatic( arg0: _arg0 )
    }

    /// public int org.genie.SwiftTest.intMethod(int)

    private static var intMethod_MethodID_27: jmethodID?

    public func intMethod( arg0: Int ) -> Int {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallIntMethod( object: javaObject, methodName: "intMethod", methodSig: "(I)I", methodCache: &SwiftTest.intMethod_MethodID_27, args: &__args, locals: &__locals )
        return JNIType.decode( type: Int(), from: __return )
    }

    public func intMethod( _ _arg0: Int ) -> Int {
        return intMethod( arg0: _arg0 )
    }

    /// public static int[] org.genie.SwiftTest.intArrayMethodStatic(int[])

    private static var intArrayMethodStatic_MethodID_28: jmethodID?

    public class func intArrayMethodStatic( arg0: [Int32]? ) -> [Int32]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "intArrayMethodStatic", methodSig: "([I)[I", methodCache: &intArrayMethodStatic_MethodID_28, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Int32](), from: __return )
    }

    public class func intArrayMethodStatic( _ _arg0: [Int32]? ) -> [Int32]! {
        return intArrayMethodStatic( arg0: _arg0 )
    }

    /// public int[] org.genie.SwiftTest.intArrayMethod(int[])

    private static var intArrayMethod_MethodID_29: jmethodID?

    public func intArrayMethod( arg0: [Int32]? ) -> [Int32]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "intArrayMethod", methodSig: "([I)[I", methodCache: &SwiftTest.intArrayMethod_MethodID_29, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Int32](), from: __return )
    }

    public func intArrayMethod( _ _arg0: [Int32]? ) -> [Int32]! {
        return intArrayMethod( arg0: _arg0 )
    }

    /// public static int[][] org.genie.SwiftTest.int2dArrayMethodStatic(int[][])

    private static var int2dArrayMethodStatic_MethodID_30: jmethodID?

    public class func int2dArrayMethodStatic( arg0: [[Int32]]? ) -> [[Int32]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "int2dArrayMethodStatic", methodSig: "([[I)[[I", methodCache: &int2dArrayMethodStatic_MethodID_30, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Int32]](), from: __return )
    }

    public class func int2dArrayMethodStatic( _ _arg0: [[Int32]]? ) -> [[Int32]]! {
        return int2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public int[][] org.genie.SwiftTest.int2dArrayMethod(int[][])

    private static var int2dArrayMethod_MethodID_31: jmethodID?

    public func int2dArrayMethod( arg0: [[Int32]]? ) -> [[Int32]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "int2dArrayMethod", methodSig: "([[I)[[I", methodCache: &SwiftTest.int2dArrayMethod_MethodID_31, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Int32]](), from: __return )
    }

    public func int2dArrayMethod( _ _arg0: [[Int32]]? ) -> [[Int32]]! {
        return int2dArrayMethod( arg0: _arg0 )
    }

    /// public static long org.genie.SwiftTest.longMethodStatic(long)

    private static var longMethodStatic_MethodID_32: jmethodID?

    public class func longMethodStatic( arg0: Int64 ) -> Int64 {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticLongMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "longMethodStatic", methodSig: "(J)J", methodCache: &longMethodStatic_MethodID_32, args: &__args, locals: &__locals )
        return JNIType.decode( type: Int64(), from: __return )
    }

    public class func longMethodStatic( _ _arg0: Int64 ) -> Int64 {
        return longMethodStatic( arg0: _arg0 )
    }

    /// public long org.genie.SwiftTest.longMethod(long)

    private static var longMethod_MethodID_33: jmethodID?

    public func longMethod( arg0: Int64 ) -> Int64 {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallLongMethod( object: javaObject, methodName: "longMethod", methodSig: "(J)J", methodCache: &SwiftTest.longMethod_MethodID_33, args: &__args, locals: &__locals )
        return JNIType.decode( type: Int64(), from: __return )
    }

    public func longMethod( _ _arg0: Int64 ) -> Int64 {
        return longMethod( arg0: _arg0 )
    }

    /// public static long[] org.genie.SwiftTest.longArrayMethodStatic(long[])

    private static var longArrayMethodStatic_MethodID_34: jmethodID?

    public class func longArrayMethodStatic( arg0: [Int64]? ) -> [Int64]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "longArrayMethodStatic", methodSig: "([J)[J", methodCache: &longArrayMethodStatic_MethodID_34, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Int64](), from: __return )
    }

    public class func longArrayMethodStatic( _ _arg0: [Int64]? ) -> [Int64]! {
        return longArrayMethodStatic( arg0: _arg0 )
    }

    /// public long[] org.genie.SwiftTest.longArrayMethod(long[])

    private static var longArrayMethod_MethodID_35: jmethodID?

    public func longArrayMethod( arg0: [Int64]? ) -> [Int64]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "longArrayMethod", methodSig: "([J)[J", methodCache: &SwiftTest.longArrayMethod_MethodID_35, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Int64](), from: __return )
    }

    public func longArrayMethod( _ _arg0: [Int64]? ) -> [Int64]! {
        return longArrayMethod( arg0: _arg0 )
    }

    /// public static long[][] org.genie.SwiftTest.long2dArrayMethodStatic(long[][])

    private static var long2dArrayMethodStatic_MethodID_36: jmethodID?

    public class func long2dArrayMethodStatic( arg0: [[Int64]]? ) -> [[Int64]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "long2dArrayMethodStatic", methodSig: "([[J)[[J", methodCache: &long2dArrayMethodStatic_MethodID_36, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Int64]](), from: __return )
    }

    public class func long2dArrayMethodStatic( _ _arg0: [[Int64]]? ) -> [[Int64]]! {
        return long2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public long[][] org.genie.SwiftTest.long2dArrayMethod(long[][])

    private static var long2dArrayMethod_MethodID_37: jmethodID?

    public func long2dArrayMethod( arg0: [[Int64]]? ) -> [[Int64]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "long2dArrayMethod", methodSig: "([[J)[[J", methodCache: &SwiftTest.long2dArrayMethod_MethodID_37, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Int64]](), from: __return )
    }

    public func long2dArrayMethod( _ _arg0: [[Int64]]? ) -> [[Int64]]! {
        return long2dArrayMethod( arg0: _arg0 )
    }

    /// public static float org.genie.SwiftTest.floatMethodStatic(float)

    private static var floatMethodStatic_MethodID_38: jmethodID?

    public class func floatMethodStatic( arg0: Float ) -> Float {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticFloatMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "floatMethodStatic", methodSig: "(F)F", methodCache: &floatMethodStatic_MethodID_38, args: &__args, locals: &__locals )
        return JNIType.decode( type: Float(), from: __return )
    }

    public class func floatMethodStatic( _ _arg0: Float ) -> Float {
        return floatMethodStatic( arg0: _arg0 )
    }

    /// public float org.genie.SwiftTest.floatMethod(float)

    private static var floatMethod_MethodID_39: jmethodID?

    public func floatMethod( arg0: Float ) -> Float {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallFloatMethod( object: javaObject, methodName: "floatMethod", methodSig: "(F)F", methodCache: &SwiftTest.floatMethod_MethodID_39, args: &__args, locals: &__locals )
        return JNIType.decode( type: Float(), from: __return )
    }

    public func floatMethod( _ _arg0: Float ) -> Float {
        return floatMethod( arg0: _arg0 )
    }

    /// public static float[] org.genie.SwiftTest.floatArrayMethodStatic(float[])

    private static var floatArrayMethodStatic_MethodID_40: jmethodID?

    public class func floatArrayMethodStatic( arg0: [Float]? ) -> [Float]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "floatArrayMethodStatic", methodSig: "([F)[F", methodCache: &floatArrayMethodStatic_MethodID_40, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Float](), from: __return )
    }

    public class func floatArrayMethodStatic( _ _arg0: [Float]? ) -> [Float]! {
        return floatArrayMethodStatic( arg0: _arg0 )
    }

    /// public float[] org.genie.SwiftTest.floatArrayMethod(float[])

    private static var floatArrayMethod_MethodID_41: jmethodID?

    public func floatArrayMethod( arg0: [Float]? ) -> [Float]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "floatArrayMethod", methodSig: "([F)[F", methodCache: &SwiftTest.floatArrayMethod_MethodID_41, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Float](), from: __return )
    }

    public func floatArrayMethod( _ _arg0: [Float]? ) -> [Float]! {
        return floatArrayMethod( arg0: _arg0 )
    }

    /// public static float[][] org.genie.SwiftTest.float2dArrayMethodStatic(float[][])

    private static var float2dArrayMethodStatic_MethodID_42: jmethodID?

    public class func float2dArrayMethodStatic( arg0: [[Float]]? ) -> [[Float]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "float2dArrayMethodStatic", methodSig: "([[F)[[F", methodCache: &float2dArrayMethodStatic_MethodID_42, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Float]](), from: __return )
    }

    public class func float2dArrayMethodStatic( _ _arg0: [[Float]]? ) -> [[Float]]! {
        return float2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public float[][] org.genie.SwiftTest.float2dArrayMethod(float[][])

    private static var float2dArrayMethod_MethodID_43: jmethodID?

    public func float2dArrayMethod( arg0: [[Float]]? ) -> [[Float]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "float2dArrayMethod", methodSig: "([[F)[[F", methodCache: &SwiftTest.float2dArrayMethod_MethodID_43, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Float]](), from: __return )
    }

    public func float2dArrayMethod( _ _arg0: [[Float]]? ) -> [[Float]]! {
        return float2dArrayMethod( arg0: _arg0 )
    }

    /// public static double org.genie.SwiftTest.doubleMethodStatic(double)

    private static var doubleMethodStatic_MethodID_44: jmethodID?

    public class func doubleMethodStatic( arg0: Double ) -> Double {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticDoubleMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "doubleMethodStatic", methodSig: "(D)D", methodCache: &doubleMethodStatic_MethodID_44, args: &__args, locals: &__locals )
        return JNIType.decode( type: Double(), from: __return )
    }

    public class func doubleMethodStatic( _ _arg0: Double ) -> Double {
        return doubleMethodStatic( arg0: _arg0 )
    }

    /// public double org.genie.SwiftTest.doubleMethod(double)

    private static var doubleMethod_MethodID_45: jmethodID?

    public func doubleMethod( arg0: Double ) -> Double {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallDoubleMethod( object: javaObject, methodName: "doubleMethod", methodSig: "(D)D", methodCache: &SwiftTest.doubleMethod_MethodID_45, args: &__args, locals: &__locals )
        return JNIType.decode( type: Double(), from: __return )
    }

    public func doubleMethod( _ _arg0: Double ) -> Double {
        return doubleMethod( arg0: _arg0 )
    }

    /// public static double[] org.genie.SwiftTest.doubleArrayMethodStatic(double[])

    private static var doubleArrayMethodStatic_MethodID_46: jmethodID?

    public class func doubleArrayMethodStatic( arg0: [Double]? ) -> [Double]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "doubleArrayMethodStatic", methodSig: "([D)[D", methodCache: &doubleArrayMethodStatic_MethodID_46, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Double](), from: __return )
    }

    public class func doubleArrayMethodStatic( _ _arg0: [Double]? ) -> [Double]! {
        return doubleArrayMethodStatic( arg0: _arg0 )
    }

    /// public double[] org.genie.SwiftTest.doubleArrayMethod(double[])

    private static var doubleArrayMethod_MethodID_47: jmethodID?

    public func doubleArrayMethod( arg0: [Double]? ) -> [Double]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "doubleArrayMethod", methodSig: "([D)[D", methodCache: &SwiftTest.doubleArrayMethod_MethodID_47, args: &__args, locals: &__locals )
        return JNIType.decode( type: [Double](), from: __return )
    }

    public func doubleArrayMethod( _ _arg0: [Double]? ) -> [Double]! {
        return doubleArrayMethod( arg0: _arg0 )
    }

    /// public static double[][] org.genie.SwiftTest.double2dArrayMethodStatic(double[][])

    private static var double2dArrayMethodStatic_MethodID_48: jmethodID?

    public class func double2dArrayMethodStatic( arg0: [[Double]]? ) -> [[Double]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "double2dArrayMethodStatic", methodSig: "([[D)[[D", methodCache: &double2dArrayMethodStatic_MethodID_48, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Double]](), from: __return )
    }

    public class func double2dArrayMethodStatic( _ _arg0: [[Double]]? ) -> [[Double]]! {
        return double2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public double[][] org.genie.SwiftTest.double2dArrayMethod(double[][])

    private static var double2dArrayMethod_MethodID_49: jmethodID?

    public func double2dArrayMethod( arg0: [[Double]]? ) -> [[Double]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "double2dArrayMethod", methodSig: "([[D)[[D", methodCache: &SwiftTest.double2dArrayMethod_MethodID_49, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[Double]](), from: __return )
    }

    public func double2dArrayMethod( _ _arg0: [[Double]]? ) -> [[Double]]! {
        return double2dArrayMethod( arg0: _arg0 )
    }

    /// public static java.lang.String org.genie.SwiftTest.StringMethodStatic(java.lang.String)

    private static var StringMethodStatic_MethodID_50: jmethodID?

    public class func StringMethodStatic( arg0: String? ) -> String! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "StringMethodStatic", methodSig: "(Ljava/lang/String;)Ljava/lang/String;", methodCache: &StringMethodStatic_MethodID_50, args: &__args, locals: &__locals )
        return JNIType.decode( type: String(), from: __return )
    }

    public class func StringMethodStatic( _ _arg0: String? ) -> String! {
        return StringMethodStatic( arg0: _arg0 )
    }

    /// public java.lang.String org.genie.SwiftTest.StringMethod(java.lang.String)

    private static var StringMethod_MethodID_51: jmethodID?

    public func StringMethod( arg0: String? ) -> String! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "StringMethod", methodSig: "(Ljava/lang/String;)Ljava/lang/String;", methodCache: &SwiftTest.StringMethod_MethodID_51, args: &__args, locals: &__locals )
        return JNIType.decode( type: String(), from: __return )
    }

    public func StringMethod( _ _arg0: String? ) -> String! {
        return StringMethod( arg0: _arg0 )
    }

    /// public static java.lang.String[] org.genie.SwiftTest.StringArrayMethodStatic(java.lang.String[])

    private static var StringArrayMethodStatic_MethodID_52: jmethodID?

    public class func StringArrayMethodStatic( arg0: [String]? ) -> [String]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "StringArrayMethodStatic", methodSig: "([Ljava/lang/String;)[Ljava/lang/String;", methodCache: &StringArrayMethodStatic_MethodID_52, args: &__args, locals: &__locals )
        return JNIType.decode( type: [String](), from: __return )
    }

    public class func StringArrayMethodStatic( _ _arg0: [String]? ) -> [String]! {
        return StringArrayMethodStatic( arg0: _arg0 )
    }

    /// public java.lang.String[] org.genie.SwiftTest.StringArrayMethod(java.lang.String[])

    private static var StringArrayMethod_MethodID_53: jmethodID?

    public func StringArrayMethod( arg0: [String]? ) -> [String]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "StringArrayMethod", methodSig: "([Ljava/lang/String;)[Ljava/lang/String;", methodCache: &SwiftTest.StringArrayMethod_MethodID_53, args: &__args, locals: &__locals )
        return JNIType.decode( type: [String](), from: __return )
    }

    public func StringArrayMethod( _ _arg0: [String]? ) -> [String]! {
        return StringArrayMethod( arg0: _arg0 )
    }

    /// public static java.lang.String[][] org.genie.SwiftTest.String2dArrayMethodStatic(java.lang.String[][])

    private static var String2dArrayMethodStatic_MethodID_54: jmethodID?

    public class func String2dArrayMethodStatic( arg0: [[String]]? ) -> [[String]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallStaticObjectMethod( className: "org/genie/SwiftTest", classCache: &SwiftTestJNIClass, methodName: "String2dArrayMethodStatic", methodSig: "([[Ljava/lang/String;)[[Ljava/lang/String;", methodCache: &String2dArrayMethodStatic_MethodID_54, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[String]](), from: __return )
    }

    public class func String2dArrayMethodStatic( _ _arg0: [[String]]? ) -> [[String]]! {
        return String2dArrayMethodStatic( arg0: _arg0 )
    }

    /// public java.lang.String[][] org.genie.SwiftTest.String2dArrayMethod(java.lang.String[][])

    private static var String2dArrayMethod_MethodID_55: jmethodID?

    public func String2dArrayMethod( arg0: [[String]]? ) -> [[String]]! {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: arg0, locals: &__locals )
        let __return = JNIMethod.CallObjectMethod( object: javaObject, methodName: "String2dArrayMethod", methodSig: "([[Ljava/lang/String;)[[Ljava/lang/String;", methodCache: &SwiftTest.String2dArrayMethod_MethodID_55, args: &__args, locals: &__locals )
        return JNIType.decode( type: [[String]](), from: __return )
    }

    public func String2dArrayMethod( _ _arg0: [[String]]? ) -> [[String]]! {
        return String2dArrayMethod( arg0: _arg0 )
    }

}
