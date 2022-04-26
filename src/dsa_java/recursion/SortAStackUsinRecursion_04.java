package dsa_java.recursion;

import java.util.Stack;

public class SortAStackUsinRecursion_04 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(32);
		stack.push(45);
		stack.push(78);
		stack.push(31);
		stack.push(12);
		System.out.println(" Before Sorting " + stack.toString());
		sort(stack);
		System.out.println(" After Sorting " + stack.toString());
	}

	private static Stack<Integer> sort(Stack<Integer> stack) {
		if(stack.size() == 1) {
			return stack;
		} 
		int element = stack.pop();
		stack = sort(stack);
		insert(stack, element);
		return stack;
	}
	
	private static Stack<Integer> insert(Stack<Integer> stack, int temp) {
		if(stack.isEmpty() || stack.peek() <= temp) {
			stack.push(temp);
			return stack;
		}
		int value = stack.pop();
		stack = insert(stack, temp);
		stack.push(value);
		return stack;
	}
	
	
}
