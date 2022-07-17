package datastructureimpl.stackx;

import java.util.Arrays;

public class StackUsingArray {
    private int capacity;
    private int[] stack;
    private int top;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        stack = new int[this.capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity;
    }

    public int push(int data) {
        if(isFull())
            throw new ArrayIndexOutOfBoundsException("Push operation can not be performed. The stack size is full ");
        return stack[++top] = data;
    }

    public int pop() {
        if(isEmpty())
            throw new ArrayIndexOutOfBoundsException(" Pop operation cant be done ");
        return stack[top--];
    }

    public String toString() {
        for(int i=0; i<top; i++) {
            System.out.println(stack[i]);
        }
        return "StackUsingArray{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(3);
        stack.push(1);
        stack.push(12);
        stack.push(11);
        stack.pop();
        stack.push(12);
        stack.pop();

        System.out.println(stack);
    }

}
