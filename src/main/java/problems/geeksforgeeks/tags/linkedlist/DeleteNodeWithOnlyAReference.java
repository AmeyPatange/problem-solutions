package problems.geeksforgeeks.tags.linkedlist;

import problems.geeksforgeeks.classes.Node;

public class DeleteNodeWithOnlyAReference {

	 void deleteNode(Node node)
	    {
	         if(node != null && node.next != null){
	             node.data = node.next.data;
	             node.next = node.next.next;
	         }
	    }
	
}
