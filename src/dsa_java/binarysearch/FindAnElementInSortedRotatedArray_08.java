package dsa_java.binarysearch;

public class FindAnElementInSortedRotatedArray_08 {
    int[] arr = {11, 12, 15, 18, 2, 5, 6, 8};
    int key = 15;

    int index = findElement(arr, key);

    private int findElement(int[] arr, int key) {
        int index = findIndexOfMinElem(arr);
        return index;

    }

    private int findIndexOfMinElem(int[] arr) {
        int start = 0;
        int size = arr.length;
        int end = size-1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            int leftN = mid-1;
            int rightN = (mid + size +1)%size;
        }
        return start;
    }
}
