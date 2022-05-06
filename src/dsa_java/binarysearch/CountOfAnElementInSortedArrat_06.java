package dsa_java.binarysearch;

public class CountOfAnElementInSortedArrat_06 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int key = 10;
        int firstOccurrence = findFirstOccurrence(arr, key);
        int lastOccurrence = findLastOccurrence(arr, key);
        System.out.println("The number of times "+ key + " is present " + (lastOccurrence - firstOccurrence + 1));
    }

    private static int findLastOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid]== key) {
                res = mid;
                start = mid+1;
            } else if(arr[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return res;
    }

    private static int findFirstOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start )/2;
            if(arr[mid] == key){
               res = mid;
               end = mid-1;
            } else if(arr[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return res;
    }
}
