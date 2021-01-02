package org.problem.solutions.geeksforgeeks.algo.linkedlist;

import org.problem.solutions.geeksforgeeks.ds.linkedlist.OneWayNode;
import org.problem.solutions.geeksforgeeks.ds.linkedlist.SinglyLinkedList;

/**
 * Used to Sort Given Linked List
 * @author Amey
 *
 */
public class SortList {

	public <T> void mergeSort(SinglyLinkedList<T> list) {
		
		if(list.isEmpty() || null == list.getHead().getNext()) {
			return;
		}
		
		OneWayNode<T> newHead = merge(list.getHead());
		list.setHead(newHead);
	}
	
	private <T> OneWayNode<T> merge(OneWayNode<T> head){
		
		if(null == head.getNext())
			return head;
		
		OneWayNode<T> middleNode = new GetMiddleNode().getLeftMiddleElement(head);
		OneWayNode<T> rightHalf = middleNode.getNext();
		middleNode.setNext(null);
		
		OneWayNode<T> leftHalfList  = merge(head);
		OneWayNode<T> rightHalfList = merge(rightHalf);
		
		OneWayNode<T> sortedHead = mergeSort(leftHalfList, rightHalfList);
		
		return sortedHead;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <T> OneWayNode<T> mergeSort(OneWayNode<T> leftHalf , OneWayNode<T> rightHalf){
		
		OneWayNode<T> start = null;
		OneWayNode<T> temp = null;
		
		OneWayNode<T> leftCurr = leftHalf;
		OneWayNode<T> rightCurr= rightHalf;
		
		while(null != leftCurr && null != rightCurr) {
			
			if(((Comparable)leftCurr.getData()).compareTo(rightCurr.getData()) > 0) {
				if(null == start) {
					start = rightCurr;
					temp  = start;  
				}else {
					temp.setNext(rightCurr);
					temp = temp.getNext();
				}
				rightCurr = rightCurr.getNext();
			}
			else {
				if(null == start) {
					start = leftCurr;
					temp  = start;
				}else {
					temp.setNext(leftCurr);
					temp = temp.getNext();
				}
				leftCurr = leftCurr.getNext();
			}
			temp.setNext(null);
		}
		
		if(null != leftCurr) {
			temp.setNext(leftCurr);
		}
		if(null != rightCurr) {
			temp.setNext(rightCurr);
		}

		return start;
	}
}
