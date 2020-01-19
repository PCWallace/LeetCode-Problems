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
	This is simply tricky , in this scenario rather on deleting the current node we will actually deleting next node and replace the value 		in current node, because we don'nt we have previous node so we can'nt update previous pointer
	**/
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
