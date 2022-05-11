package dsa_java.stack;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaHistogram_07 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        int[] NSR = findNextSmallerToRight(arr);
        System.out.println(Arrays.toString(NSR));
    }

    private static int[] findNextSmallerToRight(int[] arr) {
        int[] nsr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length -1 ; i>=0; i--) {
            if(stack.isEmpty()) {
                nsr[i] = arr.length;
            } else if(stack.peek() < arr[i]) {
                nsr[i] = i;
            } else {
                int count = i;
                while (!stack.isEmpty() && stack.peek() > arr[i]) {
                    count++;
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    nsr[i] = arr.length;
                } else {
                    nsr[i] = count;
                }
            }
            stack.push(arr[i]);
        }
        return nsr;
    }
}
