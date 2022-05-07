package dsa_java.techiedelight.linkedlist;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    Node next;
    int data;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class LinkedListToTree {
    static Node formLinkedList() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        return a;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void printTree(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print (root.data + "  ");
        printTree(root.left);
        printTree(root.right);
    }

    static TreeNode formTree(Node head) {
        Node temp = head;
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = new TreeNode(temp.data);
        queue.add(root);
        while(temp != null) {
            temp = temp.next;
            if(temp != null) {
                TreeNode leftNode = new TreeNode(temp.data);
                TreeNode front = queue.poll();
                front.left = leftNode;
                queue.add(leftNode);
                temp = temp.next;
                if(temp != null) {
                    TreeNode rightNode = new TreeNode(temp.data);
                    front.right = rightNode;
                    queue.add(rightNode);
                }
            }

        }
        return root;
    }

    public static void main(String[] args) {
        Node head = formLinkedList();
        printList(head);
        TreeNode root = formTree(head);
        printTree(root);
    }
}
