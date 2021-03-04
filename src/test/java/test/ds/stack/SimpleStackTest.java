package test.ds.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ds.stack.impl.SimpleStack;

public class SimpleStackTest {

	@Test
	public void testForEdgeConditions() {
		
		int capacity = 10;
		SimpleStack ss = new SimpleStack(capacity);
		
		Assertions.assertTrue(ss.size() == 0);
		Assertions.assertTrue(ss.isEmpty());
		Assertions.assertFalse(ss.isFull());
	}
	
	@Test
	public void testForPushOperations() {
		
		int capacity = 10;
		SimpleStack ss = new SimpleStack(capacity);
		
		for(int i=1; i < capacity; i++) {
			ss.push(i);
			Assertions.assertTrue(!ss.isFull());
			Assertions.assertEquals(i, ss.peek());
		}
		
		ss.push(100);
		Assertions.assertTrue(ss.isFull());
	}
	
	@Test
	public void testForPop() {
		
		int capacity = 10;
		SimpleStack ss = new SimpleStack(capacity);
		
		for(int i=1; i <= capacity; i++) {
			ss.push(i);
			Assertions.assertEquals(i, ss.peek());
		}
		ss.display();
		for(int i=capacity; i > 0; i--) {
			Assertions.assertEquals( i, ss.pop());
		}
	}
}
