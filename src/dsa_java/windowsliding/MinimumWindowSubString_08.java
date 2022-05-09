package dsa_java.windowsliding;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString_08 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));

    }

    private static String minWindow(String s, String t) {
        Map<Character, Integer> tm = new HashMap<>();
        for(char c: t.toCharArray()) {
            tm.put(c, tm.getOrDefault(c, 0) +1);
        }

        int i=0;
        int j=0;
        int min = Integer.MAX_VALUE;
        int count = tm.keySet().size();
        int maxstart = 0;
        int maxend = 0;

        while (j<s.length()) {
            char endchar = s.charAt(j);
            if (tm.containsKey(endchar)) {
                tm.put(endchar, tm.get(endchar) - 1);
            }
            if (tm.get(endchar) != null && tm.get(endchar) == 0) {
                count--;
            }
            if (j - i + 1 < t.length()) {
                j++;
            } else {
                while (count == 0) {
                    if ((j - i + 1) < min) {
                        min = (j - i + 1);
                        maxend = j + 1;
                        maxstart = i;
                    }
                    char startchar = s.charAt(i);
                    if (tm.containsKey(startchar)) {
                        tm.put(startchar, tm.get(startchar) + 1);
                    }
                    if (tm.get(startchar) != null && tm.get(startchar) == 1) {
                        count++;
                    }
                    i++;
                }
                j++;
            }
        }
        return s.substring(maxstart, maxend);
    }
}
