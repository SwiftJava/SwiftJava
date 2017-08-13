#!/bin/bash
#
# Build until all overrides are captured in build.log and there are no errors
#

cd "$(dirname "$0")" &&

XCODEBUILD=/Applications/Xcode.app/Contents/Developer/usr/bin/xcodebuild

# downloadable from https://support.apple.com/kb/dl1572?locale=en_US
export JAVA_HOME=${JAVA_HOME:-/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home}

for i in $*; do
    "$PWD/genswift.sh" $i $JAVA_HOME/jre/lib/rt.jar &&
    ./overrides.pl $i &&
    while true; do
        ($XCODEBUILD SYMROOT=/tmp -config Debug -target examples -project SwiftJava.xcodeproj; STATUS=$?) | tee -a $i/build.log
        ./overrides.pl $i
        if [[ $STATUS == 0 ]]; then
            exit
        fi
    done
done
