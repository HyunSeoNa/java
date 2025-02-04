package com.nahs.study;

import java.util.Stack;

/**
 * fileName     : StackEx
 * author       : HyunSeo Na
 * date         : 2025-02-04
 * description  : 스택 예제
 */
public class StackEx {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("Top : " + stack.peek());        // 9

        stack.pop();
        stack.pop();

        System.out.println("Top : " + stack.peek());        // 7
        System.out.println("Pop : " + stack.pop());         // 7
        System.out.println("Stack is empty : " + stack.isEmpty());  // false

        stack.clear();
        System.out.println("Stack is empty : " + stack.isEmpty());  // true

        /* Custom Stack */
        System.out.println("## Custom Stack ##");
        CustomStack customStack = new CustomStack(10);
        for(int i = 10; i > 0; i--) {
            customStack.push(i);
        }

        System.out.println("Top : " + customStack.peek());
        System.out.println("Pop : " + customStack.pop());
        System.out.println("Stack is empty : " + customStack.isEmpty());

    }
}

class CustomStack {
    private int[] arr;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if(top == capacity - 1) {
            throw new RuntimeException("Stack is full");
        }
        arr[++top] = data;
    }

    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return arr[top--];
    }

    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }
}
