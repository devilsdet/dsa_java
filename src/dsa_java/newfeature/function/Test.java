package dsa_java.newfeature.function;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i*i;
        System.out.println(f.apply(23));

        Function<String, Integer> d = s -> s.length();
        System.out.println(d.apply("Gyana"));
    }
}
