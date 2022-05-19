package dsa_java.queu.priorityq;

import java.util.PriorityQueue;

public class PriorotiyQExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(21);
        pq.add(18);
        pq.add(23);
        pq.add(2);
        System.out.println(pq.toString());
    }
}
