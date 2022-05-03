package dsa_java.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    char val;
    Node left;
    Node right;

    Node(char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');
        Node f = new Node('f');

        a.left  = b;
        a.right = c;
        b.left  = d;
        b.right = e;
        c.right  = f;
        depthFirstSearchRecursiveWay(a);
        // System.out.println(dfsoutput.toString());
    }

    private static List<Character> depthFirstSearchIterativeMode(Node root) {
        List<Character> output = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node current = stack.pop();
            output.add(current.val);
            if(current.right !=null)
                stack.push(current.right);
            if(current.left != null )
                stack.push(current.left);

        }
        return output;
    }

    public static void depthFirstSearchRecursiveWay(Node root) {
        if(root == null )
            return ;
        System.out.print(root.val);
        depthFirstSearchRecursiveWay(root.left);
        depthFirstSearchRecursiveWay(root.right);
    }

}
