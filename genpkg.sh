#!/bin/bash
#
# Build until all overrides are captured in build.log and there are no errors
#

cd `dirname $0`

XCODEBUILD=/Applications/Xcode.app/Contents/Developer/usr/bin/xcodebuild

for i in $*; do
    ./genswift.sh $i
    ./overrides.pl $i
    while true; do
        ($XCODEBUILD SYMROOT=/tmp -config Debug -target examples -project SwiftJava.xcodeproj; STATUS=$?) | tee -a $i/build.log
        ./overrides.pl $i
        if [[ $STATUS == 0 ]]; then
            exit
        fi
    done
done
