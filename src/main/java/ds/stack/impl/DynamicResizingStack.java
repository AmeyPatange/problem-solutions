package ds.stack.impl;

import java.util.ArrayList;

import ds.stack.Stack;

public class DynamicResizingStack implements Stack{

	private ArrayList<Integer> arr = new ArrayList<>();
	
	@Override
	public void push(int x) {
		arr.add(x);
	}

	@Override
	public int peek() {
		return arr.get(arr.size() -1);
	}

	@Override
	public int pop() {
		int item  = arr.remove(arr.size() - 1);
		return item;
	}

	@Override
	public boolean isEmpty() {
		return arr.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int size() {
		return arr.size();
	}
	
	public void display() {
		System.out.println(arr);
	}
}
