package dsa_java.string;

import java.util.Arrays;

public class Panagramchecking {

	public static void main(String[] args) {
		String s = "the Quick Brown Fox Jumps Over Lazy Dog";
		System.out.println(checkPanagram(s.toLowerCase()));

	}

	private static boolean checkPanagram(String lowerCase) {
		char[] charArray = new char[26];
		
		for(int i=0; i<lowerCase.length(); i++) {
			char ch = lowerCase.charAt(i);
			if(Character.isLetter(ch)) {
				int index = ch - 'a';
				charArray[index] = ch;
			}
		}
		System.out.println(Arrays.toString(charArray));

		for(int i = 0; i<charArray.length; i++) {
			if(!Character.isLetter(charArray[i])) {
				return false;
			}
		}
		return true;
		
	}

}
