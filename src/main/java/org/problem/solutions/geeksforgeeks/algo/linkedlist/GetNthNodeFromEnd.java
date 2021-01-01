package org.problem.solutions.geeksforgeeks.algo.linkedlist;

import org.problem.solutions.geeksforgeeks.ds.linkedlist.OneWayNode;
import org.problem.solutions.geeksforgeeks.ds.linkedlist.SinglyLinkedList;

/**
 * Get nth node from end of Linked List
 * @author Amey
 *
 */
public class GetNthNodeFromEnd{

	/**
	 * Get nth node from end of Singly Linked List
	 * @param <T>
	 * @param list
	 * @param n shhould be greater than 0
	 * @return Nth node from end
	 * NULL if list is empty or Number of element in List < @param n
	 */
	public <T> T getNthFromEnd(SinglyLinkedList<T> list, int n) {
		
		if(n < 1 || list.isEmpty()) return null;
		
		OneWayNode<T> fastRef = list.getHead();
		int pos = 1;
		
		while(fastRef != null && pos < n) {
			fastRef = fastRef.getNext();
			pos++;
		}
		
		if(null == fastRef) return null;//n is more than number of Elements in list
		
		OneWayNode<T> slowRef = list.getHead();
		while(null != fastRef.getNext()) {
			fastRef = fastRef.getNext();
			slowRef = slowRef.getNext();
		}
		
		return slowRef.getData();
	}
}
