package problems.geeksforgeeks.tags.linkedlist;

import problems.geeksforgeeks.classes.Node;

public class SegregateEvenNOdd {

	Node divide(int N, Node head){
        
		if(head == null || head.next == null) {
			return head;
		}
		
		Node evenHead = null, evenTemp = null;
		Node oddHead = null, oddTemp = null;
		
		Node curr = head;
		
		while(curr != null) {
			
			if((curr.data & 1) == 0) {
				//current is even node
				if(evenHead == null) {
					evenHead = curr;
					evenTemp = evenHead;
				}else {
					evenTemp.next = curr;
					evenTemp = evenTemp.next; 
				}
				
			}else {
				//current is odd node
				if(oddHead == null) {
					oddHead = curr;
					oddTemp = oddHead;
				}else {
					oddTemp.next = curr;
					oddTemp = oddTemp.next;
				}
			}
			curr = curr.next;
		}
		
		if(evenTemp != null) {
			evenTemp.next = null;
		}
		
		if(oddTemp != null) {
			oddTemp.next = null;
		}
		
		if(evenHead != null) {
			evenTemp.next = oddHead;
			return evenHead;
		}
		return oddHead;
    }
	
	
	public static void main(String[] args) {
		
		Node head = new Node(17);
		
		Node curr = head;
		curr.next = new Node(15);
		curr = curr.next;
		
		curr.next = new Node(8);
		curr = curr.next;
		
		curr.next = new Node(9);
		curr = curr.next;
		
		curr.next = new Node(2);
		curr = curr.next;
		
		curr.next = new Node(4);
		curr = curr.next;
		
		curr.next = new Node(6);
		curr = curr.next;
		
		curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println();
		
		SegregateEvenNOdd seo = new SegregateEvenNOdd();
		Node newHead = seo.divide(7, head);
		
		curr = newHead;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
}
