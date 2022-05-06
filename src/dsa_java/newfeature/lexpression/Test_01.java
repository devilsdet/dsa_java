package dsa_java.newfeature.lexpression;

import java.util.function.Function;
import java.util.function.Predicate;

interface Interf {
    public void m1();
    default void m2() {
        System.out.println("I am inside interface");
    }

    static void m3() {
        System.out.println("I am inside static method");
    }
}

public class Test_01 {
    
    public static void main(String[] args) {
        Function<Integer, Integer> funct = i -> i * i ;
        Predicate<Integer> p = i -> i%2 == 0;

        System.out.println("Square of 23 is: " + funct.apply(23));
        System.out.println("Square of 8 is: " + funct.apply(23));
        System.out.println(p.test(2));
        System.out.println(p.test(19));

        Interf i = () ->  System.out.println("Hello I am a lamda expresion");
        i.m1();
        i.m2();
        Interf.m3();

    }
}
