/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		//taking the refrence of headers so that pointer does not get lost
		ListNode a = headA;
		ListNode b = headB;
		//ca,cb will be the count of nodes in the linked list
		int ca = 0,
		cb = 0;
		while (a != null) {
			ca++;
			a = a.next;
		}
		while (b != null) {
			cb++;
			b = b.next;
		}
		a = headA;
		b = headB;
		//move the bigger linked list forward by the diff in the length of so that they could meet simultaneously
		if (ca > cb) {
			ca = ca - cb;
			while (ca != 0) {
				a = a.next;
				ca--;
			}
		}
		else {
			cb = cb - ca;
			while (cb != 0) {
				b = b.next;
				cb--;
			}
		}
		while (a != b) {
			a = a.next;
			b = b.next;
		}
		return a;
	}
}
