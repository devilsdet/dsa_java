package dsa_java.linkedlist;

public final class LinkNodeUtil {
    private LinkNodeUtil(){}

    public static void printLinkedList(LinkNode head) {
        LinkNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static LinkNode<Integer> createIntegerLinkedList() {
        LinkNode<Integer> first = new LinkNode(20);
        LinkNode<Integer> second = new LinkNode(30);
        LinkNode<Integer> third = new LinkNode(40);
        LinkNode<Integer> fourth = new LinkNode(50);
        LinkNode<Integer> fifth = new LinkNode(60);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        return first;
    }

    public static <T> LinkNode<T> insertAtBegining(LinkNode<T> head, T data) {
        LinkNode<T> newNode = new LinkNode<>(data);
        if(head == null) {
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    public static <T> LinkNode<T> insertAtEnd(LinkNode<T> head, T data) {
        LinkNode<T> newNode = new LinkNode<>(data);
        if(head == null) {
            return newNode;
        }
        LinkNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

}
