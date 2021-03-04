package problems.geeksforgeeks.tags.linkedlist;

import problems.geeksforgeeks.classes.Node;

public class IntersectionPoint {

	int intersectPoint(Node head1, Node head2)
	{
        if(head1 == null || head2 == null)
        	return -1;
		
        int nodeCount1 = getCountOfNodes(head1);
        int nodeCount2 = getCountOfNodes(head2);
        
        Node oneCurr = moveAhead(head1, nodeCount1 - nodeCount2);
        Node twoCurr = moveAhead(head2, nodeCount2 - nodeCount1);
        
        while(oneCurr != null && twoCurr != null) {
        	
        	if(oneCurr == twoCurr) {
        		return oneCurr.data;
        	}
        	
        	oneCurr = oneCurr.next;
        	twoCurr = twoCurr.next;
        }
        
        return -1;
	}
	
	Node moveAhead(Node head, int by) {
		Node curr = head;
		if(by > 0 && head != null) {
			int pos = 0;
			do {
				curr = curr.next;
				pos++;
			}while(pos < by && curr != null);
		}
		return curr;
	}
	
	int getCountOfNodes(Node head) {
		
		int nodeCount = 0;
        Node curr = head;
        
        while(curr != null) {
        	nodeCount++;
        	curr = curr.next;
        }
        
        return nodeCount;
	}
}
