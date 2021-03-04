package test.ds.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ds.array.impl.ArrayUtils;
import ds.array.impl.FixedSizeArray;

public class ArrayUtilsTest {

	@Test
	public void testBinarySearch() {
		
		int capacity = 100;
		FixedSizeArray<Integer> arr = new FixedSizeArray<>(Integer.class, capacity);
		Assertions.assertTrue(arr.isEmpty());
		for(int i= 1; i <= capacity; i++) {
			arr.insertAtEnd(i);
		}
		
		int index = ArrayUtils.binarySearch(arr, 43);
		Assertions.assertTrue(index == 42);
		
		index = ArrayUtils.binarySearch(arr, 23);
		Assertions.assertTrue(index == 22);
		
		index = ArrayUtils.binarySearch(arr, 123);
		Assertions.assertTrue(index == -1);
		
	}
	
	@Test
	public void testBinarySearchComp() {
		
		int capacity = 100;
		FixedSizeArray<Integer> arr = new FixedSizeArray<>(Integer.class, capacity);
		Assertions.assertTrue(arr.isEmpty());
		for(int i= 1; i <= capacity; i++) {
			arr.insertAtEnd(i);
		}
		
		int index = ArrayUtils.binarySearch(arr, 43, (i1, i2) ->  i1.compareTo(i2) );
		Assertions.assertTrue(index == 42);
		
		index = ArrayUtils.binarySearch(arr, 23, (i1, i2) ->  i1.compareTo(i2));
		Assertions.assertTrue(index == 22);
		
		index = ArrayUtils.binarySearch(arr, 123, (i1, i2) ->  i1.compareTo(i2));
		Assertions.assertTrue(index == -1);
		
	}
}
