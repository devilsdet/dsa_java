package dsa_java.array.twopoinmter;

import java.util.Arrays;

public class PairWithTargetSum_02 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 11};
        int target = 11;
        System.out.println(Arrays.toString(findTargetSum(arr, target)));
    }

    private static int[] findTargetSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if(arr[i] + arr[j] == target) {
                return new int[]{i, j};
            } else if(arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {};
    }
}
