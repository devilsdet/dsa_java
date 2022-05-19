package dsa_java.array.swapsort;

public class FindMissingDuplicate_01 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4, 5};
        findMiisng(arr);
    }

    private static void findMiisng(int[] arr) {
        int i = 0;

        while(i<arr.length) {
            if(arr[i] != arr[arr[i-1]]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            } else {
                i++;
            }
        }
    }
}
