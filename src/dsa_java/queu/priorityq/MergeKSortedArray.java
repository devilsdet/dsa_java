package dsa_java.queu.priorityq;

import java.util.PriorityQueue;
import java.util.Queue;

class ElementX {
    int val;

    ElementX(int val) {
        this.val = val;
    }
}

public class MergeKSortedArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {2, 4, 6}, {8, 89, 99, 1000},{0, 8, 9, 10, 11}};
        mergeKSortedArray(arr);
    }

    private static void mergeKSortedArray(int[][] arr) {
        int totalLength = arr.length;
        int totalsize = 0;
        Queue<ElementX> pq = new PriorityQueue<>((a, b) -> a.val-b.val);

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                pq.add(new ElementX(arr[i][j]));
                totalsize++;
            }
        }
        int[] res = new int[totalsize];
        int j = 0;
        while (!pq.isEmpty()) {
            res[j] = pq.poll().val;
            j++;
        }

        for(int i=0; i<j; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
