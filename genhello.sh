#!/bin/bash
#
# Generates Proxy and Swift sources for swifthello Android sample
# Note: use of -parameters option when compiling to record names
#

cd "$(dirname "$0")/src" &&

export JAVA_HOME=${JAVA_HOME?-Please export JAVA_HOME}

# clear out any generated swift files
\rm `find ../{swift-android-samples,swift-android-kotlin} -name 'SwiftHello*.swift'` 2>/dev/null

# clear out generated Java proxy files
\rm -rf ../{swift-android-samples,swift-android-kotlin}/*/src/main/java/org/swiftjava/com_johnholdsworth

# compile bindings and package them into for jar for genswift.sh
$JAVA_HOME/bin/javac -parameters com/johnholdsworth/bindings/*.java &&

$JAVA_HOME/bin/jar cf /tmp/swifthello.jar com/johnholdsworth/bindings/*.class &&

# The last argument is the frameworks the project
# is dependent on. java_lang for example will add
# about 2mb to the app's apk and needs to be added
# to the project's src/main/swift/Package.swift

cd .. && ./genswift.sh com.johnholdsworth.bindings /tmp/swifthello.jar "" &&

# copy newly generated sources derived from the bindings into the example projects

mkdir -p swift-android-samples/swifthello/src/main/java/{com/johnholdsworth/bindings,org/swiftjava/com_johnholdsworth} swift-android-kotlin/app/src/main/java/{com/johnholdsworth/bindings,org/swiftjava/com_johnholdsworth} &&

\cp -v src/com/johnholdsworth/bindings/*.java swift-android-samples/swifthello/src/main/java/com/johnholdsworth/bindings &&
\cp -v src/com/johnholdsworth/bindings/*.java swift-android-kotlin/app/src/main/java/com/johnholdsworth/bindings &&

\cp -v src/org/swiftjava/com_johnholdsworth/*.java swift-android-samples/swifthello/src/main/java/org/swiftjava/com_johnholdsworth &&
\cp -v src/org/swiftjava/com_johnholdsworth/*.java swift-android-kotlin/app/src/main/java/org/swiftjava/com_johnholdsworth &&

\cp -v com_johnholdsworth/Sources/SwiftHello*.swift swift-android-samples/swifthello/src/main/swift/Sources
\cp -v com_johnholdsworth/Sources/SwiftHello*.swift swift-android-kotlin/app/src/main/swift/Sources
