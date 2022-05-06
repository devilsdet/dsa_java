package dsa_java.sorting;

import java.util.Arrays;

public class SelectionSort_02 {
    public static void main(String[] args) {
        int[] arr = {21, 2, 54, 6, 89, 4};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for(int i=start; i<=end; i++) {
            int range = end-i;
            int maxIndex = findMaxIndex(arr, start, range);
            if(range != maxIndex) {
                int temp = arr[maxIndex];
                arr[maxIndex]= arr[range];
                arr[range] = temp;
            }
        }
        return arr;
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for(int i=start+1; i<=end; i++) {
            if(arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
