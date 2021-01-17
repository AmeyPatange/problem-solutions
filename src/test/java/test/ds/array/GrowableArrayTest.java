package test.ds.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ds.array.impl.GrowableArray;

public class GrowableArrayTest {
	
	@Test
	public void testInsertAtBeginning() {
		
		int maxElements = 100;
		GrowableArray<Integer> arr = new GrowableArray<>(Integer.class);
		Assertions.assertTrue(arr.isEmpty());
		for(int i= 1; i <= maxElements; i++) {
			arr.insertAtBeginning(i);
		}
		
		Assertions.assertFalse(arr.isEmpty());
		for(int i= maxElements; i > 0; i--) {
			Assertions.assertEquals(i, arr.get(maxElements - i + 1)); 
		}
	}
	
	@Test
	public void testInsertAtEnd() {
		
		int maxElements = 100;
		GrowableArray<Integer> arr = new GrowableArray<>(Integer.class);
		Assertions.assertTrue(arr.isEmpty());
		for(int i= 1; i <= maxElements; i++) {
			arr.insertAtEnd(i);
		}
		Assertions.assertFalse(arr.isEmpty());
		for(int i= 1; i <= maxElements ; i++) {
			Assertions.assertEquals(i, arr.get(i)); 
		}
	}
	
	@Test
	public void testRemoveFirst() {
		int maxElements = 100;
		GrowableArray<Integer> arr = new GrowableArray<>(Integer.class);
		Assertions.assertTrue(arr.isEmpty());
		
		for(int i= 1; i <= maxElements; i++) {
			arr.insertAtEnd(i);
		}
		for(int i= 1; i < maxElements; i++) {
			arr.removeFirst();
			Assertions.assertEquals(i + 1, arr.get(1));
		}
	}
	
	@Test
	public void testRemoveLast() {
		int maxElements = 100;
		GrowableArray<Integer> arr = new GrowableArray<>(Integer.class);
		Assertions.assertTrue(arr.isEmpty());
		
		for(int i= 1; i <= maxElements; i++) {
			arr.insertAtEnd(i);
		}
		
		for(int i= maxElements; i >= 1; i--) {
			Assertions.assertEquals(i ,arr.get(i));
			arr.removeLast();
			Assertions.assertNull(arr.get(i));
		}
	}
}
