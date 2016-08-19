#!/usr/bin/env perl -w
#
# This seems to be the only automated way of extracting the
# function signatures needed to look up fields, constructors
# and methods for a list of classes provided on standard input.
# Takes a while but you only need to do it once per Java version.
#
# ... replaced now by internal function inside code generator

use IO::File;
use strict;

while( my $class = <> ) {
    chomp( $class );
    (my $dotted = $class) =~ s/\$/./g;
    my $cmd = IO::File->new( "$ENV{JAVA_HOME}/bin/javap -s -p '$dotted' |" );
    my $out = join '', <$cmd>;
    while ( $out =~ /^\s+(.+);\n\s+descriptor: (.+)/gm ) {
        my ($func, $jni_sig) = ($1, $2);
        $func =~ s/<[^<>]*(<[^>]+>[^<>]*)*>//g; # remove two levels of generics
        print "$class:$func\n$jni_sig\n";
    }
}

# redirect into signatures.txt
