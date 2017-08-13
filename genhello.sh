#!/bin/bash
#
# Generates Proxy and Swift sources for swifthello Android sample
# Note: use of -parameters option when compiling to record names
#

cd "$(dirname "$0")/src" &&

export JAVA_HOME=${JAVA_HOME?-Please export JAVA_HOME}

export COMPANY=johnholdsworth

# clear out any generated swift files
\rm `find ../{swift-android-samples,swift-android-kotlin} -name 'SwiftHello*.swift'` 2>/dev/null

# clear out generated Java proxy files
\rm -rf ../{swift-android-samples,swift-android-kotlin}/*/src/main/java/org/swiftjava/com_$COMPANY

# compile bindings and package them into for jar for genswift.sh
$JAVA_HOME/bin/javac -Xlint:unchecked -parameters com/$COMPANY/swiftbindings/*.java &&

$JAVA_HOME/bin/jar cf /tmp/swifthello.jar com/$COMPANY/swiftbindings/*.class &&

# The last argument is the frameworks the project
# is dependent on. java_lang for example will add
# about 2mb to the app's apk and needs to be added
# to the project's src/main/swift/Package.swift

cd .. && ./genswift.sh com.$COMPANY.swiftbindings /tmp/swifthello.jar "" &&

# copy newly generated sources derived from the bindings into the example projects

mkdir -p swift-android-samples/swifthello/src/main/java/{com/$COMPANY/swiftbindings,org/swiftjava/com_$COMPANY} swift-android-kotlin/app/src/main/java/{com/$COMPANY/swiftbindings,org/swiftjava/com_$COMPANY} &&

\cp -v src/com/$COMPANY/swiftbindings/*.java swift-android-samples/swifthello/src/main/java/com/$COMPANY/swiftbindings &&
\cp -v src/com/$COMPANY/swiftbindings/*.java swift-android-kotlin/app/src/main/java/com/$COMPANY/swiftbindings &&

\cp -v src/org/swiftjava/com_$COMPANY/*.java swift-android-samples/swifthello/src/main/java/org/swiftjava/com_$COMPANY &&
\cp -v src/org/swiftjava/com_$COMPANY/*.java swift-android-kotlin/app/src/main/java/org/swiftjava/com_$COMPANY &&

\cp -v com_$COMPANY/Sources/SwiftHello*.swift swift-android-samples/swifthello/src/main/swift/Sources
\cp -v com_$COMPANY/Sources/SwiftHello*.swift swift-android-kotlin/app/src/main/swift/Sources
