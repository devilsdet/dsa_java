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
      for(char c: s.toCharArray())
          hm.put(c, hm.getOrDefault(c,0)+1);
     Queue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
     queue.addAll(hm.entrySet());
     StringBuilder sb = new StringBuilder();
     while (!queue.isEmpty()) {
         Map.Entry<Character, Integer> hs = queue.poll();
         for(int i = 0; i < hs.getValue(); i++) {
             sb.append(hs.getKey());
         }
     }
     return sb.toString();
    }
}
