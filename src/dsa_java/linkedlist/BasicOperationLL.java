package dsa_java.linkedlist;

public class BasicOperationLL {
    public static void main(String[] args) {
        LinkNode<Integer> head = LinkNodeUtil.createIntegerLinkedList();
//        LinkNodeUtil.printLinkedList(head);
//        LinkNode<Integer> newNode = LinkNodeUtil.insertAtBegining(head, 10);
//        LinkNodeUtil.printLinkedList(newNode);
//        LinkNode<Integer> newNode1 = LinkNodeUtil.insertAtEnd(head, 10);
//        LinkNodeUtil.printLinkedList(newNode1);
//        LinkNode<Integer> newNode2 = LinkNodeUtil.reverseLinkedList(newNode1);
//        LinkNodeUtil.printLinkedList(newNode2);
//        LinkNode<Integer> newNode3 = LinkNodeUtil.findMiddleOfLinkedList(newNode2);
        LinkNodeUtil.printLinkedList(head);
        System.out.println(LinkNodeUtil.checkPalliandrome(head));
    }
}
