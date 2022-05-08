package dsa_java.sorting.advancesorting;

public class MergeSort_01 {
    public static void main(String[] args) {
        int[] arr = {23, 33, 12, 35, 1};
        mergeSort(arr);
    }

    private static void mergeSort(int[] arr) {
        doRecMergeSort(arr, 0, arr.length-1);
    }

    private static void doRecMergeSort(int[] arr, int low, int high) {
        if(low == high) return;
        int mid = (low + high)/2;
        doRecMergeSort(arr, low, mid);
        doRecMergeSort(arr, mid+1, high);
        merge(arr, low, mid+1, high);
    }

    private static void merge(int[] arr, int low, int upperlimit, int high) {
        int j=0;
        int lb = low;
        int mid = upperlimit-1;
        int n = high-low+1;

        while (low<=mid && upperlimit<=high) {
            if(arr[low] < arr[upperlimit]) {
                arr[j++] = arr[low++];
            } else {
                arr[j++] = arr[upperlimit++];
            }
        }
    }
}
