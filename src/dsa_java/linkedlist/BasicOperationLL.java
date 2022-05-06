package dsa_java.linkedlist;

public class BasicOperationLL {
    public static void main(String[] args) {
        LinkNode<Integer> head = LinkNodeUtil.createIntegerLinkedList();
        LinkNodeUtil.printLinkedList(head);
        LinkNode<Integer> newNode = LinkNodeUtil.insertAtBegining(head, 10);
        LinkNodeUtil.printLinkedList(newNode);
        LinkNode<Integer> newNode1 = LinkNodeUtil.insertAtEnd(head, 10);
        LinkNodeUtil.printLinkedList(newNode1);
    }
}
