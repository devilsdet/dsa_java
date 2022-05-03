package dsa_java.binarysearch;

public class FirstOccurrenceOfAnElemntSortedArray_04 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int key = 10;
        int firstIndex = findFirstOccurrenceIndex(arr, key);
        System.out.println(firstIndex);
    }

    private static int findFirstOccurrenceIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == key) {
                result = mid;
                end = mid-1;
            } else if(arr[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return result;
    }
}
