package dsa_java.array.dutchNationalFlagAlgorithm;

import java.util.Arrays;

public class ZeroOneTwoSeparation_02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 1, 2, 1, 0, 0};
        separate(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void separate(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid < high) {
            if(arr[mid] == 1) {
                mid++;
            } else if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;

            } else {
                swap(arr, mid, high);
                high--;
            }
        }

    }

    private static void swap(int[] arr, int low, int mid) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }
}
