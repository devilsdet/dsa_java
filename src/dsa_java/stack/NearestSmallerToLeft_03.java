package dsa_java.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerToLeft_03 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(findNearestSmallerToLeft(arr)));
        ;
    }

    private static int[] findNearestSmallerToLeft(int[] arr) {
        int[] output = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(stack.isEmpty()) {
                output[i] = -1;
            } else if(stack.peek() < arr[i]) {
                output[i] = stack.peek();
            } else {
                while (!stack.isEmpty() && stack.peek() > arr[i]) {
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
