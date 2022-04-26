package dsa_java.string;

public class MinimumDistanceBetweenStrings {

	public static void main(String[] args) {
		String[] str = {"geeks", "for", "geeks", "contribute", 
	     "practice"};
		String word1 = "geeks";
		String word2 = "practice";
		System.out.println(closestString(str, word1, word2));

	}

	private static int closestString(String[] str, String word1, String word2) {
		int m = 0;
		int n = 0;
		int MIN = Integer.MAX_VALUE;
		
		for(int i=0; i<str.length; i++) {
			if(str[i].equals(word1)) {
				m = i;
			}
			if(str[i].equals(word2)) {
				n= i;
			}
			
			if( m != 0 ||  n!= 0 ) {
				MIN = Math.min(MIN, Math.abs(n-m));
			}
		}
		return MIN;
		
	}

}
