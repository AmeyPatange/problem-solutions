package org.problem.solutions.geeksforgeeks.ds.linkedlist;

/**
 * Singly Linked List with only Head Pointer
 * @author Amey
 *
 * @param <T>
 */
public class SinglyLinkedList<T> {

	private OneWayNode<T> head;
	
	/**
	 * Adds Element at Head of Linked List
	 * It is O(1) operation
	 * @param data
	 */
	public void insertAtBeginning(T data) {
		head = getNewNode(data , head);
	}
	
	/**
	 * Adds Element at Tail of Linked List
	 * It is O(n) operation
	 * @param data
	 */
	public void insertAtEnd(T data) {
		if(isEmpty()) {
			insertAtBeginning(data);
			return;
		}
		
		OneWayNode<T> curr = head;
		while(null != curr.getNext()) {
			curr = curr.getNext();
		}
		
		curr.setNext(getNewNode(data, null));
	}
	
	/**Traverse and print list on console
	 */
	public void traverse() {
		if(isEmpty()) {
			System.err.println("List is Empty");
			return;
		}
		
		OneWayNode<T> curr = head;
		do {
			System.out.print(curr);
			curr = curr.getNext();
		}while(null != curr);
		System.out.println();
	}
	
	/**
	 * Delete Node at position x
	 * It is O(n) operation, when p >= number of nodes in Linked List(n)
	 * @return
	 */
	public boolean deleteAtPosition(int p) {
		if(p < 1 || isEmpty()) return false;
		
		if(p == 1) {
			head = head.getNext();
			return true;
		}
		
		OneWayNode<T> curr = head;
		int currPosition = 1;
		while(null != curr.getNext() && currPosition < p -1) {
			curr = curr.getNext();
			++currPosition;
		}
		
		if(null == curr.getNext())
			return false; //end of List
		
		curr.setNext(curr.getNext().getNext());
		return true;
	}
	
	/**
	 * @return The number of nodes in Linked List
	 */
	public int size() {
		
		if(isEmpty()) return 0;
		
		int nodes = 1;
		OneWayNode<T> curr = head;
		
		while(null != curr.getNext()) {
			curr = curr.getNext();
			nodes++;
		}
		return nodes;
	}
	
	/**
	 * Get the position an element to be searched in Linked List 
	 * @param data
	 * @return the position of first occurrence of T data in Linked List
	 * -1 if data not found
	 */
	public int search(T data) {
		
		if(isEmpty())return -1;
		
		OneWayNode<T> curr = head;
		int position = 1;
		
		do {
			if(curr.getData().equals(data)) {
				return position;
			}
			curr = curr.getNext();
			position++;
		}while(null != curr);
		
		return -1;
	}
	
	/**
	 * For given data T, finds number of occurrences in Linked List
	 * @param data
	 * @return Number of times data T occurs in Linked List
	 */
	public int occurrenceOf(T data) {
		
		if(isEmpty())
			return 0;
		
		OneWayNode<T> curr = head;
		int occur = 0;
		
		do {
			if(curr.getData().equals(data))
				occur++;
			
			curr = curr.getNext();
		}while(null != curr);
		
		return occur;
	}
	
	/**
	 * @param n
	 * @return data of nth position node
	 * NULL if position doesn't exist
	 */
	public T getNthNode(int n) {
		if(n <1 || isEmpty()) return null;
		
		OneWayNode<T> curr = head;
		int position  = 1;
		
		do {
			if(position == n)
				return curr.getData();
			curr = curr.getNext();
			position++;
		}while(null != curr);
		
		return null;
	}
	
	/**
	 * Removes all Elements of Linked List.
	 * It is O(1) operation
	 */
	public void clearAll() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	private OneWayNode<T> getNewNode(T data, OneWayNode<T> next){
		return new OneWayNode<T>(data, next);
	}
	
	public OneWayNode<T> getHead(){
		return head;
	}
	
	public void setHead(OneWayNode<T> head){
		this.head = head;
	}
}
