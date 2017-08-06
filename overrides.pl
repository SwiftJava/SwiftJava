#!/usr/bin/perl -w
#
# For some reason the class metadata can't be relied on to determine whether a
# constructor or method is being overridden. Solution is to build using xcodebuild
# and use this script to parse the build log to patch in the overrides required.
#

use IO::File;
use strict;

foreach my $log (@ARGV) {
    my $text = join '', (IO::File->new( "< $log/build.log" ) or die "File not found")->getlines();

    my $pathStripped = $text =~ s@$ENV{PWD}/@@g;
    my $xcodeStripped = $text =~ s@^(    /Applications/Xcode|CompileSwift|    export |    cd |Check dependencies|=== BUILD TARGET).*\n@@gm;
    my $spaceStripped = $text =~ s@\( \)@()@g;
    my $linesStripped = $text =~ s@\n{2,}@\n@g;

    if ( $pathStripped || $xcodeStripped || $spaceStripped || $linesStripped ) {
        IO::File->new( "> $log/build.log" )->print( $text );
    }

    while ( $text =~ /([^\n:]+):.*? error: overriding declaration requires an 'override' keyword\n    ([^{]*\{)/gm ) {
        my ($source, $key) = ($1, $2);

        warn ">>$1 $2<<\n";

        next if !-f $source;
        my $code = join '', IO::File->new( "< $source" )->getlines();
        if ( $code =~ s/(?<!override )\Q$key\E/override $key/ ) {
            IO::File->new( "> $source" )->print( $code );
        }
    }
}
