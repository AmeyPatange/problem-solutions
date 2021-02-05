package test.ds.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ds.list.impl.ListUtils;
import ds.list.impl.SinglyLinkedList;

public class SinglyLinkedListAddedOperations {

	@Test
	public void reverseInGrp() {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		Assertions.assertTrue(list.isEmpty());
		
		for(int i=1; i <= 97; i++) {
			list.insertAtEnd(i);
		}
		list.traverse();
		
		ListUtils.reverseListInGroup(list, 1);
		
		list.traverse();
		
	}
}
