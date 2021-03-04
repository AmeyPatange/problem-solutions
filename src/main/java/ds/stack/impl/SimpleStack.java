package ds.stack.impl;

import ds.stack.Stack;

public class SimpleStack implements Stack{
	
	int[] arr;
	
	int top;
	
	int cap;
	
	public SimpleStack(int capacity) {
		arr = new int[capacity];
		top = -1;
		cap = capacity;
	}

	@Override
	public void push(int x) {
		if(isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		arr[++top] = x;
	}

	@Override
	public int peek() {
		if(isEmpty())
			return -1;
		return arr[top];
	}

	@Override
	public int pop() {
		if(isEmpty())
			return -1;
		int item = arr[top];
		top--;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top + 1 == cap;
	}

	@Override
	public int size() {
		return top + 1;
	}
	
	public void display() {
		
		if(isEmpty())
			return;
		
		for(int i = top; i > -1; i--) {
			System.out.print(arr[i] + "|");
		}
	}
	
}
