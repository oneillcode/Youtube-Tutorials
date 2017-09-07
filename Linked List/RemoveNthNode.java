package LinkedList;

public class RemoveNthNode {

	public static void main(String[] args) {
		
		ListNode linkedList = LinkedList.generateLinkedList(7); //generate Linked List
		
		LinkedList.printLinkedList(linkedList); //Print first Linked List
		
		System.out.println();
		
		ListNode newLinkedList = removeNthFromEnd(linkedList, 2); //Remove the nth Node from end
		
		LinkedList.printLinkedList(newLinkedList); //Print new Linked List

	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {		
		if(head == null || head.next == null) return null;
		
		ListNode slow = head, fast = head;
		
		for(int i = 0; i <= n + 1; i++){
			if(fast == null) return head;
			fast = fast.next;
		}
		
		while(fast != null){
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
		return head;
	}

}
