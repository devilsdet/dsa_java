package dsa_java.techiedelight.arrays;

public class MergeOperationTomMakePalliandrome_01 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3 , 7};
        System.out.println(mergeToMakePalliandrome(arr));

    }

    private static int mergeToMakePalliandrome(int[] arr) {
        int count = 0;
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            if(arr[start] < end) {
                count++;
                arr[start+1] = arr[start] + arr[start+1];
                start++;
            } else if(arr[start] > arr[end]) {
                count++;
                arr[end-1] = arr[end] + arr[end-1];
                end--;
            } else {
                start ++;
                end --;
            }
        }
        return count;

    }
}
