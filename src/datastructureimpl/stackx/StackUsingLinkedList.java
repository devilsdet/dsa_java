package datastructureimpl.stackx;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    Node head;

    public void push(int data){
        Node temp = new Node(data);
        if(this.head == null) {
            temp = head;
        }
    }

}
