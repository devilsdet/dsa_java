package dsa_java.windowsliding;

public class LargestSubArrayOfSumK_05 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        int sum = 5;
        System.out.println(findLargestSubArrayOfSum(arr, sum));
    }

    private static int findLargestSubArrayOfSum(int[] arr, int sum) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int rangeSum = 0;

        while(j < arr.length) {
            rangeSum += arr[j];

            if(rangeSum < sum) {
                j++;
            } else if(rangeSum == sum) {
                max = Math.max((j-i)+1, max);
                j++;
            } else {
                while(rangeSum > sum) {
                    rangeSum -= arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
