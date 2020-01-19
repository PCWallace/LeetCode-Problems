/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	/**
		The core concept is we will take out middle pointer of linked list and from that point reverse it.
		In this way we can check palindrome with O(1) space complexity and O(n) time but we will lose our oiginal list
		The other approach if you have keep the list same using stack in which space complexity would O(n)

	**/
	public boolean isPalindrome(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode tail = reverse(slow);
		while (tail != null) {
			if (head.val != tail.val) return false;
			tail = tail.next;
			head = head.next;
		}
		return true;
	}
	public static ListNode reverse(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode tmp = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return tmp;
	}
}
