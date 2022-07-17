package dsa_java.array.twopoinmter;

import java.util.Arrays;

public class SquaringASortedArray_04 {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 2, 3};
        System.out.println(Arrays.toString(sortSquare(arr)));
    }

    private static int[] sortSquare(int[] arr) {
        int[] crr = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = arr.length-1;
        while (i < j) {
            if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                crr[k] = arr[i] * arr[i];
                k--;
                i++;
            } else {
                crr[k] = arr[j] * arr[j];
                k--;
                j--;
            }
        }
        return crr;
    }
}
