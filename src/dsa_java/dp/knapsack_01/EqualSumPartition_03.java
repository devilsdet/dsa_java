package dsa_java.dp.knapsack_01;

import java.util.Arrays;

public class EqualSumPartition_03 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 11, 5};
        int arraySum = findSumOfArray(arr);
        boolean b = findEqualSum(arr, arraySum);
        System.out.println(b);
    }

    private static boolean findEqualSum(int[] arr, int arraySum) {
        if(arraySum % 2 != 0 ) {
            return false;
        } else {
            int sum = arraySum/2;
            int length = arr.length;
            boolean[][] t = new boolean[length+1][sum+1];
            for(int i=0; i<sum+1; i++) {
                t[0][i] = false;
            }
            for(int j=0; j<length+1; j++) {
                t[j][0] = true;
            }

            for(int i=1; i<length+1; i++) {
                for(int j=1; j<sum+1; j++) {
                    if(arr[i-1] <= j) {
                        t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                    } else {
                        t[i][j] = t[i-1][j];
                    }
                }
            }
            return t[length][sum];
        }
    }

    private static int findSumOfArray(int[] arr) {
       return Arrays.stream(arr).sum();
    }
}
