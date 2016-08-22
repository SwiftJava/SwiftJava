#! /bin/bash

# This is the recipe to update java's "rt.jar" to include argument name information.
# The overall sstep are as follows, first you need to get the java sources to compile...

# unzip $JAVA_HOME/src.zip
# find . -name '*.java' > sources.txt
# $JAVA_HOME/bin/javac -d classes -g -parameters @sources.txt 2>&1 | tee log.txt

# unfortunately this gives errors and you have to repeat the folowing steps

# grep error: log.txt | awk -F : '{ print $1 }' | sort -u > duds.txt
# for i in `cat duds.txt` ; do grep -v $i sources.txt > a.tmp; \mv a.tmp sources.txt; done
# \rm `cat duds.txt`
# ...repeat compile and loop (perhaps many times) until there are no errors

#
# at this point the classes are in the directory ./classes, update rt.jar
#
# cd classes
# find . -name '*.class' > classes.txt
# split classes.txt
# cp $JAVA_HOME/jre/lib/rt.jar .
# for i in x??; do jar ufv rt.jar `cat $i`; done

# then, move rt.jar to $JAVA_HOME/jre/lib (taking a backup first)
#
# sudo mv $JAVA_HOME/jre/lib/rt.jar $JAVA_HOME/jre/lib/rt.jar.save
# sudo cp rt.jar $JAVA_HOME/jre/lib

# swiftgen.sh should then be able to generate bridge sources with argument names (mostly)
