#!/bin/bash
#
# Generates Proxy and Swift sources for swifthello Android sample
# Note use of -parameters option when compiling to record names
#

cd `dirname $0`/src &&

\rm `find com/jh -name '*.class'` 2>/dev/null

\rm `find ../com_jh -name '*.swift'` 2>/dev/null

\rm `find ../swift-android-samples/swifthello/src/main/swift/Sources -name 'SwiftHello*.swift'` 2>/dev/null

$JAVA_HOME/bin/javac -parameters com/jh/*.java &&

$JAVA_HOME/bin/jar cf /tmp/hello.jar com/jh/*.class &&

# The last argument is the frameworks the project
# is dependent on. java_lang for example will add
# about 2mb to the app's apk and needs to be added
# to the project's src/main/swift/Package.swift

cd .. && ./genswift.sh com.jh /tmp/hello.jar "" &&

mkdir -p swift-android-samples/swifthello/src/main/java/{com/jh,org/genie/com_jh} &&

\cp -v src/com/jh/*.java swift-android-samples/swifthello/src/main/java/com/jh &&
\cp -v src/org/genie/com_jh/*.java swift-android-samples/swifthello/src/main/java/org/genie/com_jh &&

\cp -v com_jh/Sources/SwiftHello*.swift swift-android-samples/swifthello/src/main/swift/Sources
