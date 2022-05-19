package dsa_java.array.sorting;

import java.util.Arrays;

public class SortColors_02 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0,2 ,1, 0, 0 ,2};
        sortColors(arr);
    }

    private static void sortColors(int[] arr) {
        int loop = 0;
        int mid = 0;
        int low = 0;
        int end = arr.length-1;

        while(mid < end) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid] == 1) {
                mid++;
            } else if(arr[mid] == 2) {
                swap(arr, mid, end);
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int low, int mid) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }
}
