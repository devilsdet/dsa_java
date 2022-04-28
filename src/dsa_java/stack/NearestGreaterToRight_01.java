package dsa_java.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterToRight_01 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 4};
		int[] output = storeGreatestElementInStack(arr);
		
		System.out.println("Output is : " + Arrays.toString(output));

	}

	private static int[] storeGreatestElementInStack(int[] arr) {
		int size = arr.length; 
		int[] output = new int[size];
		output[size - 1] = -1;
		Stack<Integer> stack = new Stack<Integer>();

		
		for(int i=size-1; i>=0; i--) {
			if(stack.isEmpty()) {
				output[i] = -1;
			} else if(!stack.isEmpty() && stack.peek() > arr[i]) {
				output[i] = stack.peek();
			} else if(!stack.isEmpty() && stack.peek() <= arr[i]){
				
				while(!stack.isEmpty() && stack.peek() < arr[i]) {
					stack.pop();
				}
				if(stack.isEmpty()) {
					output[i] = -1;
				} else {
					output[i] = stack.peek();
				}
			}
			stack.push(arr[i]);
			
		}
		
		return output;
	}

}
