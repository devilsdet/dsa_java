package dsa_java.windowsliding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumOfAllSubArrayOfSizeK_04 {

	public static void main(String[] args) {
		int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
		int k = 3;
		List<Integer> output = findMaximumOfAllSubArrayOfSizeK(arr, k);
		for(int i: output) {
			System.out.print(i + " , ");
		}

	}
	
	private static List<Integer> findMaximumOfAllSubArrayOfSizeK(int[] arr, int k) {
		int i = 0;
		int j = 0;
		int windowsize = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		
		while(j < arr.length) {
			windowsize = (j-i+1);
			if(!queue.isEmpty() && queue.peek() < arr[j]) {
				while(!queue.isEmpty() && queue.peek() < arr[j]) {
					queue.remove();
				}
			}
			queue.add(arr[j]);
			
			if(windowsize < k) {
				j++;
			} else {
				output.add(queue.peek());
				if(queue.peek() == arr[i]) {
					queue.remove();
				}
				i++;
				j++;
			}
			
		}
		return output;
	}

}
