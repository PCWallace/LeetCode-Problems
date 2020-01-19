/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode removeElements(ListNode head, int val) {
		//if the list is empty return it.
		if (head == null) return head;
		//we take two pointer one is fast and other is slow
		ListNode tmp = head.next;
		ListNode pre = head;
		while (tmp != null) {
			if (tmp.val == val) {
				//for better understandig this take eg 1 2 3 3 3 4 remove 3
				while (tmp.next != null && tmp.next.val == val)
				tmp = tmp.next;
				pre.next = tmp.next;
				if (tmp.next != null) tmp = tmp.next.next;
				else tmp = null;
				pre = pre.next;
			} else {
				pre = tmp;
				tmp = tmp.next;
			}
		}
		//this is simply checkking head beacuse we have not checked it before
		if (head.val == val) return head.next;
		return head;
	}
}
