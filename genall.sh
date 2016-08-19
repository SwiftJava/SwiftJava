#!/bin/bash
#
# Regenerate all bridge sources
#

cd `dirname $0`

for i in java_lang java_util java_sql java_awt javax_swing com_apple; do
    ./genswift.sh $i
    ./overrides.pl $i
done

./genjar.sh
