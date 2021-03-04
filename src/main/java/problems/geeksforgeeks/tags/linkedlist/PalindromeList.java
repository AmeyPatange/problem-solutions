package problems.geeksforgeeks.tags.linkedlist;

import problems.geeksforgeeks.classes.Node;

public class PalindromeList {

	 boolean isPalindrome(Node head) 
	    {
	        if(head.next == null){
	            return true;
	        }
	        
	        Node sRef = head;
	        Node fRef = head;
	        
	        while(fRef != null){
	            fRef = fRef.next;
	            if(fRef != null && fRef.next != null){
	                fRef = fRef.next;
	                sRef = sRef.next;
	            }
	        }
	        
	        Node prev = null;
	        Node curr = sRef.next;
	        
	        while(curr != null){
	            Node next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }
	        sRef.next = prev;
	        
	        curr = sRef.next;
	        prev = head;
	        
	        while(curr != null){
	            if(curr.data != prev.data){
	                return false;
	            }
	            curr = curr.next;
	            prev = prev.next;
	        }
	        return true;
	    }
}
