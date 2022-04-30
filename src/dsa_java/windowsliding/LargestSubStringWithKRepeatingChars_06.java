package dsa_java.windowsliding;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringWithKRepeatingChars_06 {
    public static void main(String[] args) {
        String str = "abcabcdfababcabcabcabc";
        int k = 3;
        System.out.println(findLargestSubStringWithKChars(str, k));
    }

    private static int findLargestSubStringWithKChars(String str, int k) {
        int i = 0;
        int j = 0;
        int largestLength = -1;
        Map<Character, Integer> hashmap = new HashMap<Character, Integer>();

        while (j < str.length()) {
            hashmap.put(str.charAt(j), hashmap.getOrDefault(str.charAt(j),0)+1);
            if( hashmap.size() < k) {
                j++;
            } else if(hashmap.size() == k) {
                largestLength = Math.max(largestLength, (j-i+1));
                j++;
            } else if(hashmap.size() > k) {
                while(hashmap.size() > k) {
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
        return largestLength;

    }
}
