package dsa_java.binarysearch;

public class NumberOfTimesASortedArrayIsRotated_07 {
    public static void main(String[] args) {
        int[] nums = {11, 12, 15, 18, 2, 5, 6, 8};
        System.out.println(findNumberOfTimesItIsRotated(nums));

    }
    private static int findNumberOfTimesItIsRotated(int[] nums) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;

        while (start <= end) {
            if(nums[start] < nums[end]) {
                return start +1;
            }
            int mid = start + (end-start)/2;
            int prev = (mid+length-1)%length;
            int next = (mid+1)%length;
            if(nums[prev] >= nums[mid] && nums[next] <= nums[next]) {
                return mid+1;
            } else if (nums[mid] >= nums[start]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
