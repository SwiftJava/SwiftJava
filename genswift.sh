#!/bin/bash
#
# Interface to the Swift code generator Java code
#
# FILTER is the package names/classes to generate code for
# TARGET_JAR is the jar containing these classes
# PACKAGE_ORDER allows you to specify the order of frameworks
#
# In order to generate code with argument names captured you
# need to compile with the new-to-Java8 option -parameters.
#

FILTER=${1:-java/lang|java/util|java/sql|java/awt|javax/swing}

FILTER=$(echo $FILTER | sed s@[._]@/@)

TARGET_JAR=${2:-$JAVA_HOME/jre/lib/rt.jar}

PACKAGE_ORDER=${3:-java/lang|java/util|java/sql|java/awt|javax/swing}

cd `dirname $0` && cd src && $JAVA_HOME/bin/javac genswift.java && cd - &&

$JAVA_HOME/bin/jar tf "$TARGET_JAR" | egrep "^($FILTER)" | sed "s@\\.class\$@@" | $JAVA_HOME/bin/java -cp "src:$TARGET_JAR" genswift "$PACKAGE_ORDER"
