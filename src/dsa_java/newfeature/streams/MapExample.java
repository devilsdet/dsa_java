package dsa_java.newfeature.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("google.com", 90);
        hashmap.put("facebook.com", 100);
        hashmap.put("in.linkedin.com", 200);
        Map<String, Integer> resultM = new HashMap<>();


        hashmap.forEach((K, V) -> {
            resultM.put(K, V);
            String[] domain = K.split("\\.");
            for(int i=1; i< domain.length; i++) {
             String op = "";
                for(int j=i; j<domain.length; j++) {
                 op = op + domain[j] + ".";
             }
                String result = op.substring(0,op.length()-1);
                resultM.put(result, resultM.getOrDefault(result, 0) + V);
            }
        });
        System.out.println(resultM);
    }
}


