package org.problem.solutions.geeksforgeeks.ds.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.problem.solutions.geeksforgeeks.algo.linkedlist.GetNthNodeFromEnd;
import org.problem.solutions.geeksforgeeks.algo.linkedlist.ReverseList;

public class SinglyLinkedListTest {
	
	@Test
	public void insertAtBeginning() {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
		Assertions.assertTrue(sll.isEmpty());
		
		Integer data = new Integer(100);
		sll.insertAtBeginning(data);
		Assertions.assertFalse(sll.isEmpty());
		Assertions.assertTrue(sll.search(data) == 1);
		Assertions.assertTrue(sll.deleteAtPosition(1));
		Assertions.assertTrue(sll.search(data) == -1);
	}
	
	@Test
	public void getNthNode() {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
		Assertions.assertTrue(sll.isEmpty());
		
		for(int i=1; i <= 100; i++) {
			sll.insertAtEnd(i);
		}
		
		for(int i=1; i <= 100; i++) {
			Assertions.assertTrue(sll.getNthNode(i) == i);
		}
		
		Assertions.assertNull(sll.getNthNode(0));
		Assertions.assertNull(sll.getNthNode(1000));
	}
	
	@Test
	public void getNthNodeFromEnd() {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
		for(int i=1; i <= 100; i++) {
			sll.insertAtEnd(i);
		}
		
		GetNthNodeFromEnd gnfe = new GetNthNodeFromEnd();
		for(int i= 100; i >=1; i--) {
			Assertions.assertTrue(gnfe.getNthFromEnd(sll, i) == 100 -i +1);
		}
	}
	
	@Test
	public void occurrencesTest() {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
		int data = 100;
		
		int i = 0;
		for(; i< 10; i++) {
			sll.insertAtBeginning(data);
		}
		sll.insertAtBeginning(200);
		sll.insertAtBeginning(300);
		sll.insertAtBeginning(400);
		
		Assertions.assertTrue(sll.occurrenceOf(data) == i);
	}
	
	@Test
	public void reverseTest() {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
		for(int i=0; i< 100; i++) {
			sll.insertAtBeginning(i);
		}
		
		ReverseList rev = new ReverseList();
		rev.reverseList(sll);
		for(int i=0; i< 100; i++) {
			Assertions.assertTrue(sll.getNthNode(i+1) == i);
		}
		
	}
	
}
