package dsa_java.sorting;

import java.util.Arrays;

public class BubbleSort_01 {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 5, 7};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    private static int[] bubbleSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean isSorted; //This parameter is to check if the array is sorted or not

        for(int i=start; i<= end; i++) {
            isSorted = true;
            for(int j=start;j<=end-i-1; j++ ) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    isSorted = false;
                }
            }
            if(isSorted) {
                return arr;
            }
        }
        return arr;
    }
}
