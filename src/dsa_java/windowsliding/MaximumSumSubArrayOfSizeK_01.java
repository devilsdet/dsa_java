package dsa_java.windowsliding;

import java.util.Arrays;

public class MaximumSumSubArrayOfSizeK_01 {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 3, 6, 8};
		int k = 3;
		int sum = findMaxSubArraySum(arr, k);
		System.out.println("In the given Array: " + Arrays.toString(arr)  + " The max sum is " + 
				sum + " In the size of k: " + k);
	}

	private static int findMaxSubArraySum(int[] arr, int k) {
		int i = 0;
		int j = 0;
		int MAX = Integer.MIN_VALUE;
		int sum = 0;
		int windowsize = 0;
		
		while(j < arr.length) {
			sum += arr[j];
		    windowsize = (j- i + 1);
			if( windowsize < k) {
				j++;
			} else if(windowsize == k) {
				MAX = Math.max(MAX, sum);
				sum -= arr[i];
				i++;
				j++;
			}
		}
		return MAX;
	}

}
