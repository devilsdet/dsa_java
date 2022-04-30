package dsa_java.windowsliding;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringWithNoRepeatingCharacters_07 {
    public static void main(String[] args) {
        String str = "abcdbc";
        System.out.println(findSubStringWithNoRepeatingChars(str));

    }

    private static int findSubStringWithNoRepeatingChars(String str) {
        int i=0;
        int j=0;
        int windowSize = 0;
        int max = -1;
        Map<Character, Integer> hashmap = new HashMap<>();

        while (j < str.length()) {
            windowSize = (j-i+1);
            char endchar = str.charAt(j);
            hashmap.put(endchar, hashmap.getOrDefault(endchar,0)+1);
            if(windowSize == hashmap.size()) {
                max = Math.max(max, (j-i+1));
                j++;
            } else if(windowSize > hashmap.size()) {
                while(windowSize > hashmap.size() && !hashmap.isEmpty()) {
                    char startchar = str.charAt(i);
                    hashmap.put(startchar, hashmap.get(startchar)-1);
                    if(hashmap.get(startchar) == 0) {
                        hashmap.remove(startchar);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
