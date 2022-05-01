package dsa_java.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray_03 {
    public static void main(String[] args) {
        int[] nums = {4,3,7,7,8,2,3,1};
        System.out.println(findDuplciates(nums).toString());
    }

    private static List<Integer> findDuplciates(int[] nums) {
        List<Integer> output = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int num = Math.abs(nums[i])-1;
            if(nums[num] < 0 ) {
                output.add(Math.abs(nums[num]));
            } else {
                nums[num] = -nums[num];
            }
        }
        return output;
    }
}
