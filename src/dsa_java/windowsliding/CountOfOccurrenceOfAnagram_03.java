package dsa_java.windowsliding;

import java.util.HashMap;
import java.util.Map;

public class CountOfOccurrenceOfAnagram_03 {
	 public static void main(String[] args) {
	        String input = "fxoraxofxo";
	        String pattern = "fox";

	        System.out.println(countOccOfAnagrams(input,pattern));
	    }

	    private static int countOccOfAnagrams(String input, String pattern) {
	        int windowSize = pattern.length();
	        int i=0;
	        int j=0;
	        int count=0;
	        int output=0;

	        Map<Character,Integer> patternMap = new HashMap<Character, Integer>();

	        //populate map
	        patternMap = storeInToMap(pattern);
	        // count of distinct characters
	        count = patternMap.keySet().size();

	        while(j < input.length()){
	            char endChar = input.charAt(j);

	            // calculation for character at end of window
	            if(patternMap.containsKey(endChar)){
	            	patternMap.put(endChar,patternMap.get(endChar)-1);
	            }
	            if(patternMap.get(endChar) !=null && patternMap.get(endChar) == 0){
	                count --;
	            }


	            if(j-i+1 < windowSize){
	                j++;
	            }else{
	                if(count==0){
	                    output++;
	                }
	                char startChar = input.charAt(i);
	                // calculation for character at moving out of window
	                if(patternMap.containsKey(startChar)){
	                	patternMap.put(startChar,patternMap.get(startChar)+1);
	                }
	                if(patternMap.get(startChar) !=null && patternMap.get(startChar) == 1){
	                    count ++;
	                }
	                i++;
	                j++;
	            }

	        }
	        return output;
	    }

		private static Map<Character, Integer> storeInToMap(String pattern) {
			Map<Character, Integer> hashmap = new HashMap<Character, Integer>();
			for(char ch: pattern.toCharArray()) {
				hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
			}
			return hashmap;
		}

}
