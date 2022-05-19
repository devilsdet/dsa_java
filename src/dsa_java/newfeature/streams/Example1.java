package dsa_java.newfeature.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(12);
        li.add(13);
        li.add(14);
        li.add(15);
        li.add(16);
        li.add(17);
        li.add(20);
        List<Integer> evenList = li.stream().filter((a) -> a%2 == 0).collect(Collectors.toList());
        evenList.forEach(el -> System.out.print (el + " "));
        List<Integer> updatedList = li.stream().map((a) -> a+100).collect(Collectors.toList());
        updatedList.forEach(el -> System.out.print(el + " "));
        System.out.println(updatedList.stream().count());
    }
}
