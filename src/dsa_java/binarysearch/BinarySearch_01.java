package dsa_java.binarysearch;

public class BinarySearch_01 {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 9, 12, 18, 21};
		int key = 12;
		int index = findKeyUsingBinarySearch(arr, key);
		System.out.println("The index of the element " + key + 
				" is found in " + index+"th position");

	}

	private static int findKeyUsingBinarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == key) {
				return mid+1;
			} else if(arr[mid] < key ) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return -1;
		
	}

}
