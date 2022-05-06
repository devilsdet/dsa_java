package dsa_java.sorting;

import java.util.Arrays;

public class InsertionSort_03 {
    public static void main(String[] args) {
        int[] arr = {21, 2, 54, 6, 89, 4}; // 2 21 54 6
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
       for(int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
           int sortedIndex = unsortedIndex-1;
           int temp = arr[unsortedIndex];
           while (sortedIndex >= 0 && temp < arr[sortedIndex]) {
               arr[sortedIndex+1] = arr[sortedIndex];
               sortedIndex--;
           }
           arr[sortedIndex+1] = temp;
       }
       return arr;
    }
}
