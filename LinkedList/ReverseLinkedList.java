/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

	//iterative soluion
	public ListNode reverseList(ListNode head) {
		//take a prev pointer and current pointer
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			//take the next pointer in tmp so that further list do not get lost
			ListNode nextTemp = curr.next;
			//simple swapping
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		return prev;
	}
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	//recursive solution little tricky
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode tmp = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return tmp;
	}
}
