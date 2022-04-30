package dsa_java.array;

public class MaximumSubArrayAllNegative_02 {
    public static void main(String[] args) {
        int[] arr = {-49, -48, -1, -5};
        System.out.println(findMaxSumSubArray(arr));
    }

    private static int findMaxSumSubArray(int[] arr) {
        int maxSum = arr[0];
        int currSum = arr[0];
        for(int i=1; i<arr.length; i++) {
            currSum = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
