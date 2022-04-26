package dsa_java.recursion;

import java.util.Stack;

public class DeleteMiddleEleemntInStack_06 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(32);
		stack.push(45);
		stack.push(78);
		stack.push(31);
		stack.push(12);
		int middleElement = (stack.size()/2) + 1;
		
		System.out.println(" Before Deleting " + stack.toString());
		deleteMiddleElement(stack, middleElement);
		System.out.println(" After Deleting " + stack.toString());

	}

	private static Stack<Integer> deleteMiddleElement(Stack<Integer> stack, int middleElement) {
		if(middleElement == 1) {
			stack.pop();
			return stack;
		} 
		int value = stack.pop();
		stack = deleteMiddleElement(stack, middleElement-1);
		stack =  insert(stack, value);
		return stack;
	}

	private static Stack<Integer> insert(Stack<Integer> stack, int value) {
			stack.push(value);
			return stack;
		
	}

}
