package dsa_java.recursion;

import java.util.Stack;

public class ReverseAStackUsingRecursion_09 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        System.out.println(stack.toString());
        reverseStack(stack);
        System.out.println(stack.toString());
    }

    private static void reverseStack(Stack<Character> stack) {
        if( stack.size() == 1 ) return;
        Character top = stack.pop();
        reverseStack(stack);
        insertAtTheEnd(stack, top);
    }

    private static void insertAtTheEnd(Stack<Character> stack, Character top) {
        if(stack.size() == 0) {
            stack.push(top);
            return;
        }
        Character topE = stack.pop();
        insertAtTheEnd(stack, top);
        stack.push(topE);

    }
}
