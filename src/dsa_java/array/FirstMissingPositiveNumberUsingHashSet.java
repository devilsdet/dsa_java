package dsa_java.array;

public class FirstMissingPositiveNumberUsingHashSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        int num = findMissing(arr);
        System.out.println(num);
    }

    private static int findMissing(int[] nums) {
        for(int i=0; i<nums.length; i++)
            if(nums[i] < 0)
                nums[i] = 0;

        for(int i=0; i<nums.length; i++) {

            int val = Math.abs(nums[i]);

            if(val > 0 && val <= nums.length) {

                if(nums[val - 1] > 0)
                    nums[val - 1] *= -1;

                else if(nums[val - 1] == 0)
                    nums[val - 1] = -(nums.length + 1);
            }
        }

        for(int i=0; i<nums.length; i++)
            if(nums[i] >= 0)
                return i+1;

        return nums.length + 1;

    }
}
