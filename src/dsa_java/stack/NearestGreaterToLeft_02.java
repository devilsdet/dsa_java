package dsa_java.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterToLeft_02 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] result = findGreaterToLeft(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findGreaterToLeft(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] output = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(stack.isEmpty()) {
                output[i] = -1;
            } else if(!stack.isEmpty() && stack.peek() > arr[i]) {
                output[i] = stack.peek();
            } else {
                while (!stack.isEmpty() && stack.peek() < arr[i]) {
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
