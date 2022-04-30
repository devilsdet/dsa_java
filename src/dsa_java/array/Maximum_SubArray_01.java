package dsa_java.array;

public class Maximum_SubArray_01 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaxSubArraySum(arr));

    }

    private static int findMaxSubArraySum(int[] arr) {
        int maxSum = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
