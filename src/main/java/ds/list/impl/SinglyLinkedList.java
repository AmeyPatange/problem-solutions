package ds.list.impl;

import java.util.Objects;
import ds.list.AbstractList;

/**
 * Implementation of Linked List Data structure
 * Contains only Head Pointer
 * @author Amey
 */
public class SinglyLinkedList<T> extends AbstractList<T>{

	private Node<T> head;
	/**
	 * One Way Node
	 * @param <T>
	 */
	private class Node<T>{
		
		private T data;
		private Node<T> next;
		
		Node(T data){
			this.data = data;
		}
		
		Node(T data, Node<T> next){
			this(data);
			this.next = next;
		}
		
		void setData(T data){ this.data = data;}
		
		T getData() { return this.data;}
		
		void setNext(Node<T> next) { this.next = next;}
		
		Node<T> getNext(){ return this.next;}

		@Override
		public String toString() {
			return "Node [data=" + data + "] -->";
		}	
		
	}
	
	@Override
	public boolean isEmpty() {
		return Objects.isNull(head);
	}
	
	@Override
	protected void traverseNonEmptyList() {
		Node<T> curr = head;
		do {
			System.out.println(curr);
			curr = curr.getNext();
		}while(null != curr);
	}
	
	@Override
	public void insertAtBeginning(T data) {
		Node<T> newNode = new Node<>(data, head);
		head = newNode;
	}
	
	@Override
	public void insertAtEnd(T data) {
		if(isEmpty()) {
			insertAtBeginning(data);
			return;
		}
		Node<T> newNode = new Node<>(data);
		Node<T> curr = head;
		
		while(null != curr.getNext()) {
			curr = curr.getNext();
		}
		curr.setNext(newNode);
	}
	
	@Override
	protected T getElementAt(int position) {
		
		int currPos = 1;
		Node<T> curr = head;
		
		do {
			if(currPos == position)
				return curr.getData();
			curr = curr.getNext();
			currPos++;
		}while(null != curr);
		
		return null;
	}

	@Override
	public void removeFirst() {
		if(isEmpty())
			return;
		
		head = head.getNext();
	}

	@Override
	public void removeLast() {
		if(isEmpty())
			return;
		
		if(null == head.getNext()) {
			head = null;
			return;
		}
		
		Node<T> curr = head;
		while(null != curr.getNext().getNext()) {
			curr = curr.getNext();
		}
		curr.getNext().setData(null);
		curr.setNext(null);
	}
	
	/**
	 * Used to Reverse in Group of K Elements
	 * 
	 * If Linked List is 
	 * h -> 1 -> 2 -> 3 -> 4 -> 5 
	 * k = 2
	 * 
	 * Then Reversed List will look like
	 * h -> 2 -> 1 -> 4 -> 3 -> 5
	 */
	void reverseInGroup(int k) {
		
		Node<T> curr = head, newHead = null;
		boolean isFirstGrp = true;
		Node<T> prevFirst = head;
		while(null != curr) {
			Node<T> firstInGrp = curr;
			Node<T> prev = null;
			int currGrp = 0;
			
			while(null != curr && currGrp < k) {
				Node<T> next = curr.getNext();
				curr.setNext(prev);
				prev = curr;
				curr = next;
				currGrp++;
			}
			
			if(isFirstGrp) {
				isFirstGrp = false;
				newHead = prev;
			}else {
				prevFirst.setNext(prev);
				prevFirst = firstInGrp;
			}
			
		}
		
		head = newHead;
	}
	
	
}
