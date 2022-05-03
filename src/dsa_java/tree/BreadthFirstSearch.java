package dsa_java.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class NodeList {
    char val;
    NodeList left;
    NodeList right;

    NodeList(char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BreadthFirstSearch {
    public static void main(String[] args) {
        NodeList a = new NodeList('a');
        NodeList b = new NodeList('b');
        NodeList c = new NodeList('c');
        NodeList d = new NodeList('d');
        NodeList e = new NodeList('e');
        NodeList f = new NodeList('f');
        a.left  = b;
        a.right = c;
        b.left  = d;
        b.right = e;
        c.right  = f;
        List<Character> out = breadthFirstSearchIteration(a);
        System.out.println(out.toString());
    }

    private static List<Character> breadthFirstSearchIteration(NodeList a) {
       List<Character> output = new ArrayList<>();
       Queue<NodeList> queue = new LinkedList<>();
       queue.add(a);
       while(!queue.isEmpty()) {
           NodeList current = queue.remove();
           output.add(current.val);
           if(current.left != null) {
               queue.add(current.left);
           }
           if(current.right != null) {
               queue.add(current.right);
           }
       }
       return output;
    }
}
