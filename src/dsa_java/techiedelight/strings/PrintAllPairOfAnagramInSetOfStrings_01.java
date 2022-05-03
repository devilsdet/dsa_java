package dsa_java.techiedelight.strings;

import java.util.*;

public class PrintAllPairOfAnagramInSetOfStrings_01 {
    public static void main(String[] args) {
        String[] words = {
                "auctioned", "actors", "altered", "streaming", "related",
                "education", "aspired", "costar", "despair", "mastering"
        };
        List<List<String>> bucket = groupAnagrams(words);
        for(List<String> list: bucket) {
            for(String l: list) {
                System.out.print(l + "   ");
            }
            System.out.println();
        }
    }

    private static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagrams = new HashMap<>();
        List<List<String>> bucket = new ArrayList<>();
        for(String word: words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedchar = new String (ch);
            if(anagrams.containsKey(sortedchar)) {
                anagrams.get(sortedchar).add(word);

            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                anagrams.put(sortedchar, list);
            }
        }
        bucket.addAll(anagrams.values());
        return bucket;

    }
}
