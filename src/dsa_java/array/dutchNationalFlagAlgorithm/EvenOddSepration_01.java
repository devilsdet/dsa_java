package dsa_java.array.dutchNationalFlagAlgorithm;

import java.util.Arrays;

public class EvenOddSepration_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8, 9, 12, 131, 14, 178, 190, 91, 976};
        printEvenOdd(arr);
    }

    private static void printEvenOdd(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            while (arr[start] % 2 == 0) {
                start ++;
            }
            while(arr[end] %2 != 0 ) {
                end--;
            }
            if(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
