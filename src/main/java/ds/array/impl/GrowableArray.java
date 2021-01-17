package ds.array.impl;

import ds.array.AbstractArray;

public class GrowableArray<T> extends AbstractArray<T>{

	private T[] arr;
	
	private int capacity;
	private final int DEFAULT_SIZE = 10;
	private int numElements = 0;
	private int originalCapacity;
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public GrowableArray(Class<T> clzz) {
		this.arr = (T[])java.lang.reflect.Array.newInstance(clzz, DEFAULT_SIZE);
		this.capacity = this.originalCapacity =  DEFAULT_SIZE;
		this.clazz = clzz;
	}
	
	@SuppressWarnings("unchecked")
	public GrowableArray(Class<T> clzz, int initialCapacity) {
		if(capacity < 1) 
			throw new IllegalArgumentException("Array Size cannot be "+ initialCapacity);
		this.arr = (T[])java.lang.reflect.Array.newInstance(clzz, initialCapacity);
		this.capacity = this.originalCapacity =  initialCapacity;
		this.clazz = clzz;
	}
	
	@Override
	public boolean isEmpty() {
		return numElements == 0;
	}

	@Override
	public void traverseArr() {
		for(int i=0; i < numElements; i++) {
			System.out.print(arr[i]);
		}
	}

	@Override
	public boolean insertAtBeginning(T data) {
		if(numElements == capacity) {
			increaseCapacity();
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
			increaseCapacity();
		}
		
		arr[numElements++] = data;
		return true;
	}

	@Override
	public T getElementAt(int position) {
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
		
		if(isShrinkOfSizeRequired()) {
			decreaseCapacity();
		}
	}

	@Override
	public void removeLast() {
		if(isEmpty())
			return;
		
		arr[numElements -1] = null;
		numElements--;
		
		if(isShrinkOfSizeRequired()) {
			decreaseCapacity();
		}
	}
	
	@Override
	public int size() {
		return numElements;
	}

	@SuppressWarnings("unchecked")
	private void increaseCapacity() {
		System.out.println("Old Capacity " + capacity + " & New " + (capacity + (capacity >> 1)));
		capacity = capacity + (capacity >> 1);
		
		T[] newArr = (T[])java.lang.reflect.Array.newInstance(this.clazz, capacity);
		copyElements(arr, numElements, newArr);
		this.arr = newArr;
	}
	
	private void copyElements(T[] oldArr, int numElementsToBeCopied, T[] newArr) {
		for(int i=0; i < numElementsToBeCopied; i++) {
			newArr[i] = oldArr[i];
		}
	}
	
	private boolean isShrinkOfSizeRequired() {
		int halvedCapacity = capacity/2;
		if(numElements < halvedCapacity && halvedCapacity >= originalCapacity)
			return true;
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private void decreaseCapacity() {
		System.out.println("Old Capacity " + capacity + " & New Decreased " + (capacity /2));
		capacity = capacity/2 ;
		
		T[] newArr = (T[])java.lang.reflect.Array.newInstance(this.clazz, capacity);
		copyElements(arr, numElements, newArr);
		this.arr = newArr;
	}
}
