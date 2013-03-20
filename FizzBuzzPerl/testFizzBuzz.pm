#!/usr/bin/perl
package testFizzBuzz;

use Test::Unit;
use base qw(Test::Unit::TestCase);

require 'FizzBuzz.pl';

sub new {
    my $self = shift()->SUPER::new(@_);
    return $self;
}

sub test_FizzBuzz0 {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(0),"FIZZBUZZ");
}

sub test_FizzBuzz1 {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(1),"1");
}

sub test_FizzBuzz3 {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(3),"FIZZ");
}

sub test_FizzBuzz9 {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(9),"FIZZ");
}

sub test_FizzBuzz5 {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(5),"BUZZ");
}

sub test_FizzBuzz10 {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(10),"BUZZ");
}

sub test_FizzBuzz15 {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(15),"FIZZBUZZ");
}

sub test_FizzBuzz30 {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(30),"FIZZBUZZ");
}

sub test_FizzBuzzMinus {
    my $self = shift;
    $self->assert_equals(fizzbuzz::verifyFizzBuzz(-1),"-1");
}

sub set_up { }
sub tear_down { }

