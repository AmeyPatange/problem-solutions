package test.ds.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ds.list.impl.SinglyLinkedList;

public class SinglyLinkedListBasicTest {

	@Test
	public void testGet() {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		Assertions.assertNull(list.get(0));
		Assertions.assertNull(list.get(10));
		
		Integer i = new Integer(200);
		list.insertAtBeginning(i);
		Assertions.assertTrue(list.get(1) == i);
	}
	
	@Test
	public void testInsertAtStart() {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		Assertions.assertTrue(list.isEmpty());
		
		Integer i = new Integer(200);
		list.insertAtBeginning(i);
		Assertions.assertFalse(list.isEmpty());
		
		Assertions.assertTrue(list.get(1) == i);
		
		int c = 1;
		for(; c < 1000; c++) {
			list.insertAtBeginning(c);
		}
		for(--c; c >= 1; c--) {
			Assertions.assertEquals(c, list.get(1000 - c));
		}
	}
	
	@Test
	public void testInsertAtEnd() {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		Assertions.assertTrue(list.isEmpty());
		
		Integer i = new Integer(200);
		list.insertAtEnd(i);
		Assertions.assertFalse(list.isEmpty());
		Assertions.assertTrue(list.get(1) == i);
		
		int c = 2;
		for(; c < 1000; c++) {
			list.insertAtEnd(c);
		}
		
		for(--c; c >= 2; c--) {
			Assertions.assertEquals(c, list.get(c));
		}
	}
	
	@Test
	public void testDeleteFirst() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		
		for(int i=1; i <= 100; i++) {
			list.insertAtEnd(i);
		}
		
		for(int i=1; i <= 99; i++) {
			list.removeFirst();
			Assertions.assertEquals(list.get(1), i +1);
		}
		
		list.removeFirst();
		Assertions.assertTrue(list.isEmpty());
	}
	
	@Test
	public void testDeleteLast() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		for(int i=1; i <= 100; i++) {
			list.insertAtBeginning(i);
		}
		
		for(int i=1; i <= 100; i++) {
			Assertions.assertTrue(list.get(100 - i + 1) == i);
			list.removeLast();
			Assertions.assertTrue(list.get(100 - i + 1) == null);
		}
		
	}
}
