package ds.list.impl;

public class ListUtils {

	private ListUtils() {}
	
	public static <T> void reverseListInGroup(SinglyLinkedList<T> list, int k) {
		
		if(list.isEmpty())
			return;
		
		list.reverseInGroup(k);
	}
}
