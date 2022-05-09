package dsa_java.newfeature.predefinedfunctionalinterfaces;


import java.util.function.Predicate;

public class EvenCheckPredicate {
    public static boolean test (Integer I) {
        if(I%2 == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        test(21);
        Predicate<Integer> p1 = i -> i%2 == 0;
        System.out.println(p1.test(10));

    }
}
