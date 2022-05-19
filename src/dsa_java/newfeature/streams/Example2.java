package dsa_java.newfeature.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sachin Tebdulkar");
        list.add("Virat Kohli");
        list.add("M.S. Dhoni");
        list.add("Rahul Dravid");
        list.add("V.V.S. Laxman");

        List<String> sortedList = list.stream().sorted((p1, p2) -> {
            int l1 = p1.length();
            int l2 = p2.length();
            if(l1 < l2) {
                return -1;
            } else if( l1 > l2) {
                return 1;
            } else {
                return p1.compareTo(p2);
            }
        }).map(s -> s+ " Cricketer ").collect(Collectors.toList());
        sortedList.forEach( s-> System.out.println(s));
    }
}
