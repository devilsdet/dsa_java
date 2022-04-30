package dsa_java.array;

public class Maximum_SubArray_01 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaxSubArraySum(arr));

    }

    private static int findMaxSubArraySum(int[] arr) {
        int maxSum = 0;
        int currSum = 0;
        for(int i=0; i<arr.length; i++) {
            currSum = currSum + arr[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
