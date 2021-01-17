package ds.array.impl;

import ds.array.Array;

/**
 * FixedSizeArray is not Growable in Nature.
 * It should be used when size of Array is well known.
 * @author Amey
 *
 * @param <T>
 */
public class FixedSizeArray<T> implements Array<T>{

	private T arr[];
	
	private final int DEFAULT_SIZE = 10;
	private int capacity = 0;
	private int numElements = 0;
	
	@SuppressWarnings("unchecked")
	public FixedSizeArray(Class<T> cls){
		this.arr = (T[])java.lang.reflect.Array.newInstance(cls, DEFAULT_SIZE);
		this.capacity = DEFAULT_SIZE;
	}

	@SuppressWarnings("unchecked")
	public FixedSizeArray(Class<T> cls, int capacity){
		if(capacity < 1) 
			throw new IllegalArgumentException("Array Size cannot be "+ capacity);
		this.arr = (T[])java.lang.reflect.Array.newInstance(cls, capacity);
		this.capacity = capacity;
	}
	
	@Override
	public boolean insertAtBeginning(T data) {
		if(numElements == capacity) {
			return false;
		}
		
		for(int i= this.numElements; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = data;
		numElements++;
		
		return true;
	}

	@Override
	public boolean insertAtEnd(T data) {
		if(numElements == capacity) {
			return false;
		}
		
		arr[numElements++] = data;
		return true;
	}

	@Override
	public boolean isEmpty() {
		return this.numElements == 0;
	}

	@Override
	public void traverse() {
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return;
		}
		
		for(int i=0; i < numElements; i++) {
			System.out.print(arr[i]);
		}
	}

	@Override
	public T get(int position) {
		if(position < 1 || position > numElements)
			return null;
		
		return arr[position -1];
	}

	@Override
	public void removeFirst() {
		if(isEmpty())
			return;
		
		int i=0;
		for(; i < numElements -1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = null;
		numElements--;
	}

	@Override
	public void removeLast() {
		if(isEmpty())
			return;
		
		arr[numElements -1] = null;
		numElements--;
	}
}
