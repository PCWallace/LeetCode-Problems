/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	//remove the nth node from the end of the list
	public ListNode removeNthFromEnd(ListNode head, int n) {
		//initializing the ans with the head pointer
		ListNode ans = head;
		//initializing the diff pointer which will we n distance from the head
		ListNode diff = ans;
		//this loop help us to take the diff pointer to n distance forward
		while (diff != null && n != 0) {
			diff = diff.next;
			n--;
		}
		//if diff is null mean n is equal to the length of linkedlist
		if (diff == null) return head.next;
		while (diff != null && diff.next != null) {
			ans = ans.next;
			diff = diff.next;
		}
		ans.next = ans.next.next;
		return head;
	}
}
