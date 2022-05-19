package dsa_java.newfeature.consumer;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<String> consumer = s-> System.out.println(s);
        consumer.accept("Gyana");
        consumer.accept("Ranjan");

    }
}
