package test.ds.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ds.stack.impl.DynamicResizingStack;
import ds.stack.impl.SimpleStack;

public class DynamicResizingStackTest {

	@Test
	public void testForEdgeConditions() {
		
		DynamicResizingStack ss = new DynamicResizingStack();
		
		Assertions.assertTrue(ss.size() == 0);
		Assertions.assertTrue(ss.isEmpty());
		Assertions.assertFalse(ss.isFull());
	}
	
	@Test
	public void testForPushOperations() {
		
		int elements = 10;
		DynamicResizingStack ss = new DynamicResizingStack();
		
		for(int i=1; i < elements; i++) {
			ss.push(i);
			Assertions.assertTrue(!ss.isFull());
			Assertions.assertEquals(i, ss.peek());
		}
	}
	
	@Test
	public void testForPop() {
		
		int elements = 10;
		DynamicResizingStack ss = new DynamicResizingStack();
		
		for(int i=1; i <= elements; i++) {
			ss.push(i);
			Assertions.assertEquals(i, ss.peek());
		}
		ss.display();
		for(int i=elements; i > 0; i--) {
			Assertions.assertEquals( i, ss.pop());
		}
	}
}
