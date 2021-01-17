package test.ds.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ds.array.impl.FixedSizeArray;

public class FixedSizeArrayTest {

	@Test
	public void testInsertAtBeginning() {
		
		int capacity = 100;
		FixedSizeArray<Integer> arr = new FixedSizeArray<>(Integer.class, capacity);
		Assertions.assertTrue(arr.isEmpty());
		for(int i= 1; i <= capacity; i++) {
			arr.insertAtBeginning(i);
		}
		
		Assertions.assertFalse(arr.isEmpty());
		for(int i= capacity; i > 0; i--) {
			Assertions.assertEquals(i, arr.get(100 - i + 1)); 
		}
	}
	
	@Test
	public void testInsertAtEnd() {
		
		int capacity = 100;
		FixedSizeArray<Integer> arr = new FixedSizeArray<>(Integer.class, capacity);
		Assertions.assertTrue(arr.isEmpty());
		for(int i= 1; i <= capacity; i++) {
			arr.insertAtEnd(i);
		}
		Assertions.assertFalse(arr.isEmpty());
		for(int i= 1; i <= capacity ; i++) {
			Assertions.assertEquals(i, arr.get(i)); 
		}
	}
	
	@Test
	public void testRemoveFirst() {
		int capacity = 100;
		FixedSizeArray<Integer> arr = new FixedSizeArray<>(Integer.class, capacity);
		Assertions.assertTrue(arr.isEmpty());
		
		for(int i= 1; i <= capacity; i++) {
			arr.insertAtEnd(i);
		}
		for(int i= 1; i < capacity; i++) {
			arr.removeFirst();
			Assertions.assertEquals(i + 1, arr.get(1));
		}
	}
	
	@Test
	public void testRemoveLast() {
		int capacity = 100;
		FixedSizeArray<Integer> arr = new FixedSizeArray<>(Integer.class, capacity);
		Assertions.assertTrue(arr.isEmpty());
		
		for(int i= 1; i <= capacity; i++) {
			arr.insertAtEnd(i);
		}
		
		for(int i= capacity; i >= 1; i--) {
			Assertions.assertEquals(i ,arr.get(i));
			arr.removeLast();
			Assertions.assertNull(arr.get(i));
		}
	}
	
}
