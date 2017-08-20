//
//  genswift.java
//  https://github.com/SwiftJava/SwiftJava
//  $Id: //depot/SwiftJava/src/genswift.java#94 $
//
//  Created by John Holdsworth on 14/07/2016.
//  Copyright (c) 2016 John Holdsworth. All rights reserved.
//  MIT License
//
//  See ../genswift.sh for details on invocation.
//  Code generator for Swift written in the style of a Perl script.
//
//  Requires https://github.com/SwiftJava/java_swift release 2.1.0+
//
//  List of classes to be generated received on stdin which is the
//  output of a grep on the target jar for the classes of interest.
//
//  The ordering of frameworks can be specified in argv[0] otherwise
//  the ordering is found by processing all files then re-processing
//  after reordering to minimise the number of forward references in
//  the generated code. argv[1] can be the destination directory for
/// generated Swift and argv[2] can be the root for Java generation.
//
//  For Java classes, a Swift class of the same name is generated in
//  a framework derived from the first two packages of the classes
//  full name (e.g. java_lang, java_util.) For Java interfaces a
//  Swift protocol is generated along with a concrete class with
//  "Forward" added that can be used to message to instances of
//  the protocol from Swift.
//
//  Where the interface is java.lang.Runnable or the interface name
//  ends in "Listener", "Handler" or "Manager" an additional "Base"
//  class is generated, instances of which can be passed to Java and
//  have Swift methods in a subclass called from Java. This is used
//  in threading and in event processing in Swift. These "Base" classes
//  are also generated for concrete classes with names ending in "Adapter".
//  These seemingly arbitrary conventions are taken from java.awt & swing.
//
//  A variation on this forwarding of Java methods into Swift is where
//  a method is generally a subclasses responsibility to implement such
//  as the method java.awt.Canvas.paint(). A list of these methods must
//  be maintained in this source and where one is encountered a "Base"
//  class is generated allowing the method to be implemented in Swift.
//
//  For this proxy of Java methods into Swift, support is required on
//  the Java side of the divide. Proxy classes delegating to "native"
//  implementations of the relevant method are generated and must be
//  available to the application. On UNIX this is through the jar file
//  ~/.swiftjava.jar built from these generated sources using ../genjar.sh.
//
//
//  MIT License
//
//  Copyright (c) 2016-7, John Holdsworth
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy of this
//  software and associated documentation files (the "Software"), to deal in the Software
//  without restriction, including without limitation the rights to use, copy, modify, merge,
//  publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons
//  to whom the Software is furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all copies
//  or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
//  INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
//  PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
//  FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
//  ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//

