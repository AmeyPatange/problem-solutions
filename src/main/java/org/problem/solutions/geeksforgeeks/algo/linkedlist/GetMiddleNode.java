package org.problem.solutions.geeksforgeeks.algo.linkedlist;

import org.problem.solutions.geeksforgeeks.ds.linkedlist.OneWayNode;
import org.problem.solutions.geeksforgeeks.ds.linkedlist.SinglyLinkedList;

/**
 * Get middle node of Linked List
 * @author Amey
 *
 */
public class GetMiddleNode {

	/**
	 * Returns the Middle of List
	 * @param <T>
	 * @param list
	 * @return data T present in middle element of Linked List
	 * If in a List, there are two middle elements i.e the List contains even
	 * number of elements then return 2nd middle element
	 * If list contains odd number of elements then return middle
	 * NULL if list is empty
	 */
	public <T> T getMiddleElement(SinglyLinkedList<T> list) {
		
		if(list.isEmpty())return null;
		
		OneWayNode<T> fastRef = list.getHead();
		OneWayNode<T> slowRef = list.getHead();
		
		while(null != fastRef) {
			fastRef = fastRef.getNext();	
			if(null != fastRef) {
				fastRef = fastRef.getNext();
				slowRef = slowRef.getNext();
			}
		}
		return slowRef.getData();
	}
}
