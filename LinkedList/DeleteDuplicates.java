/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		//implementation, just moving current.next pointer forward till it does not matches the current value
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val) curr.next = curr.next.next;
			else curr = curr.next;
		}
		return head;
	}
}
