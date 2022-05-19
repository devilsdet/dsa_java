Java 8 Features:
===============================
    1. Concise code
    2. Enable Functional Programming

Lambda Expressions :
=================================

Functional programming 
is a programming paradigm in which we try to bind everything in pure mathematical functions style.


Consumer:
=====================
Take some input and perform required operation and not required to return anything.

Function
=====================
Take some input and perform some operation and return the result which is need not be boolean type.

Predicate:
==============
Take some input and perform some conditional checks and return boolean value.

Supplier:
===================
Just supply my required objects and it wont take any input.

interface Supplier<R> {
    public R get();
}

BIPredicate
====================

=================
Predicate ---> Test (only one inp)
Function  ---> apply (only one inp)
Consumer  ---> accept (only one inp)
Supplier  ----> Get (More than one but less than five)
++++++++++++++++++

Normal predicate can take only one input argument and perform some conditional checks.
Sometimes our programming requiremnt is we have to take 2 input arguments and perform some conditional
checks. For this requirement, we should go for BIPredicate

BiPredicate is exactly same as predicate except that it will take two input arguments.

interface BiPredicate<T1, T2> {
    public boolean  test(T1 t1, T2 t2);
}

