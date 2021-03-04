package problems.geeksforgeeks.tags.twopointer;

import problems.geeksforgeeks.classes.Node;

public class DetectNRemoveLoop {
	

public static void removeLoop(Node head){
        
        if(head == null){
            return;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        
        if(fast != slow){
            return; //no loop
        }
        
        slow = head;
        if(slow == fast){
            while(fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        
        while(fast.next != slow.next){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = null;
    }

}
