package dsa_java.array.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays_01 {
    public static void main(String[] args) {
        int[] a = {23, 47, 81, 95};
        int[] b = {7, 14, 39, 55, 62, 74};
        System.out.println(Arrays.toString(mergeToSortedArray(a, b)));
    }

    private static int[] mergeToSortedArray(int[] a, int[] b) {
        int alength = a.length;
        int blength = b.length;
        int klength = alength + blength;
        int[] c = new int[klength];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < alength && j < blength) {
                if(a[i] < b[j]) c[k++] = a[i++];
                else c[k++] = b[j++];
            }
        while (i <alength) c[k++] = a[i++];
        while (j < blength) c[k++] = b[j++];
        return c;
    }
}
