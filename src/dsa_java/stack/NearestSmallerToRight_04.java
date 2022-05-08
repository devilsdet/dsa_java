package dsa_java.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerToRight_04 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString( findNearestSmallerToRight(arr)));

    }

    private static int[] findNearestSmallerToRight(int[] arr) {
    int[] output = new int[arr.length];
    Stack<Integer> stack = new Stack<>();
    for(int j=arr.length-1; j>=0; j--) {
        if(stack.isEmpty()) output[j] = -1;
        else if(stack.peek() < arr[j]) output[j] = stack.peek();
        else if(stack.peek() > arr[j]) {
            while (!stack.isEmpty() && stack.peek() > arr[j]) {
                stack.pop();
            }
            if(stack.isEmpty())output[j] = -1;
            else output[j] = stack.peek();
        }
        stack.push(arr[j]);
    }
    return output;
    }

}
