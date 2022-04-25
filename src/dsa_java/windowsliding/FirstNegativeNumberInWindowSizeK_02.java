package dsa_java.windowsliding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstNegativeNumberInWindowSizeK_02 {

	public static void main(String[] args) {
		int[] arr = {12, -1, -7, 8, -15, 30, 28};
		int k = 3;
		List<Integer> output = findFirstNegativeInSizeK(arr, k);
		System.out.println("In the given Array: " + Arrays.toString(arr)  + " the first negative "
				+ "of size k " + k + " is " + output.toString());
		

	}

	private static List<Integer> findFirstNegativeInSizeK(int[] arr, int k) {
		int i = 0;
		int j = 0;
		int windowsize = 0; 
		List<Integer> output = new ArrayList<>();
		List<Integer> negativeResult = new ArrayList<>();
		
		while (j < arr.length) {
			windowsize = (j-i+1);
			if(arr[j] < 0) {
				negativeResult.add(arr[j]);
			}
			if(windowsize < k) {
				j++;
			} else if(windowsize == k) {
				if(negativeResult.isEmpty()) {
					output.add(0);
				} else {
					output.add(negativeResult.get(0));
					if(negativeResult.get(0) == arr[i]) {
						negativeResult.remove(0);
					}
					i++;
					j++;
				}
			}
		}
		return output;
	}

}
