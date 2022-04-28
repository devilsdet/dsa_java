package dsa_java.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public static void main(String[] args) {
		String str1 = "aab";
		String str2 = "xxy";
		System.out.println(checkIsomorphic(str1, str2));
	}

	private static boolean checkIsomorphic(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		Map<Character, Character> mapping = new HashMap<Character, Character>();
		Map<Character, Boolean> isPresent = new HashMap<Character, Boolean>();
		
		for(int i=0; i< str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if(mapping.containsKey(ch1)) {
				if(mapping.get(ch1) != ch2) {
					return false;
				}
			} else {
				if(isPresent.containsKey(ch2)) {
					return false;
				} else {
					mapping.put(ch1, ch2);
					isPresent.put(ch2, true);
				}
			}
		}
		return true;
		
	}

}
