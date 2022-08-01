package dsa_java.fast_slow_pointer;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CyclicLinkedList_01 {
    Node head;

    public void displayLL() {
        Node temp = this.head;
        while (temp != null && temp.next !=  head) {
            System.out.print(temp.data + "------>");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        CyclicLinkedList_01 ll = new CyclicLinkedList_01();
        ll.head = new Node(1);
        Node A = new Node(2);
        Node B = new Node(3);
        Node C = new Node(4);
        Node D = new Node(5);
        Node E = new Node(6);
        ll.head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = D;
        ll.displayLL();
    }
}
