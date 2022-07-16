package dsa_java.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort_04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000000];
        for(int i = 0; i < 1000000; i++) {
            array[i] = random.nextInt(100000);
        }
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if(low >= high) {
            return;
        }
        int partition = performPartition(array, low, high);
        quickSort(array, low, partition-1);
        quickSort(array, partition+1, high);
    }

    private static int performPartition(int[] array, int low, int high) {
        int pivot = array[high];
        int lowP = low;
        int highP = high;

        while(lowP < highP ) {
            while (array[lowP] <= pivot && lowP < highP) {
                lowP ++;
            }
            while (array[highP] > pivot && lowP < highP) {
                highP --;
            }
            swap(array, lowP, highP);
        }
        swap(array, lowP, high);
        return  lowP;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
