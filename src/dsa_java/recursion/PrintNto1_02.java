package dsa_java.recursion;

public class PrintNto1_02 {

	public static void main(String[] args) {
		printNto1(25);

	}

	private static void printNto1(int i) {
		if(i == 1) {
			System.out.println(i);
			return; 
		}
		System.out.println(i);
		printNto1(i-1);
		return;
		
	}

}
