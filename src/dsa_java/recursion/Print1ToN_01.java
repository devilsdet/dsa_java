package dsa_java.recursion;

public class Print1ToN_01 {
	public static void main(String[] args) {
		print1ToN(23);
	}

	private static void print1ToN(int i) {
		if(i == 1) {
			System.out.println(i);
			return ;
		}
		print1ToN(i-1);
		System.out.println(i);
		
	}

}
