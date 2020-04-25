package LeetCode;

public class MiddleElemntofList {
	

	public static ListNode middleNode(ListNode head) {
      ListNode a = head; 
      ListNode b = head; 
      
        while (b != null && b.next != null ){
            b = b.next.next;
            a = a.next;
             }
        return a;
    
    }
    
    public static void main(String args[]) {
    	ListNode a = new ListNode(5);
    	a.next = new ListNode(6);
    	a.next.next = new ListNode(7);
    	a.next.next.next = new ListNode(8);
    	System.out.println(middleNode(a).val);
    }
		
}
