package org.problem.solutions.geeksforgeeks.algo.linkedlist;

import org.problem.solutions.geeksforgeeks.ds.linkedlist.OneWayNode;
import org.problem.solutions.geeksforgeeks.ds.linkedlist.SinglyLinkedList;

public class ReverseList {

	/**
	 * Used to reverse a Linked List
	 * @param list
	 */
	public <T> void reverseList(SinglyLinkedList<T> list) {
		
		if(list.isEmpty())
			return;
		
		OneWayNode<T> prev = null;
		OneWayNode<T> curr = list.getHead();
		OneWayNode<T> next = null;
		
		do {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}while(null != curr);
		
		list.setHead(prev);
	}
}
