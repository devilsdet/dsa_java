package dsa_java.newfeature.lexpression;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionLamdaExpression {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 4, 2, 6, 8, 1));
        Collections.sort(list, (o1, o2) -> o1<o2 ? -1 : o1 >o2?1:0);
        list.stream().forEach(System.out :: print );
        List<Integer> list1 = list.stream().filter( i -> i%2 ==0).collect(Collectors.toList());
        list1.forEach(System.out::println);
    }
}
