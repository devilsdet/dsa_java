package dsa_java.queu.priorityq;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
    
public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String s = "treexxxx";
        System.out.println(sortCharacterByFrequency(s));

    }

    private static String sortCharacterByFrequency(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c: s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0)+ 1);
        }
        StringBuilder sb = new StringBuilder();
        Queue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        queue.addAll(hm.entrySet());
        while (!queue.isEmpty()) {
            Map.Entry<Character, Integer> entry = queue.poll();
            for(int i=0; i<entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
