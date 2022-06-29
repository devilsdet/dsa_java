package dsa_java.stack.leetcode;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "[][]{{(())}}{}";
        System.out.println(checkIfBalanced(s));
    }

    private static boolean checkIfBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(char paranthesis: s.toCharArray()) {
            switch (paranthesis) {
                case '(':
                case '{':
                case '[':
                    stack.push(paranthesis);
                    break;
                case ')':
                case '}':
                case ']':
                    if(stack.isEmpty()) {
                        return false;
                    }
                    char ch = stack.pop();
                    if((ch == '(' && paranthesis != ')') ||
                            (ch == '{' && paranthesis != '}') ||
                            (ch == '[' && paranthesis != ']')) {
                        return false;
                    }
                    break;
                default:
                    System.out.println("Invalid character entered " + paranthesis);
                    return false;

            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
