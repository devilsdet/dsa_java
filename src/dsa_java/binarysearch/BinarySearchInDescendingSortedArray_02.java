package dsa_java.binarysearch;

public class BinarySearchInDescendingSortedArray_02 {

	public static void main(String[] args) {
		int[] arr = {32, 31, 14, 12, 9};
		int key = 31;
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
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
		
	}

}
