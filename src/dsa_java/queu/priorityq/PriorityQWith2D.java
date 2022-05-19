package dsa_java.queu.priorityq;

import java.util.PriorityQueue;
class Element {
    int val;
    int row;
    int col;

    Element(int val, int row, int col) {
        this.val = val;
        this.row = row;
        this.col = col;
    }
}
public class PriorityQWith2D {
    public static void main(String[] args) {
        int[][] inputarray = {{1, 3, 8}, {4, 5, 6}, {9, 8, 2}};

        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> {return a.val - b.val;});

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                pq.add(new Element(inputarray[i][j], i, j));
            }
        }


        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                Element e = pq.poll();
                System.out.print("" + e.row + e.col + "  ");
            }
            System.out.println();
        }
    }
}