import java.io.*;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class genswift {

    static void print( String s ) {
        System.out.println(s);
    }

    static void progress( Object o ) {
            //print( o.toString() );
    }

    static int apiVersion = 2;

    static String Unavailable = "Unavailable";
    static String pathToWriteSource = "./";
    static String organisation = "org.swiftjava.";
    static String proxySourcePath = organisation.replace('.', '/');
    static String repoBase = "https://github.com/SwiftJava/";
    static boolean sortMembers = true, convertEnums = true, returnImplicitlyUnwrapped = true;

    boolean isUnavailable( Class<?> type ) {
        return notVoid(type) && swiftTypeFor(type, false, true).indexOf(Unavailable) != -1;
    }

    static HashMap<String,Boolean> swiftKeywords = new HashMap<String,Boolean>() {
        private static final long serialVersionUID = 1L;

        {
            put( "init", true );
            put( "self", true );
            put( "new", true );
            put( "in", true );
            put( "is", true );
            put( "operator", true );
            put( "subscript", true );
            put( "where", true );
            put( "as", true );
        }
    };

    static HashMap<String,Boolean> swiftReserved = new HashMap<String,Boolean>() {
        private static final long serialVersionUID = 1L;

        {
            put( Float.class.getName(), true );
            put( Double.class.getName(), true );
            put( Class.class.getName(), true );
            put( Object.class.getName(), true );
            put( Enum.class.getName(), true );
            put( String.class.getName(), true );
            put( Comparable.class.getName(), true );
            put( Error.class.getName(), true );
            put( SecurityException.class.getName(), true );
            put( java.util.Map.class.getName(), true );
            put( java.util.Set.class.getName(), true );
            put( java.util.Locale.class.getName(), true );
            put( java.util.Comparator.class.getName(), true );
            put( javax.swing.text.TabSet.class.getName(), true );
        }
    };

    static HashMap<String,Boolean> keyClasses = new HashMap<String,Boolean>() {
        private static final long serialVersionUID = 1L;

        {
            put( Object.class.getName(), true );
            put( Class.class.getName(), true );
            put( Enum.class.getName(), true );
            put( Runnable.class.getName(), true );
            put( Throwable.class.getName(), true );
            put( Exception.class.getName(), true );
            put( java.util.Set.class.getName(), true );
            put( java.util.Map.class.getName(), true );
            put( java.util.HashMap.class.getName(), true );
        }
    };

    static HashMap<String,Boolean> subclassResponsibilities = new HashMap<String,Boolean>() {
        private static final long serialVersionUID = 1L;

        {
            put( "public void java.awt.Window.paint(java.awt.Graphics)", true );
            put( "public void java.awt.Canvas.paint(java.awt.Graphics)", true );
            put( "public void java.awt.Canvas.update(java.awt.Graphics)", true );
            put( "public java.awt.Component javax.swing.JTable.prepareRenderer(javax.swing.table.TableCellRenderer,int,int)", true );
            put( "public void javax.swing.text.PlainDocument.insertString(int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException", true );
            put( "public java.awt.Component javax.swing.table.DefaultTableCellRenderer.getTableCellRendererComponent(javax.swing.JTable,java.lang.Object,boolean,boolean,int,int)", true );
            put( "public boolean javax.swing.table.DefaultTableModel.isCellEditable(int,int)", true );
            put( "public void javax.swing.JTable.changeSelection(int,int,boolean,boolean)", true );
        }
    };

    static HashMap<String,String> swiftTypes = new HashMap<String,String>() {
        private static final long serialVersionUID = 1L;

        {
            put( "boolean", "Bool");
            put( "byte", "Int8");
            put( "char", "UInt16");
            put( "short", "Int16");
            put( "int", "Int");
            put( "long", "Int64");
            put( "float", "Float");
            put( "double", "Double");
            put( Float.class.getName(), "Float");
            put( String.class.getName(), "String");
        }
    };

    static HashMap<String,String> arrayTypes = new HashMap<String,String>() {
        private static final long serialVersionUID = 1L;

        {
            put( "boolean", "Bool");
            put( "byte", "Int8");
            put( "char", "UInt16");
            put( "short", "Int16");
            put( "int", "Int32");
            put( "long", "Int64");
            put( "float", "Float");
            put( "double", "Double");
            put( String.class.getName(), "String");
        }
    };

    static HashMap<String,String> funcNames = new HashMap<String,String>() {
        private static final long serialVersionUID = 1L;

        {
            put( "boolean", "Boolean");
            put( "byte", "Byte");
            put( "char", "Char");
            put( "short", "Short");
            put( "int", "Int");
            put( "long", "Long");
            put( "float", "Float");
            put( "double", "Double");
            put( "void", "Void");
        }
    };

    static HashMap<String,String> jvalueFields = new HashMap<String,String>() {
        private static final long serialVersionUID = 1L;

        {
            put( "boolean", "z");
            put( "byte", "b");
            put( "char", "c");
            put( "short", "s");
            put( "int", "i");
            put( "long", "j");
            put( "float", "f");
            put( "double", "d");
            put( "void", "v");
        }
    };

    boolean excludeFromCodeGeneration( Class<?> clazz ) {
        String className = clazz.getName();
        return !Modifier.isPublic(clazz.getModifiers())
                || classPrefix(className).equals("java_util") && className.indexOf('$') != -1
                || className.equals("java.util.concurrent.CompletableFuture");
    }

    boolean supportsProxyCallback( Class<?> clazz ) {
        if ( false )
            return clazz.isInterface() && !dontEnforceProtocol( clazz ) && !clazz.getName().startsWith("java.util.") || isAdapter();
        String clazzName = clazz.getName();
        while ( clazzName.charAt(className.length()-1) == ']' )
                clazzName = clazzName.substring(0, clazzName.length()-1 );
        return clazz == java.lang.Runnable.class || isAdapter() || clazz.isInterface() &&
                (clazzName.endsWith("Listener") || clazzName.endsWith("Handler")
                || clazzName.endsWith("Manager"));// || clazzName.indexOf(".swiftbindings.") != -1);
    }

    boolean isAdapter() {
        return classSuffix.endsWith("Adapter");
    }

    String frameworkImports;

    HashMap<String,Boolean> referencedFrameworks = new HashMap<String,Boolean>();

    static int filesWritten = 0;
    static int frameworkLevel = 0;
    static int UnavailableReferences = 0;

    static String invocation = "genswift.java", packageOrder, swiftSourceRoot, javaSourceRoot;

    public static void main( String args[] ) {

        for ( int i=0 ; i<args.length ; i++ )
            invocation += " '"+args[i]+"'";

        switch ( args.length ) {
        case 3:
                javaSourceRoot = args[2];
        case 2:
                swiftSourceRoot = args[1];
            default:
                packageOrder = args[0];
        }

        String knownFrameworkOrder[] = ("java_swift|"+packageOrder).split("\\|");

        for ( frameworkLevel=0 ; frameworkLevel<knownFrameworkOrder.length ; frameworkLevel++ ) {
            String framework = classPrefix(knownFrameworkOrder[frameworkLevel].replace('/', '.')+".");
            frameworkLevels.put( framework, frameworkLevel );
            knownAdditionalFrameworks.put(framework, true);
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> paths = new ArrayList<String>();

            String pathToClass;
            while ((pathToClass = reader.readLine())!= null) {
                paths.add(pathToClass);

                try {
                    genswift generator = new genswift( pathToClass );
                    if ( generator.generate() )
                        generator.save();
                }
                catch ( Exception e ) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }

            if ( additionalFrameworks.size() > 1 ) {
                HashMap<String,Integer> alreadyMoved = new HashMap<String, Integer>();

                for ( int i=0; i<additionalFrameworks.size(); i++ ) {
                    String mightMove = additionalFrameworks.get(i);
                    if ( alreadyMoved.containsKey(mightMove) && alreadyMoved.get(mightMove) > 10 )
                        continue;

                    int mustBeAfter = i;
                    for ( int j=i+1; j<additionalFrameworks.size(); j++ )
                        if (references(mightMove, additionalFrameworks.get(j)) >
                            references(additionalFrameworks.get(j), mightMove) )
                            mustBeAfter = j;
                    if ( mustBeAfter > i ) {
                        print("Moving "+mightMove+"["+i+"] after "+additionalFrameworks.get(mustBeAfter)+"["+mustBeAfter+"]");
                        additionalFrameworks.remove(i);
                        additionalFrameworks.add(mustBeAfter, mightMove);
                        if ( !alreadyMoved.containsKey(mightMove) )
                            alreadyMoved.put(mightMove, 1);
                        else
                            alreadyMoved.put(mightMove, alreadyMoved.get(mightMove)+1);
                        i--;
                    }
                }

                frameworkLevel = knownFrameworkOrder.length;
                for ( int i=0; i<additionalFrameworks.size(); i++ )
                    if ( frameworkLevels.containsKey(additionalFrameworks.get(i)) )
                        frameworkLevels.put( additionalFrameworks.get(i), frameworkLevel++ );

                for ( String newFramework : additionalFrameworks ) {
                    StringBuilder pkg = new StringBuilder();
                    pkg.append( "\nimport PackageDescription\n\nlet package = Package(\n");
                    pkg.append("    name: \""+newFramework+"\",\n    dependencies: [\n");

                    if ( crossReferences.containsKey(newFramework) )
                        for ( String depend : crossReferences.get(newFramework).keySet() )
                            if ( !newFramework.equals(depend) ) {
                                if ( forwardReference( newFramework, depend ) )
                                    pkg.append("//");
                                pkg.append("        .Package(url: \"" + repoBase + depend +
                                        ".git\", versions: Version("+apiVersion+",0,0)..<Version("+(apiVersion+1)+",0,0)),\n");
                            }

                    pkg.append("        ]\n)\n");

                    try {
                        FileOutputStream out = new FileOutputStream( pathToWriteSource+newFramework+"/Package.swift" );
                        out.write( pkg.toString().getBytes("UTF-8") );
                        out.close();
                    }
                    catch ( IOException e ) {}
                }

                int beforeReorder = UnavailableReferences;
                UnavailableReferences = 0;

                for ( int i=0; i<paths.size(); i++ ) {
                    pathToClass = paths.get(i);
                    try {
                        genswift generator = new genswift( pathToClass );
                        if ( generator.generate() )
                            generator.save();
                    }
                    catch ( Exception e ) {
                        e.printStackTrace();
                    }
                }

                print( "Reorder "+beforeReorder+" -> "+UnavailableReferences );
            }
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }

        print("\n"+filesWritten+" files written.");
    }

    StringBuilder code = new StringBuilder();
    String pathToClass, className, classSuffix, currentFramework, visibility, classCacheVar;
    boolean isInterface, isEnum, isLost;
    Class<?> clazz, superclazz;

    genswift( String pathToClass ) {
        this.pathToClass = pathToClass;
    }

    boolean generate() throws Exception {
        className = pathToClass.replace('/', '.');
        clazz = Class.forName( className );

        print( "\n"+clazz );

        if ( excludeFromCodeGeneration( clazz ) )
            return false;

        classSuffix = classSuffix( className );
        currentFramework = classPrefix( className );

        if ( !frameworkLevels.containsKey(currentFramework) )
            frameworkLevels.put( currentFramework, frameworkLevel++ );
        if ( !knownAdditionalFrameworks.containsKey(currentFramework) ) {
            knownAdditionalFrameworks.put(currentFramework, true);
            additionalFrameworks.add(currentFramework);
        }

        frameworkImports = keyClasses.containsKey(className) ? "" : "\nimport java_swift\n";

        visibility = "open ";
        superclazz = clazz.getSuperclass();
        isInterface = clazz.isInterface();
        isEnum = isEnum( clazz );

        code.append("\n/// generated by: "+invocation+" ///\n");
//        code.append("\n/// JAVA_HOME: "+System.getenv("JAVA_HOME")+" ///\n");
//        code.append("/// "+new java.util.Date()+" ///\n");

        code.append("\n/// "+clazz+" ///\n");
        
        isLost = false;
        String derivedFrom = "";

        if (superclazz != null) {
            String sname = classTypeFor(superclazz, false, true);
            isLost = sname.indexOf(Unavailable+"Object") != -1;
            derivedFrom += ": " + sname;
        } else if (!isInterface)
            derivedFrom += ": JNIObject";

        ArrayList<Class<?>> interfacesSoFar = new ArrayList<Class<?>>();
        Class<?> supr = superclazz;
        while( supr != null ) {
            interfacesSoFar.add(supr);
            supr = supr.getSuperclass();
        }

        boolean hasUnavailable = false;
        for (Class<?> intrface : clazz.getInterfaces()) {
            if ( interfacesChangingReturnTypeInSubclass( intrface ) )
                continue;

            if ( redundantConformance( intrface, interfacesSoFar.toArray( new Class<?>[ interfacesSoFar.size() ] ) )
                    || excludeFromCodeGeneration(intrface) )
                continue;
            interfacesSoFar.add( intrface );

            String name = classTypeFor(intrface, false, true);
            boolean isUnavailable = name.indexOf(Unavailable+"Protocol") != -1;
            if ( isUnavailable )
                if ( hasUnavailable )
                    continue;
                else
                    hasUnavailable = true;

            if (derivedFrom == "")
                derivedFrom += ": ";
            else
                derivedFrom += ", ";

            derivedFrom += classTypeFor(intrface, false, true)+(isInterface?"":"");
        }

        if (isInterface && derivedFrom == "")
            derivedFrom += ": JavaProtocol";

        code.append("\n"+(isEnum ? "public enum" : isInterface ? "public protocol" : "open class") + " " +
                classSuffix+(isInterface?"" : "") + (isEnum ? ": Int, JNIObjectProtocol, JNIObjectInit" : derivedFrom) + " {\n\n");

        if ( isEnum ) {
    			String cases = "";
    			for ( Object constant : clazz.getEnumConstants() )
    				cases += (cases == "" ? "" : ", ") + ((Enum<?>)constant).name();
    			code.append("    case "+cases+"\n\n");
    			
    			code.append("    static let enumConstants = try! JavaClass.forName(\""+clazz.getName()+"\")\n" +
    	    			"        .getEnumConstants()!.map { "+classSuffix+"Forward( javaObject: $0.javaObject ) }\n\n");
    			
    			code.append("    public func underlier() -> "+classSuffix+"Forward"+" {\n");
    			code.append("        return "+classSuffix+".enumConstants[self.rawValue]\n    }\n\n");
    			
    			code.append("    public func localJavaObject(_ locals: UnsafeMutablePointer<[jobject]>) -> jobject? {\n");
    			code.append("        return underlier().localJavaObject( locals )\n    }\n\n");

    			code.append("    public init( javaObject: jobject? ) {\n");
    			code.append("        self = "+classSuffix+"( rawValue: JavaEnum( javaObject: javaObject ).ordinal() )!\n    }\n\n");
        }
        else if ( !isInterface ) {
            code.append("    public convenience init?( casting object: "+swiftTypeFor( java.lang.Object.class, false, true )+", _ file: StaticString = #file, _ line: Int = #line ) {\n");
            code.append("        self.init( javaObject: nil )\n" );
            if ( frameworkImports.indexOf("import java_lang") != -1 ) {
                    code.append("        if !object.validDownCast( toJavaClass: \""+className+"\", file, line ) {\n" );
                    code.append("            return nil\n");
                    code.append("        }\n");
            }
            code.append("        object.withJavaObject {\n");
            code.append("            self.javaObject = $0\n");
            code.append("        }\n");
            code.append("    }\n\n" );
        }

        classCacheVar = classSuffix+"JNIClass";
        if ( !isInterface && !isEnum )
            code.append( "    private static var "+classCacheVar+": jclass?\n\n" );

        HashMap<String,Boolean> fieldsSeen = new HashMap<String,Boolean>();
        findInterfaceMethods( clazz );

        if ( !isEnum ) {
        		generateFields( fieldsSeen, isInterface, clazz );

        		if ( !isInterface )
        			for ( Class<?> intrface : interfacesSoFar.toArray( new Class<?>[ interfacesSoFar.size() ] ) )
        				generateInterfaceFields( fieldsSeen, intrface );

        		generateConstructors( pathToClass, classSuffix, false );
        }

        generateMethods( clazz.getDeclaredMethods(), isInterface, fieldsSeen, classSuffix, false );

        ArrayList<java.lang.reflect.Method> responsibles = new ArrayList<java.lang.reflect.Method>();
        for ( java.lang.reflect.Method method : clazz.getMethods() ) {
            if ( subclassResponsibilities.containsKey(method.toString()) )
                responsibles.add( method );
        }

        if ( !isInterface && !isEnum )
            addAnyMethodsDeclaredInProtocolsButNotDefined( isInterface, fieldsSeen, classSuffix );

        code.append("}\n\n");

        if ( isInterface || isEnum ) {
            String superProtocol = "JNIObjectForward";
            if ( clazz.getInterfaces().length != 0 )
                superProtocol = classTypeFor( clazz.getInterfaces()[0], false, true )+"Forward";
            code.append( "\nopen class "+classSuffix+"Forward: "+superProtocol+(isEnum ? "" : ", "+classSuffix)+" {\n\n" );
            code.append( "    private static var "+classCacheVar+": jclass?\n\n" );

            	findInterfaceMethods( clazz );

            	fieldsSeen = new HashMap<String,Boolean>();
            	generateFields( fieldsSeen, false, clazz );

            boolean subinterface = clazz.getInterfaces().length == 1 && clazz.getDeclaredMethods().length == 0;
            if ( !subinterface || isEnum ) {
            		isEnum = false;
                generateMethods( clazz.getMethods(), false, fieldsSeen, classSuffix+"Forward", false );
                addAnyMethodsDeclaredInProtocolsButNotDefined( false, fieldsSeen, classSuffix+"Forward" );
            }

            code.append( "}\n\n" );
        }

        if ( isInterface && supportsProxyCallback( clazz ) || isAdapter() || !responsibles.isEmpty() )
            generateCallbackBase( fieldsSeen, responsibles.toArray( new java.lang.reflect.Method[ responsibles.size() ] ) );

        return true;
    }

    void save() throws IOException {
        String Sources = swiftSourceRoot != null ? swiftSourceRoot+"/" :
                pathToWriteSource + currentFramework + "/Sources/";
        new File( Sources ).mkdirs();

        String source = Sources + classSuffix + ".swift";
        byte bytes[] = (frameworkImports+code.toString()).getBytes("UTF-8");
        if ( bytes.length == new File( source ).length() && java.util.Arrays.equals( bytes, existing( source )) )
            return;

        print( "Saving: "+source);
        FileOutputStream out = new FileOutputStream( source );
        out.write( bytes );
        out.close();
        filesWritten++;
    }

    byte [] existing( String source ) throws IOException {
        File file = new File( source );
        if ( !file.exists() )
            return null;
        byte bytes[] = new byte[ (int) file.length() ];
        FileInputStream in = new FileInputStream( source );
        in.read( bytes );
        in.close();
        return bytes;
    }

    int idcount = 0;

    void generateFields( HashMap<String,Boolean> fieldsSeen, boolean isInterface, Class<?> clazz ) {
    		Field fields[] = clazz.getDeclaredFields();
    		
    		if ( sortMembers )
    	        java.util.Arrays.sort( fields, new Comparator<Field>() {
    				@Override
    				public int compare(Field o1, Field o2) {
    					int statics = compareStatic( o1.getModifiers(), o2.getModifiers() );
    					return statics != 0 ? statics : o1.getName().compareTo(o2.getName());
    				}
    			} );

        for (Field field : fields) {

            progress(field);
            code.append( "    /// "+field+"\n\n" );

            int mods = field.getModifiers();
            String fieldName = safe(field.getName());
            boolean isFinal = Modifier.isFinal(mods);
            boolean isStatic = Modifier.isStatic(mods);
            
            if ( skipBecause( "field", field, new boolean [] {
            		!Modifier.isPublic(mods) && !Modifier.isProtected(mods),
            		fieldOverride( field, superclazz) && isStatic,
            		fieldsSeen.containsKey(fieldName),
            		fieldName.equals(classSuffix),
            		interfaceMethods.containsKey(fieldName+"()"),
            		isStatic && (Modifier.isProtected(mods) || isInterface /*|| ////
                            superclazz == javax.swing.undo.AbstractUndoableEdit.class ||
                             superclazz != null && superclazz.getSuperclass() == javax.swing.undo.AbstractUndoableEdit.class ||
                             superclazz == javax.swing.plaf.basic.BasicComboBoxRenderer.class ||
                             superclazz == javax.swing.border.TitledBorder.class*/)
            } ) )
            		continue;

            fieldsSeen.put(fieldName, true);
            Class<?> fieldType = field.getType();
            try {
                if ( superclazz != null )
                    fieldType = superclazz.getField(field.getName()).getType();
            }
            catch ( NoSuchFieldException e ) {
            }

            boolean arrayType = crashesCompilerOnLinx(fieldType);
            if ( arrayType )
                code.append( "    #if !os(Linux)\n");

            String fieldIDVar = safe(field.getName())+"_FieldID";
            if ( ! isInterface )
                code.append( "    private static var "+fieldIDVar+": jfieldID?\n\n" );

            if ( !isStatic )
                fieldIDVar = classSuffix+"."+fieldIDVar;

            code.append( "    "+(fieldOverride(field,superclazz)&&!isLost?"override ":"")+(isInterface?"":visibility)+
                    (Modifier.isStatic(mods) ? "static " : "")+"var "+fieldName+": "+
                    swiftTypeFor(fieldType, true, false) );

            if ( isInterface )
                code.append((isStatic ? isFinal ?" { get }" : " { get set }" : "")+"\n");
            else {
                String fieldArgs = "fieldName: \""+field.getName()+"\", fieldType: \""+jniEncoding(field.getType())+"\", fieldCache: &"+fieldIDVar+
                        (isStatic?
                                ", className: \""+pathToClass+"\", classCache: &"+classCacheVar :
                                ", object: javaObject");

                code.append( " {\n" );
                code.append( "        get {\n" );
                code.append( "            let __value = JNIField.Get"+funcType( fieldType, mods )+"Field( "+fieldArgs+" )\n" );
                if ( isObjectType( fieldType ) )
                    code.append( "            defer { JNI.DeleteLocalRef( __value ) }\n" );
                code.append( "            return "+decoder( "__value", fieldType, "" )+"\n" );
                code.append( "        }\n" );
                if (!isFinal) {
                    code.append("        set(newValue) {\n");
                    code.append("            var __locals = [jobject]()\n");
                    code.append("            let __value = " + encoder("newValue", fieldType) + "\n");
                    code.append("            JNIField.Set" + funcType(fieldType, mods) + "Field( " + fieldArgs
                            + ", value: __value" + encodeSuffix(fieldType) + ", locals: &__locals )\n");
                    code.append("        }\n");
                }
                code.append( "    }\n" );
            }

            if ( arrayType )
                code.append( "    #endif\n");
            code.append( "\n" );
        }
    }

    void generateConstructors( String pathToClass, String classSuffix, boolean isListenerBase ) {
        HashMap<String,Boolean> constructorSeen = new HashMap<String,Boolean>();
      
        java.lang.reflect.Constructor<?> constructors[] = clazz.getDeclaredConstructors();

		if ( sortMembers )
			java.util.Arrays.sort( constructors, new Comparator<java.lang.reflect.Constructor<?>>() {
				@Override
				public int compare(java.lang.reflect.Constructor<?> o1, java.lang.reflect.Constructor<?> o2) {
					return argsFor( newConstructor(o1), true, true, null )
							.compareTo(argsFor( newConstructor(o2), true, true, null ));
				}
			} );

        for (java.lang.reflect.Constructor<?> _constructor : constructors) {
            Constructor<?> constructor = newConstructor( _constructor );
            int mods = constructor.getModifiers();

            progress(constructor);
            code.append( "    /// "+constructor+"\n\n" );

            String namedSignature = argsFor( constructor, true, true, null );
            if ( skipBecause( "init", constructor.constructor, new boolean [] {
            		!Modifier.isPublic(mods) && !Modifier.isProtected(mods),
            		constructorSeen.containsKey(namedSignature),
            		ambiguousInitialiser( constructor.toString() )
            } ) )
                continue;
            
            constructorSeen.put( namedSignature, true );

            String methodIDVar = "new_MethodID_"+(++idcount);
            java.lang.reflect.Constructor<?> overridden = constructorOverride(_constructor, superclazz);
            boolean canThrow = constructor.getExceptionTypes().length != 0 && constructor.getParameterCount() != 0 &&
                    (overridden == null || overridden.getExceptionTypes().length != 0);

            if (overridden != null)
                if ( argumentNamesDiffer( constructor, newConstructor( overridden ) ) )
                    overridden = null;

            boolean arrayType = false;
            for ( Parameter param : constructor.getParameters() )
                if ( crashesCompilerOnLinx( param.getType() ) )
                    arrayType = true;

            if ( arrayType )
                code.append( "    #if !os(Linux)\n");

            code.append("    private static var "+methodIDVar+": jmethodID?\n\n" );

            code.append( "    public "+/*(overridden != null && !isLost && clazz != String.class || isListenerBase ? "override " : "")+*/
                    "convenience init("+argsFor( constructor, false, true, null )+")"+(canThrow?" throws":"")+" {\n" );
            code.append( functionHeader( constructor.getParameters(), null, isListenerBase ? 1 : 0 ) );

            String signature = jniArgs(constructor, "", "");
            if ( isListenerBase ) {
                signature = jniArgs(constructor, "", "J");
                code.append("\n        self.init( javaObject: nil )\n");
                code.append("        __args["+constructor.getParameterCount()+"] = __local!.swiftValue()\n\n");
            }

            code.append( "        let __object = JNIMethod.NewObject( className: \""+pathToClass+"\", classCache: &"+
                    classSuffix+"."+classSuffix+"JNIClass, methodSig: \""+signature+"V\", methodCache: &"+classSuffix+"."+methodIDVar+
                    ", args: &__args, locals: &__locals )\n" );

            if ( canThrow )
                addThrowCode( constructor );

            if ( isListenerBase )
                code.append( "        self.javaObject = __object\n" );
            else
                code.append( "        self.init( javaObject: __object )\n" );
            code.append( "        JNI.DeleteLocalRef( __object )\n" );
            code.append( "    }\n" );

            String unnamedSigature = argsFor( constructor, true, false, null );
            if ( !constructorSeen.containsKey(unnamedSigature) && constructor.getParameters().length != 0 ) {

                code.append( "\n    public "+/*(unnamedOverride && !isLost && clazz != String.class || isListenerBase ? "override " : "")+*/
                        "convenience init("+argsFor( constructor, false, false, null )+")"+(canThrow?" throws":"")+" {\n" );

                code.append( "        "+(canThrow?"try ":"")+"self.init("+passthroughArguments(constructor,null, "_")+" )\n    }\n" );

                constructorSeen.put( unnamedSigature, true );
            }

            if ( arrayType )
                code.append( "    #endif\n");
            code.append( "\n" );
        }
    }

    boolean generateMethods( java.lang.reflect.Method methods[], boolean isProtocol, HashMap<String,Boolean> fieldsSeen, String outputClassName, boolean isListenerBase ) {

        HashMap<String,Boolean> methodsSeen = new HashMap<String,Boolean>();
        boolean hasSubclassResponsibility = false;
        
        if ( sortMembers )
            java.util.Arrays.sort( methods, new Comparator<java.lang.reflect.Method>() {
            		@Override
            		public int compare(java.lang.reflect.Method o1, java.lang.reflect.Method o2) {
    					int statics = compareStatic( o1.getModifiers(), o2.getModifiers() );
    					return statics != 0 ? statics : swiftSignatureFor( newMethod(o1), isProtocol, true, true, null)
    							.compareTo(swiftSignatureFor( newMethod(o2), isProtocol, true, true, null));
            		}
            } );

        for (java.lang.reflect.Method _method : methods ) {
            Method method = newMethod( _method );
            int mods = method.getModifiers();
            boolean isStatic = Modifier.isStatic(mods);

            progress(method);
            code.append( "    /// "+method+"\n\n" );

            if ( subclassResponsibilities.containsKey(method.toString()) )
                hasSubclassResponsibility = true;

            java.lang.reflect.Method overridden = funcOverride(method.method, superclazz);
            if ( overridden != null && Modifier.isPrivate(overridden.getModifiers()) )
                overridden = null;

            boolean unnamedOverride = overridden != null;
            if ( argumentNamesDiffer(method, newMethod(overridden)) )
                overridden = null;

            unnamedOverride = overridden != null;

            String methodName = method.getName();
            String methodString = method.toString();
            boolean fieldExists = fieldsSeen.containsKey(safe(methodName)) && method.getParameterCount() == 0;

            if ( skipBecause( "method", method.method, new boolean [] {
                    !Modifier.isPublic(mods) && !Modifier.isProtected(mods),
                    overridden != null && !isStatic && !isListenerBase && !isUnavailable(superclazz)
                        && !(isInterface && clazz.getInterfaces().length != 0
                        					&& isUnavailable(clazz.getInterfaces()[0])),
                    isInterface && (dontEnforceProtocol(clazz)
                    		|| awkwardMethodInProtocol(method) 
                    		|| isUnavailable(method.getReturnType())),
                    methodName.startsWith("lambda$"),
                    fieldExists
            } ) && !methodString.equals("public void javax.swing.text.PlainDocument.insertString(int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException")
                && !methodString.equals("public java.util.Set java.util.HashMap.keySet()") )
            		continue;
            
            String namedSignature = swiftSignatureFor( method, isProtocol, true, true, null);
            if ( methodsSeen.containsKey(namedSignature) )
                continue;
            methodsSeen.put(namedSignature, true );

            Class <?> returnType = method.getReturnType();
            boolean arrayType = crashesCompilerOnLinx( method );
            boolean canThrow = method.getExceptionTypes().length != 0;
            String unnamedSignature = swiftSignatureFor( method, isProtocol, true, false, null);
            boolean createsNameless = !methodsSeen.containsKey(unnamedSignature) && !fieldExists &&
                    !(isInterface && lostType(returnType)) && method.getParameterCount() != 0 && !isListenerBase;

            if ( arrayType )
                code.append( "    #if !os(Linux)\n");

            if ( isProtocol && isStatic )
                code.append("    //");

            String methodKey = methodKey(method);
            Method interfaceMethod = interfaceMethods.get(methodKey);
            interfaceMethods.remove(methodKey);

            boolean createBody = !isListenerBase || !isInterface;
            boolean notVoid = notVoid(returnType);

            if ( !(isProtocol && argumentsOfProtocolRenamed( clazz )) ) {
                String methodIDVar = methodName+"_MethodID_"+(++idcount), methodIDVarRef = methodIDVar;
                if ( !isStatic )
                    methodIDVarRef = outputClassName+"."+methodIDVarRef;

                if ( !isProtocol && (!isListenerBase || !isInterface) )
                    code.append("    private static var "+methodIDVar+": jmethodID?\n\n" );

                code.append("    " + (overridden != null && !isLost && !createBody && !(isListenerBase && isProtocol)
                        || isAdapter() && isListenerBase ? "override " : "")
                        + swiftSignatureFor(method, isProtocol, false, true, interfaceMethod));

                if ( isListenerBase )
                    code.append( " /**/" );

                if (isProtocol)
                    code.append("\n");
                else if (isEnum) {
                    code.append(" {\n        return "+(canThrow?"try ":"")+(isStatic ? classSuffix+"Forward." : "underlier()."));
                    code.append(safe(method.getName()) + "("+passthroughArguments(method, interfaceMethod, "")+" )\n    }\n");
                }
                else {
                    code.append(" {\n");

                    if ( createBody ) {
                        code.append( functionHeader( method.getParameters(), interfaceMethod, 0 ) );

                        code.append( "        " );
                        if ( notVoid )
                            code.append( "let __return = " );

                        String methodArgs =
                                (Modifier.isStatic(mods)?
                                        "className: \""+pathToClass+"\", classCache: &"+classCacheVar :
                                        "object: javaObject")+
                                ", methodName: \""+methodName+"\", methodSig: \""+jniSignature(method, "", "")+"\", methodCache: &"+methodIDVarRef;

                        code.append( "JNIMethod.Call"+funcType( returnType, mods )+"Method( "+methodArgs + ", args: &__args, locals: &__locals )\n" );

                        if ( isObjectType( returnType ) )
                            code.append( "        defer { JNI.DeleteLocalRef( __return ) }\n" );

                        if ( canThrow )
                            addThrowCode( method );

                        if ( notVoid )
                            code.append("        return "+decoder( "__return", returnType, "")+"\n");
                    }
                    else if ( notVoid(returnType) ) {
                        String passthrough = "";
                        for ( Parameter param : method.getParameters() )
                            passthrough += (passthrough==""?" ":", ")+safe(param.getName())+": _"+safe(param.getName());
                        code.append("        return "+ (clazz.isInterface() ? defaultReturn(returnType) :
                                "super."+methodName+"("+passthrough+" )")+"\n");
                    }

                    code.append("    }\n\n");
                }
            }

            if ( createsNameless && !isProtocol ) {

                if ( isProtocol && isStatic )
                    code.append("//");

                code.append("    " + (unnamedOverride && !isLost && !createBody || isAdapter() && isListenerBase ? "override " : "")
                        + swiftSignatureFor(method, isProtocol, false, false, interfaceMethod));

                if ( isListenerBase )
                    code.append( " /**/" );

                if (isProtocol)
                    code.append("\n");
                else {
                    code.append(" {\n");
                    code.append("        "+(notVoid?"return ":"") + (canThrow?"try ":"") +
                                safe(method.getName()) + "("+passthroughArguments(method, interfaceMethod, "_")+" )\n");
                    code.append("    }\n" );
                }
            }

            if ( arrayType )
                code.append( "    #endif\n");
            code.append( "\n" );

            methodsSeen.put( unnamedSignature, true );
        }

        return hasSubclassResponsibility;
    }

    void generateCallbackBase( HashMap<String,Boolean> fieldsSeen, java.lang.reflect.Method responsibles[] ) throws IOException {
        java.lang.reflect.Method methods[] = responsibles.length != 0 ? responsibles : clazz.getMethods();
        ArrayList<java.lang.reflect.Method> methodsCallingBack = new ArrayList<java.lang.reflect.Method>();

        if ( sortMembers )
            java.util.Arrays.sort( methods, new Comparator<java.lang.reflect.Method>() {
            		@Override
            		public int compare(java.lang.reflect.Method o1, java.lang.reflect.Method o2) {
    					int statics = compareStatic( o1.getModifiers(), o2.getModifiers() );
    					return statics != 0 ? statics : swiftSignatureFor( newMethod(o1), true, true, true, null)
    							.compareTo(swiftSignatureFor( newMethod(o2), true, true, true, null));
            		}
            } );

        for (int i = 0; i < methods.length; i++) {
            Method method = newMethod( methods[i] );
            if ( skipCallbackMethod( method ) )
                continue;
            if ( crashesCompilerOnLinx( method ) )
                code.append("#if !os(Linux)\n");

            methodsCallingBack.add( method.method );

            code.append("private typealias " + jniName(method, i) + "_type = @convention(c) "
                    + jniDecl(method, null) + "\n\n");

            code.append("private func " + jniName(method, i) + jniDecl(method, "_ ") + " {\n");
            String passthrough = "";
            for (Parameter param : method.getParameters())
                passthrough += (passthrough == ""?" ":", ") + safe(param.getName())+": " +/////
                        decoder( safe(param.getName()), param.getType(), ", consume: false" );//+(!p.getType().isPrimitive()?"!":"");
            String call = classSuffix + "Local_.swiftObject( jniEnv: __env, javaObject: __this, swiftObject: __swiftObject )."
                    + method.getName() + "(" + passthrough + " )";
            boolean rethrow = method.getExceptionTypes().length != 0;
            String indent = "";
            if ( rethrow ) {
                call = "try " + call;
                code.append("    do {\n");
                indent = "    ";
            }

            Class<?> returnType = method.getReturnType();
            boolean notVoid = notVoid(returnType);
            if ( notVoid )
                call = "let __return = "+call;
            code.append(indent+"    "+call+"\n");
            if ( notVoid ) {
                code.append(indent+"    var __locals = [jobject]()\n");
                code.append(indent+"    return JNI.check( "+(
                        encoder("__return", returnType) + encodeSuffix(returnType))+", &__locals, removeLast: true )\n");
            }

            if ( rethrow ) {
                    String dflt = returnType.getName().equals("boolean") ? "0" : defaultReturn(returnType);
                    code.append("    }\n");
                    code.append("    catch let exception as Throwable {\n");
                    code.append("        _ = exception.withJavaObject { JNI.api.Throw( JNI.env, $0 ) }\n");
                    if ( notVoid )
                        code.append("        return "+dflt+"\n");
                    code.append("    }\n    catch {\n");
                    code.append("        _ = Exception(\"Unknown exception\").withJavaObject { JNI.api.Throw( JNI.env, $0 ) }\n");
                    if ( notVoid )
                        code.append("        return "+dflt+"\n");
                    code.append("    }\n");
            }

            code.append("}\n");
            if ( crashesCompilerOnLinx( method ) )
                code.append("#endif\n");
            code.append("\n");
        }

        code.append("fileprivate class " + classSuffix + "Local_: JNI"+(isInterface?"Local":"Object")+
                "Proxy<"+classSuffix+(isInterface?", Any":"")+"> {\n\n");

        code.append("    fileprivate static let _proxyClass: jclass = {\n");
        code.append("        var natives = [JNINativeMethod]()\n\n");

        for (int i = 0; i < methods.length; i++) {
            Method method = newMethod( methods[i] );
            if ( skipCallbackMethod( method ) )
                continue;
            if ( crashesCompilerOnLinx( method ) )
                code.append("        #if !os(Linux)\n");

            String jniName = jniName(method, i);
            code.append("        let " + jniName + "_thunk: " + jniName + "_type = " + jniName + "\n");
            code.append("        natives.append( JNINativeMethod( name: strdup(\"__" + method.getName() + "\")"
                    + ", signature: strdup(\"" + jniSignature(method, "J", "") + "\"), fnPtr: unsafeBitCast( " + jniName
                    + "_thunk, to: UnsafeMutableRawPointer.self ) ) )\n");

            if ( crashesCompilerOnLinx( method ) )
                code.append("        #endif\n");
            code.append("\n");
        }

        code.append("        natives.append( JNINativeMethod( name: strdup(\"__finalize\"), signature: strdup(\"(J)V\")"
                + ", fnPtr: unsafeBitCast( JNIReleasableProxy__finalize_thunk, to: UnsafeMutableRawPointer.self ) ) )\n\n");

        String proxyClass = "org/swiftjava/" + currentFramework + "/" + classSuffix + "Proxy";
        code.append("        let clazz = JNI.FindClass( proxyClassName() )\n");

        code.append("        withUnsafePointer(to: &natives[0]) {\n");
        code.append("            nativesPtr in\n");
        code.append("            if JNI.api.RegisterNatives( JNI.env, clazz, nativesPtr, jint(natives.count) ) != jint(JNI_OK) {\n");
        code.append("                JNI.report( \"Unable to register java natives\" )\n");
        code.append("            }\n");
        code.append("        }\n\n");
        code.append("        defer { JNI.DeleteLocalRef( clazz ) }\n");
        code.append("        return JNI.api.NewGlobalRef( JNI.env, clazz )!\n");
        code.append("    }()\n\n");

        code.append("    override open class func proxyClassName() -> String { return \"" + proxyClass + "\" }\n");
        code.append("    override open class func proxyClass() -> jclass? { return _proxyClass }\n\n}\n\n");

        if ( isInterface ) {
            code.append("extension "+classSuffix+" {\n\n");
            code.append("    public func localJavaObject( _ locals: UnsafeMutablePointer<[jobject]> ) -> jobject? {\n");
            code.append("        return "+classSuffix+"Local_( owned: self, proto: self ).localJavaObject( locals )\n");
            code.append("    }\n\n}\n\n");
        }

        code.append("open class " + classSuffix + "Base: " + classSuffix + " {\n\n");

        if ( !isInterface ) {
            code.append("    private static var "+classSuffix+"BaseJNIClass: jclass? = "+classSuffix+"Local_.proxyClass()\n\n" );
            code.append("    private lazy var __local: "+classSuffix+"Local_? = "+classSuffix+"Local_( owned: self, proto: self )\n\n");

            code.append("    override open func clearLocal() {\n        __local = nil\n    }\n\n");

            code.append("    open func inherit( _ parent: JNIObjectProtocol ) {\n");
            code.append("        parent.withJavaObject {\n");
            code.append("            self.javaObject = $0\n");
            code.append("            self.__local?.takeOwnership(javaObject: $0)\n");
            code.append("        }\n");
            code.append("    }\n\n");
        }
        else
            code.append("    public init() {}\n\n");

        if ( !isInterface ) {
            generateConstructors( proxyClass, classSuffix+"Base", true );
            methods = methodsCallingBack.toArray( new java.lang.reflect.Method[ methodsCallingBack.size() ] );
        }
        ////else
        if ( isInterface || clazz == javax.swing.text.PlainDocument.class )
            generateMethods(methodsCallingBack.toArray( new java.lang.reflect.Method[ methodsCallingBack.size() ] ), false, fieldsSeen, classSuffix + "Base", true);

        code.append("}\n");

        generateJavaProxyStub( methods );
    }

    void generateJavaProxyStub( java.lang.reflect.Method methods[] ) throws IOException {
        StringBuilder java = new StringBuilder();

        java.append("\n/// generated by: "+invocation+" ///\n");
        java.append("\n/// "+clazz+" ///\n\n");

        java.append("package "+organisation+currentFramework+";\n\n"+
                    "@SuppressWarnings(\"JniMissingFunction\")\n"+
                    "public class "+classSuffix+ "Proxy "+
                (isInterface?"implements ":"extends ")+className.replace('$', '.')+" {\n\n");

        java.append("    // address of proxy object\n");
        java.append("    long __swiftObject;\n\n");

        if ( isInterface ) {
            java.append("    "+classSuffix+"Proxy( long __swiftObject ) {\n" );
            java.append("        this.__swiftObject = __swiftObject;\n    }\n\n" );
        }
        else {
            for ( java.lang.reflect.Constructor<?> _constructor : clazz.getDeclaredConstructors() ) {
                Constructor<?> constructor = newConstructor( _constructor );
                java.append("    /// "+constructor+"\n\n");
                int mods = constructor.getModifiers();
                if ( !Modifier.isPublic(mods) && !Modifier.isProtected(mods) )
                    continue;

                String args = longJavaArgs(constructor);
                java.append("    "+classSuffix+"Proxy("+args+(args==""?" ":", ")+"long __swiftObject ) {\n" );

                args = "";
                for (Parameter param : constructor.getParameters())
                    args += (args == ""?" ":", ")+safe(param.getName());
                java.append("        super("+args+" );\n");
                java.append("        this.__swiftObject = __swiftObject;\n    }\n\n");
            }
        }

        for (int i = 0; i < methods.length; i++) {
            Method method = newMethod( methods[i] );
            java.append("    /// "+method+"\n\n");
            String methodName = safe(method.getName());
            Class<?> returnType = method.getReturnType();
//            if ( skipCallbackMethod( method ) )
//                continue;

            String args = longJavaArgs(method);
            String argsSwift = " long __swiftObject"+(args==""?" ":",")+args;
            String returnTypeName = longJavaType( returnType );
            java.append("    public native "+returnTypeName+" __"+methodName+"("+argsSwift+");\n\n");

            boolean notVoid = notVoid(returnType);
            String retrn = notVoid ? "return " : "";
            String assign = notVoid ? returnTypeName + " __return = " : "";

            String enteredName = "entered_"+methodName+"_"+i;
            if ( !isInterface )
                java.append("    boolean "+enteredName+";\n\n");

            String throwz = "";
            for ( Class<?> type : method.getExceptionTypes() )
                throwz += (throwz==""?" throws ":", ")+type.getName();
            java.append("    public "+returnTypeName+" "+methodName+"("+args+")"+throwz+" {\n");

            args = "";
            for (Parameter param : method.getParameters())
                args += (args == ""?" ":", ")+safe(param.getName());
            argsSwift = " __swiftObject"+(args==""?" ":",")+args;

            if ( !isInterface && !Modifier.isAbstract(method.getModifiers()) ) {
                java.append("        if ( !"+enteredName+" ) {\n");
                java.append("            "+enteredName+" = true;\n");
                java.append("            "+assign+"__"+methodName+"("+argsSwift+");\n");
                java.append("            "+enteredName+" = false;\n");
                if ( notVoid )
                    java.append("            return __return;\n");
                java.append("        }\n");
                java.append("        else\n");
                java.append("            "+retrn+"super."+method.getName()+"("+args+" );\n");
            }
            else
                java.append("        "+retrn+"__"+method.getName()+"("+argsSwift+" );\n");
            java.append("    }\n\n");
        }

        java.append(
                "    public native void __finalize( long __swiftObject );\n\n" +
                "    public void finalize() {\n" +
                "        __finalize( __swiftObject );\n" +
                "    }\n\n}\n");

        String dest = (javaSourceRoot != null ? javaSourceRoot+"/" :
                pathToWriteSource+"src/") + proxySourcePath+currentFramework;
        new File( dest ).mkdirs();

        String javaSource = dest + "/" + classSuffix+"Proxy.java";
        FileOutputStream out = new FileOutputStream( javaSource );
        out.write(java.toString().getBytes("UTF-8") );
        out.close();

        print("Created: "+javaSource);
    }

    void generateInterfaceFields( HashMap<String,Boolean> fieldsSeen, Class<?> intrface ) {
        generateFields( fieldsSeen, isInterface, intrface );
        for ( Class<?> secondLevel : intrface.getInterfaces() )
            generateInterfaceFields( fieldsSeen, secondLevel );
    }

    String longJavaType( Class<?> type ) {
        return type.isArray() ? longJavaType( type.getComponentType() )+"[]" : type.getName().replace('$', '.');
    }

    String longJavaArgs( Executable executable ) {
        String args = "";
        for (Parameter param : executable.getParameters()) {
            String javaType = longJavaType( param.getType() );
            args += (args == "" ? " " : ", ")+javaType+" "+safe(param.getName());
        }
        return args == "" ? "" : args + " ";
    }
    
    int compareStatic( int m1, int m2 ) {
    		return Modifier.isStatic( m1 ) && !Modifier.isStatic( m2 ) ? -1 :
    			Modifier.isStatic( m1 ) == Modifier.isStatic( m2 ) ? 0 : 1;
    }

    boolean interfacesChangingReturnTypeInSubclass( Class<?> intrface ) {
        return intrface == java.util.SortedSet.class
            || intrface == java.util.Iterator.class
            || intrface == java.util.concurrent.BlockingQueue.class
            || intrface == java.util.NavigableSet.class
            || intrface == java.util.concurrent.locks.ReadWriteLock.class
            || classPrefix(intrface.getName()).equals("java_util") && intrface.getName().endsWith("Map");
    }

    boolean dontEnforceProtocol( Class<?> clazz ) {
        return clazz == java.lang.Iterable.class;
    }

    boolean argumentsOfProtocolRenamed( Class<?> clazz ) {
        return false;
    }

    boolean awkwardMethodInProtocol( Method method ) {
        return false;
    }

   boolean ambiguousInitialiser( String signature ) {
       return false;
//        return signature.equals("public java.awt.Dialog(java.awt.Window)")
//                || signature.equals("public java.awt.Window(java.awt.Frame)") //// crashes compiler on Linux
//                || signature.equals("public javax.swing.JDialog(java.awt.Window)")
//                || signature.equals("public javax.swing.JWindow(java.awt.Window)")
//                || signature.equals("public javax.swing.JDialog(java.awt.Window,java.lang.String)");
    }

    boolean redundantConformance(Class<?> prospectiveInterface, Class<?> interfaces[]) {
        boolean prospectiveUnavailable = isUnavailable(prospectiveInterface);
        for (Class<?> intrface : interfaces)
            if ( prospectiveInterface == intrface || prospectiveUnavailable && isUnavailable(intrface) ||
                    redundantConformance(prospectiveInterface, intrface.getInterfaces()) )
                return true;
        return false;
    }

    boolean skipCallbackMethod( Method method ) {
        return awkwardMethodInProtocol( method ) || Modifier.isFinal(method.getModifiers())
                || !isInterface && !subclassResponsibilities.containsKey(method.toString()) && !isAdapter()
                || isUnavailable(method.getReturnType()) || Modifier.isStatic(method.getModifiers());
    }

    HashMap<String,Method> interfaceMethods = new HashMap<String,Method>();

    void findInterfaceMethods( Class<?> clazz ) {
        for ( Class<?> intrface : clazz.getInterfaces() ) {
            for ( java.lang.reflect.Method method : intrface.getMethods() )
                interfaceMethods.put( methodKey( newMethod( method ) ), newMethod( method ) );
            findInterfaceMethods( intrface );
        }
    }

    String methodKey( Method method ) {
        return method.getName()+jniArgs(method, "", "");
    }

    void addAnyMethodsDeclaredInProtocolsButNotDefined( boolean isProtocol, HashMap<String,Boolean> fieldsSeen, String outputClassName ) {
        java.util.Collection<Method> inProtocolsButNotDeclared = interfaceMethods.values();
        if ( inProtocolsButNotDeclared.size() != 0 ) {
            code.append( "    /// In declared protocol but not defined.. ///\n\n" );
            Method missingMethods0[] = inProtocolsButNotDeclared.toArray( new Method[inProtocolsButNotDeclared.size()] );
            java.lang.reflect.Method missingMethods[] = new java.lang.reflect.Method[inProtocolsButNotDeclared.size()];
            for ( int i=0 ; i< missingMethods0.length ; i++ )
                missingMethods[i] = missingMethods0[i].method;
            generateMethods( missingMethods, isProtocol, fieldsSeen, outputClassName, false );
        }
    }

    String functionHeader( Parameter parameters[], Method interfaceMethod, int extra ) {
        StringBuilder setup = new StringBuilder();
        setup.append( "        var __locals = [jobject]()\n" );
        setup.append( "        var __args = [jvalue]( repeating: jvalue(), count: "+Math.max(1,parameters.length+extra)+" )\n" );
        for ( int i=0 ; i<parameters.length ; i++ ) {
            String name = interfaceMethod!=null ? interfaceMethod.getParameters()[i].getName() : parameters[i].getName();
            setup.append( "        __args["+i+"] = "+encoder( safe(name), parameters[i].getType() )+"\n" );
        }
        return setup.toString();
    }

    void addThrowCode( Executable executable ) {
        code.append( "        if let throwable = JNI.ExceptionCheck() {\n" );
        code.append( "            defer { JNI.DeleteLocalRef( throwable ) }\n" );
        code.append( "            throw "+swiftTypeFor(executable.getExceptionTypes()[0], false, false)+"( javaObject: throwable )\n        }\n" );
    }

    String defaultReturn( Class<?> returnType ) {
            return returnType.isPrimitive() ? returnType.getName() == "boolean" ? "false" : "0" : "nil";
    }

    String funcType( Class<?> type, int mods ) {
        String typeName = funcNames.get( type.getName() );
        if ( typeName == null )
            typeName = "Object";
        return (Modifier.isStatic(mods)?"Static":"")+typeName;
    }

    String jniArgs( Executable executable, String prefix, String suffix ) {
        String sig = "("+prefix;
        for ( Parameter param : executable.getParameters() )
            sig += jniEncoding(param.getType());
        return sig+suffix+")";
    }

    String jniSignature( Method method, String prefix, String suffix ) {
        return jniArgs( method, prefix, suffix )+jniEncoding(method.getReturnType());
    }

    String jniEncoding( Class<?> clazz ) {
        String name = clazz.getName();
        String type = jvalueFields.get(name);
        return type != null ? type.toUpperCase() : clazz.isArray() ? "[" + jniEncoding(clazz.getComponentType()) : "L"+name.replace('.', '/')+";";
    }

    String jniName( Method method, int i ) {
        return classSuffix+"_"+safe(method.getName())+"_"+i;
    }

    String jniDecl( Method method, String unnamed ) {
        String decl = "";
        for ( Parameter param : method.getParameters() )
            decl += ", "+(unnamed==null?"_":unnamed+safe(param.getName()))+": "+jniType(param.getType());
        return "( "+(unnamed==null?"_":unnamed+"__env")+": UnsafeMutablePointer<JNIEnv?>, "+
                    (unnamed==null?"_":unnamed+"__this")+": jobject?, "+
                    (unnamed==null?"_":unnamed+"__swiftObject")+": jlong"+decl+" )"+
                    " -> "+(notVoid(method.getReturnType()) ? jniType(method.getReturnType()) : "()");
    }

    String jniType( Class<?> type ) {
        return type.isPrimitive() ? "j"+type.getName() : "jobject?";
    }

    boolean argumentNamesDiffer( Executable executable, Executable overridden ) {
        if ( overridden == null )
            return true; ////
        for (int i = 0; i < executable.getParameterCount(); i++)
            if (!executable.getParameters()[i].getName()
                    .equals(overridden.getParameters()[i].getName()))
                return true;
        return false;
    }

    String passthroughArguments( Executable executable, Method interfaceMethod, String underscore ) {
        String passthrough = "";
        Parameter parameters[] = executable.getParameters();
        for ( int i=0 ; i<parameters.length ; i++ ) {
            String name = safe(interfaceMethod!=null ? interfaceMethod.getParameters()[i].getName() : parameters[i].getName());
            passthrough += (passthrough == "" ? " " : ", ")+name+": "+underscore+name;
        }
        return passthrough;
    }
    
    boolean skipBecause( String category, java.lang.reflect.Member member, boolean reasons[] ) {
    		if ( Modifier.isPrivate(member.getModifiers()) )
    			return true;
    		for ( boolean reason : reasons )
    			if ( reason ) {
    				String out = "    // Skipping " + category + ": ";
    	    			for ( boolean value : reasons )
    	    				out += value + " ";
    	    			code.append( out + "\n\n" );
    	    			return true;
    			}
    		return false;
    }

    boolean crashesCompilerOnLinx( Method method ) {
        boolean arrayType = crashesCompilerOnLinx( method.getReturnType() );
        for ( Parameter param : method.getParameters() )
            if ( crashesCompilerOnLinx( param.getType() ) )
                arrayType = true;
        return arrayType;
    }

    boolean crashesCompilerOnLinx( Class<?> type ) {
        return false;//type.isArray() && !type.getComponentType().isPrimitive();
    }

    String encodeSuffix( Class<?> type ) {
        String jvalueField = jvalueFields.get( type.getName() );
        if ( jvalueField == null )
            jvalueField = "l";
        return "."+jvalueField;
    }

    String encoder( String var, Class<?> type ) {
        if ( type == java.lang.Float.class )
            return "JNIType.toJavaFloat( value: "+var+", locals: &__locals )";
        String typeName = type.getName();
        if ( type.isPrimitive() ) {
            if ( typeName.equals("boolean") )
        			var = "jboolean("+var+" ? JNI_TRUE : JNI_FALSE)";
            if ( typeName.equals("int") )
        			var = "jint("+var+")";
            return "jvalue( "+jvalueFields.get( typeName )+": "+var+" )";
        }
        return "JNIType.toJava( value: " + var + (java.util.Map.class.isAssignableFrom(type) ?
        		", mapClass: \""+typeName.replace(".", "/")+"\"" : "") + ", locals: &__locals )";
    }

    String decoder( String var, Class<?> type, String consume ) {
        if ( type == java.lang.Float.class )
            return "JNIType.toSwiftFloat( from: "+var+consume+" )";
        if ( type.isPrimitive() ) {
            if ( type.getName().equals("boolean") )
        			return var+" != jboolean(JNI_FALSE)";
            if ( type.getName().equals("int") )
        			return "Int("+var+")";
        		return var;
        }
        String swiftType = swiftTypeFor(type, false, false, true, false, true);
        return isObjectType( type ) ?
        		var + " != nil ? " + swiftType + "( javaObject: "+var+" ) : nil" :
            "JNIType.toSwift( type: "+swiftType+".self, from: "+var+consume+" )";
    }

    boolean isObjectType( Class<?> type ) {
        return !type.isPrimitive() && !type.isArray() && !java.util.Map.class.isAssignableFrom(type);
    }
    
    boolean isEnum( Class<?> type ) {
    		return convertEnums && type.isEnum() && !isUnavailable( type );
    }

    String argsFor( Executable e, boolean anon, boolean named, Method interfaceMethod ) {
        String args = "";
        for ( int i=0 ; i<e.getParameterCount() ; i++ ) {
            Parameter param = e.getParameters()[i];
            String name = interfaceMethod != null ? interfaceMethod.getParameters()[i].getName() : param.getName();
            args += (args == "" ? " " : ", ") + (named?"":"_ _")+
                    (anon?"arg":safe(name)) + ": " +
                    swiftTypeFor( param.getType(), true, anon, true, true, false );
        }
        return args == "" ? "" : args+" ";
    }

    boolean notVoid( Class<?> returnType ) {
        return !returnType.getName().equals("void");
    }

    String safe( String name ) {
       return (swiftKeywords.containsKey(name)?"_":"")+name.replace('$','_');
    }

    String swiftSignatureFor( Method method, boolean isProtocol, boolean anon, boolean named, Method interfaceMethod ) {
        String ret = "";
        if ( method.getExceptionTypes().length != 0 ) {
            String exceptions = "";
            for ( Class<?> exception : method.getExceptionTypes() )
                exceptions += (exceptions==""?"":", ") + exception.getName();
            ret += " throws /* "+exceptions+" */";
        }
        Class<?> returnType = method.getReturnType();
        if ( notVoid( returnType ) && !anon )
            ret += " -> " + swiftTypeFor( returnType, true, false );
        boolean isStatic = Modifier.isStatic(method.getModifiers());
        return (isProtocol ? "" : isEnum ? "public " : visibility)+(isStatic ? isEnum ? "static " : "class ": "")+
                "func "+safe(method.getName())+"("+argsFor(  method, anon, named, interfaceMethod )+")" + ret;
    }

    String swiftTypeFor( Class<?> type, boolean isReturn, boolean anon ) {
        return swiftTypeFor( type, isReturn, anon, true, false, false );
    }

    String swiftTypeFor( Class<?> type, boolean isReturn, boolean anon, boolean prefix, boolean isArg, boolean addForward ) {
        String decl = swiftTypes.get(type.getName());
        if ( decl == null ) {
            if(type.isArray()) {
                String left = "[", right = "]";
                Class<?> elementType = type.getComponentType();

                while ( elementType.isArray() ) {
                    elementType = elementType.getComponentType();
                    left += "[";
                    right += "]";
                }

                String nativeType = arrayTypes.get( elementType.getName() );
                if ( nativeType != null )
                    decl = nativeType;
                else
                    decl = classTypeFor( elementType, anon, false );

                if ( addForward && elementType.isInterface() )
                        decl += "Forward";

                decl = (isReturn || true ? "" : "inout ") + left + decl + right;
            }
            else if ( java.util.Map.class.isAssignableFrom(type) ) {
                    try {
                        java.lang.reflect.Method method = type.getDeclaredMethod("valueClass");
                        Class<?> vtype = (Class<?>) method.invoke(type);
                        decl = "[String:"+swiftTypeFor(vtype, false, anon, true, false, addForward)+"]";
                    }
                    catch (Exception e) {
                        decl = classTypeFor( type, anon, prefix );
                        if ( addForward && type.isInterface() )
                                decl += "Forward";
                    }
                }
            else {
                decl = classTypeFor( type, anon, prefix );
                if ( addForward && type.isInterface() )
                        decl += "Forward";
            }
        }

        return decl + (isReturn && !type.isPrimitive() ?
        		isArg && type != java.lang.Float.class || !returnImplicitlyUnwrapped ? "?" : "!" : "");
    }

    String classTypeFor( Class<?> type, boolean anon, boolean prefix ) {
        String typeName = type.getName();
        String className = classSuffix( typeName );
        String frameworkPrefix = classPrefix( typeName );

        crossReference( currentFramework, frameworkPrefix );

        if ( lostType( type ) || excludeFromCodeGeneration( type ) ) {
            UnavailableReferences++;
            return (anon?"":"/* "+type+" */ ") + Unavailable + (type.isEnum() ? "Enum" : type.isInterface() ? "Protocol" : "Object");
        }

        if ( !frameworkPrefix.equals(currentFramework) && !type.isPrimitive() ) {
            if ( !referencedFrameworks.containsKey( frameworkPrefix ) ) {
                    if ( !frameworkPrefix.equals("java_swift") )
                        frameworkImports += "import "+frameworkPrefix+"\n";
                referencedFrameworks.put(frameworkPrefix, true);
            }
            if ( prefix )
                className = frameworkPrefix + "." + className;
        }
        return className;
    }

    boolean lostType( Class<?> type ) {
        return !type.isArray() && forwardReference( currentFramework, classPrefix( type.getName() ) );
    }

    static int prefixLength( String className ) {
        int firstDot = className.indexOf( '.' );
        if ( firstDot == -1 )
            return -1;
        int secondDot = className.indexOf( '.', firstDot+1 );
        return secondDot == -1 ? firstDot : secondDot;
    }

    static String classPrefix( String className ) {
        int  prefixLength = prefixLength( className );
        if ( prefixLength == -1 )
            return "java_lang";
        if ( keyClasses.containsKey(className) )
            return "java_swift";
        return className.substring( 0, prefixLength ).replace( '.', '_' );
    }

    static HashMap<String,String> allocatedSuffies = new HashMap<String,String>();

    static String classSuffix( String className ) {
        int suffixIndex = className.lastIndexOf( '.' )+1;
        String classSuffix = className.substring( suffixIndex ).replace('$', '_');

        if ( swiftReserved.containsKey(className) )
            classSuffix = "Java" + classSuffix;

        String allocated = allocatedSuffies.get( classSuffix );
        if ( allocated != null && !allocated.equals(className) ) {
            int  prefixLength = prefixLength( className );
            String other = className.substring( prefixLength+1, suffixIndex );
            return other.replace('.', '_') + classSuffix;
        }

        if ( allocated == null )
            allocatedSuffies.put( classSuffix, className );
        return classSuffix;
    }

    static HashMap<String,HashMap<String,Integer>> crossReferences = new HashMap<String,HashMap<String,Integer>>();
    static HashMap<String,Boolean> knownAdditionalFrameworks = new HashMap<String,Boolean>();
    static HashMap<String,Integer> frameworkLevels = new HashMap<String,Integer>();
    static ArrayList<String> additionalFrameworks = new ArrayList<String>();

    static boolean forwardReference( String currentFramework, String framework ) {
        Integer level = frameworkLevels.get( framework );
        if ( level == null )
            return true;
        return level > frameworkLevels.get( currentFramework );
    }


    static void crossReference( String from, String to ) {
        if ( !crossReferences.containsKey( from ) )
            crossReferences.put( from, new HashMap<String,Integer>() );
        if ( !crossReferences.get( from ).containsKey( to ) )
            crossReferences.get( from ).put( to, 0 );
        crossReferences.get(from).put(to,crossReferences.get(from).get(to)+1);
    }

    static int references( String from, String to ) {
        if ( !crossReferences.containsKey(from) || !crossReferences.get(from).containsKey(to) )
            return 0;
        return crossReferences.get(from).get(to);
    }

    boolean fieldOverride(Field f, Class<?> superclazz) {
        if (superclazz == null)
            return false;
        if (f.getName().equals("serialVersionUID"))
            return true;
        try {
            return superclazz.getField(f.getName()) != null;
        }
        catch ( NoSuchFieldException e ) {
            return false;
        }
    }

    java.lang.reflect.Constructor<?> constructorOverride(java.lang.reflect.Constructor<?> c, Class<?> superclazz) {
        if (superclazz == null)
            return null;
        Class<?> types[] = c.getParameterTypes();

        try {
            switch (types.length) {
            case 0:
                return superclazz.getConstructor();
            case 1:
                return superclazz.getConstructor(types[0]);
            case 2:
                return superclazz.getConstructor(types[0], types[1]);
            case 3:
                return superclazz.getConstructor(types[0], types[1], types[2]);
            case 4:
                return superclazz.getConstructor(types[0], types[1], types[2], types[3]);
            case 5:
                return superclazz.getConstructor(types[0], types[1], types[2], types[3], types[4]);
            case 6:
                return superclazz.getConstructor(types[0], types[1], types[2], types[3], types[4], types[5]);
            case 7:
                return superclazz.getConstructor(types[0], types[1], types[2], types[3], types[4], types[5],types[6]);
            case 8:
                return superclazz.getConstructor(types[0], types[1], types[2], types[3], types[4], types[5], types[6],types[7]);
            case 9:
                return superclazz.getConstructor(types[0], types[1], types[2], types[3], types[4], types[5], types[6],types[7], types[8]);
            case 10:
                return superclazz.getConstructor(types[0], types[1], types[2], types[3], types[4], types[5], types[6],types[7], types[8], types[9]);
            default:
                return null;
            }
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    java.lang.reflect.Method funcOverride(java.lang.reflect.Method m, Class<?> superclazz) {
        if (superclazz == null)
            return null;
        String name = m.getName();
        Class<?> types[] = m.getParameterTypes();
        if ( types.length == 0 && name.equals("registerNatives") )
            return null;////
        try {
            switch (types.length) {
            case 0:
                return superclazz.getMethod(name);
            case 1:
                return superclazz.getMethod(name, types[0]);
            case 2:
                return superclazz.getMethod(name, types[0], types[1]);
            case 3:
                return superclazz.getMethod(name, types[0], types[1], types[2]);
            case 4:
                return superclazz.getMethod(name, types[0], types[1], types[2], types[3]);
            case 5:
                return superclazz.getMethod(name, types[0], types[1], types[2], types[3], types[4]);
            case 6:
                return superclazz.getMethod(name, types[0], types[1], types[2], types[3], types[4], types[5]);
            case 7:
                return superclazz.getMethod(name, types[0], types[1], types[2], types[3], types[4], types[5],types[6]);
            case 8:
                return superclazz.getMethod(name, types[0], types[1], types[2], types[3], types[4], types[5], types[6],types[7]);
            case 9:
                return superclazz.getMethod(name, types[0], types[1], types[2], types[3], types[4], types[5], types[6],types[7], types[8]);
            case 10:
                return superclazz.getMethod(name, types[0], types[1], types[2], types[3], types[4], types[5], types[6],types[7], types[8], types[9]);
            default:
                return null;
            }
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    // for compatibility with JDK < 1.8

    static class Parameter {
        Executable executable;
        int number;

        public Class<?> getType() {
            return executable.constructor != null ?
                    executable.constructor.getParameterTypes()[number] :
                    executable.method.getParameterTypes()[number];
        }

        public String getName() {
            return executable.parameterNames != null ?
                    executable.parameterNames[number] : "arg"+number;
        }
    }

    static class Executable {
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method;
        Parameter parameters[];
        String parameterNames[];

        public int getModifiers() {
            return constructor != null ?
                    constructor.getModifiers() :
                    method.getModifiers();
        }

        public int getParameterCount() {
            return constructor != null ?
                    constructor.getParameterTypes().length :
                    method.getParameterTypes().length;
        }

        public Parameter [] getParameters() {
            if ( parameters == null ) {
                int size = getParameterCount();
                parameters = new Parameter[size];
                if ( size != 0 ) {
                    for ( int i=0 ; i<size ; i++ ) {
                        Parameter next = parameters[i] = new Parameter();
                        next.executable = this;
                        next.number = i;
                    }

                    try {
                        Object executable = constructor != null ? constructor : method;
                        Class<?> executableClass = executable.getClass();
                        java.lang.reflect.Method paramsMethod = executableClass.getMethod("getParameters", new Class<?>[] {});

                        Object realParameters[] = (Object []) paramsMethod.invoke(executable, new Object[] {});
                        Class<?> parametersClass = realParameters[0].getClass();
                        java.lang.reflect.Method nameMethod = parametersClass.getMethod("getName", new Class<?>[] {});

                        parameterNames = new String[size];
                        for ( int i=0 ; i<size ; i++ )
                            parameterNames[i] = (String) nameMethod.invoke(realParameters[i], new Object[] {});
                    }
                    catch ( Exception e ) {
                    }
                }
            }
            return parameters;
        }

        public Class<?> [] getExceptionTypes() {
            return constructor != null ?
                    constructor.getExceptionTypes() :
                    method.getExceptionTypes();
        }

    }

    static class Constructor<aClass> extends Executable {
        public String toString() {
            return constructor.toString();
        }
    }

    @SuppressWarnings("rawtypes")
    static Constructor<?> newConstructor( java.lang.reflect.Constructor<?> constructor ) {
        if ( constructor == null )
            return null;
        Constructor<?> proxy = new Constructor();
        proxy.constructor = constructor;
        return proxy;
    }

    static class Method extends Executable {
        public String getName() {
            return method.getName();
        }
        public Class<?> getReturnType() {
            return method.getReturnType();
        }
        public String toString() {
            return method.toString();
        }
    }

    static Method newMethod( java.lang.reflect.Method method ) {
        if ( method == null )
            return null;
        Method proxy = new Method();
        proxy.method = method;
        return proxy;
    }

}
