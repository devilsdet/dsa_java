Lambda Expression:
=====================
    1930 lambda calculs came in to mathematics in 1930. This calculus solves a lot of programming.

What is the main objective of lambda expression:
    1. To bring benefits of functional programming in java

What is Lambda Expression:
    1. It is anonymous function.
    The function which doesn't have name, 
                        without return type, 
                        without modifiers.

    It is very very very easy concept.

How to write lambda expression
eg1
  () -> { System.out.println("Hello"); }
If body contains one statement, the curly braces are optional.
If body contains multiple statement, the curly braces are mandatory.
eg2
    (int a, int b) -> {System.out.println(a+b);}
eg3
    If the compiler can guess the parameter type, then we don't need to specify the parameter of input type.
    (a, b) -> {System.out.println(a+b);}

eg4: (int n) -> {return n*n};
    Return word is not needed if there is no curly braces.
    (int n) -> n*n;
          n -> n*n;

eg5: length of the string
    s -> s.length();

public int squareIt(int n) {
    return n*n;
}

n -> n*n;

Lambda expressions can have any number of arguments. 
f multiple arguments are there, we have to separate them by commas.

without curly braces we can not use return keyword.
Within curly braces if we want to return some value compulsory we should use return statement.

Once we write lambda expression, we have to use functional interfaces.


Functional Interface
==============================================

Runnable Interface    (Run Method)
Comparable Interface  (Compare to())
Comparator Interface  (compare())
ActionListeaner       (actionPerformed())
Callable Interface    (call())

What is functional interface?
All the above interfaces contain single abstarct method. So any interface which contain single abstract method (SAM).

In interfaces we have abstract /static/ default method. If any interfaces has static or abstarct method, we can consider
it as funactional interfaces provided we have single abstract method.

@FunctionalInterface
interface Interf {
    public void m1();
    default void m3() {}
    public static void m2() {}
}

There is one annotation @FunctionalInterface to represent Functional interface.This one annotation is optional

##### Functional interfaces with inhertance
@FunctionalInterface
interface A {
    public void m1();
}

@FunctionalInterface
interface B extends A {

}

This is valid as interface. the child interface will have single abstarct method.


A separate .class file will not be generated for lambda expression.
