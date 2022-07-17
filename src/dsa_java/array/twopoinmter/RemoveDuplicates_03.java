package dsa_java.array.twopoinmter;

import java.util.Arrays;

public class RemoveDuplicates_03 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 6, 9, 9};
        System.out.println(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] arr) {
        int nextDuplciate = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1] != arr[i]) {
                arr[nextDuplciate] = arr[i];
               nextDuplciate++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return nextDuplciate;
    }
}
