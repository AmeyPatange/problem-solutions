package org.problem.solutions.geeksforgeeks.ds.linkedlist;

/**
 * Node of Singly Linked List
 * @author Amey
 *
 * @param <T> Type T
 */
public class OneWayNode<T> {

	private T data;
	
	private OneWayNode<T> next;
	
	OneWayNode(T data){
		this.data = data;
	}
	
	OneWayNode(T data, OneWayNode<T> next){
		this.data = data;
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @return the next
	 */
	public OneWayNode<T> getNext() {
		return next;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(OneWayNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return " [data=" + data + "] -->";
	}
	
	
}
