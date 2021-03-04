package ds.array.impl;

import java.util.Comparator;

import ds.array.AbstractArray;

/**
 * FixedSizeArray is not Growable in Nature.
 * It should be used when size of Array is well known.
 * @author Amey
 *
 * @param <T>
 */
public class FixedSizeArray<T> extends AbstractArray<T>{

	private T arr[];
	
	private final int DEFAULT_SIZE = 10;
	private final int capacity;
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
	public void traverseArr() {
		for(int i=0; i < numElements; i++) {
			System.out.print(arr[i]);
		}
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
	}

	@Override
	public void removeLast() {
		if(isEmpty())
			return;
		
		arr[numElements -1] = null;
		numElements--;
	}
	
	@Override
	public int size() {
		return numElements;
	}
	
	public int binarySearch(T searchElement, Comparator<T> comparator) {
	
		int low = 0, high = numElements -1;
		
		while(low <= high) {
			
			int mid = (low + high) >>> 1;
			int result = comparator.compare(arr[mid], searchElement);
			if(result == 0)
				return mid;
			if(result < 0)
				low = mid +1;
			else 
				high = mid -1;
		}
		return -1;
	}

	public <K extends Comparable<?> >int binarySearch(K searchElement) {
		
		int low = 0, high = numElements -1;
		
		while(low <= high) {
			
			int mid = (low + high) >>> 1;
			@SuppressWarnings("unchecked")
			int result = ((Comparable<K>)arr[mid]).compareTo(searchElement);
			if(result == 0)
				return mid;
			if(result < 0)
				low = mid +1;
			else 
				high = mid -1;
		}
		return -1;
	}
}
