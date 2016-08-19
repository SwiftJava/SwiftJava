#!/bin/bash
#
# This build the jar of classes required to implement Runnable and Listener events from Java to Swift
#

cd `dirname $0`/src

# legacy JVM downloadable from here: https://support.apple.com/kb/dl1572?locale=en_US

export JAVA_HOME=${1:-/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home}

\rm `find . -name '*.class'` 2>/dev/null

$JAVA_HOME/bin/javac org/genie/{*,*/*}.java &&

$JAVA_HOME/bin/jar cfv ../genie.jar org/genie/{*,*/*}.class &&

\cp ../genie.jar ~/.genie.jar
