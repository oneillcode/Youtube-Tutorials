package LinkedList;
import java.util.Random;

public class LinkedList {

	public static void main(String[] args) {
		printLinkedList(generateLinkedList(10));

	}
	
	public static ListNode generateLinkedList(int len){
		Random rand = new Random();
		ListNode head = new ListNode(rand.nextInt(10) + 1);
		ListNode current = head;
		
		for(int i = 0; i < len - 1; i++){
			current.next = new ListNode(rand.nextInt(10) + 1);
			current = current.next;
		}		
		return head;
	}
	
	public static void printLinkedList(ListNode head){
		if(head == null) System.out.println("Linked List is null.");
		
		while(head != null){
			System.out.print("[ " + head.val + " ]");
			if(head.next != null){
				System.out.print(" --> ");
			}
			head = head.next;
		}
	}
}
