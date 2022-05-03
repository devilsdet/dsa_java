package dsa_java.techiedelight.arrays;

import java.util.Stack;

public class ShrinkAnArrayByRemovingTriplet_02 {

    public static void main(String[] args) {
        int[] arr = { -1, 2, 5, 8, 2, 5 };
        int k = 3;
        System.out.println(removeElement(arr, k));
    }

    private static int removeElement(int[] arr, int k) {
        int i=0;
        int j=0;
        int windowSize = 0;
        Stack<Integer> stack = new Stack<>();

        while (j<arr.length) {
            windowSize = (j-i+1);
            stack.push(arr[j]);

            if(windowSize < 3) {
                j++;
            } else if(windowSize == 3) {
                boolean toContinue = true;
                while (!stack.isEmpty() && toContinue) {
                    int topElem = stack.pop();
                    if(!stack.isEmpty() && stack.peek() + k == topElem) {
                        int secondTop = stack.pop();
                        if(!stack.isEmpty() && stack.peek() + k == secondTop) {
                            stack.pop();

                            toContinue = true;
                        } else {
                            toContinue = false;
                            stack.push(secondTop);
                            stack.push(topElem);
                        }
                    } else {
                        toContinue = false;
                        stack.push(topElem);
                    }
                    j++;
                    i++;
                }

            }
        }
        System.out.println(stack.toString());
        return stack.size();
    }
}
