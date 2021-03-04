package ds.array.impl;

import java.util.Comparator;

public class ArrayUtils {

	private ArrayUtils() {}
	
	public static <T> int binarySearch(FixedSizeArray<T> arr, T searchElement, Comparator<T> comparator) {
		
		if(arr.isEmpty())
			return -1;
		
		return arr.binarySearch(searchElement, comparator);
	}
	
	public static <T extends Comparable<?>> int binarySearch(FixedSizeArray<T> arr, T searchElement) {
		
		if(arr.isEmpty())
			return -1;
		
		return arr.binarySearch(searchElement);
	}
}
