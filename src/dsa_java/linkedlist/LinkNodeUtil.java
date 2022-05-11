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
        LinkNode<Integer> first1 = new LinkNode(10);
        LinkNode<Integer> first = new LinkNode(20);
        LinkNode<Integer> second = new LinkNode(30);
        LinkNode<Integer> third = new LinkNode(30);
        LinkNode<Integer> fourth = new LinkNode(20);
        LinkNode<Integer> fifth = new LinkNode(10);
        first1.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        return first1;
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

    public static <T> LinkNode reverseLinkedList(LinkNode head) {
        LinkNode prev = null;
        LinkNode current = head;
        LinkNode next = head;
        while (next != null) {
            next = next.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static  LinkNode findMiddleOfLinkedList(LinkNode head) {
        LinkNode slow = head;
        LinkNode fast = head;
        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkPalliandrome(LinkNode head) {
        LinkNode slow = head;
        LinkNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkNode secondhalf = null;
        LinkNode firsthalf = head;

        if(fast == null) {
                secondhalf = slow;
        } else {
            secondhalf = slow.next;
        }

        LinkNode reversesecondhalf = null;
        LinkNode previous = null;
        LinkNode current = secondhalf;
        LinkNode next = secondhalf;
        while (next != null) {
            next = next.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        reversesecondhalf = previous;

        printLinkedList(reversesecondhalf);

        while(reversesecondhalf != null && firsthalf != null) {
            if(reversesecondhalf.data != firsthalf.data) {
                return false;
            }
            reversesecondhalf = reversesecondhalf.next;
            firsthalf = firsthalf.next;
        }
        return true;
    }

}
