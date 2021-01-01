package org.problem.solutions.geeksforgeeks.ds.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
