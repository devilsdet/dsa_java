package dsa_java.linkedlist.sort;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class BubbleSortLL {
    public static void main(String[] args) {
        Node head = new Node(12);
        Node a = new Node(1);
        Node b = new Node(23);
        head.next = a;
        a.next = b;
        displayLinkedList(head);
        sortLL(head);
    }


    private static void sortLL(Node head) {
        int length = calculate(head);
        Node temp = head;
        for(int i = 0; i < length; i++) {

        }

    }

    private static int calculate(Node head) {
        Node temp = head;
        int length = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    private static void displayLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
