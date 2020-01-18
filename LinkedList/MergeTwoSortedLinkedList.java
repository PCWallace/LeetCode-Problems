/**
public class ListNode {
     int val;
    ListNode next;
     ListNode(int x) { val = x; }
 }
**/
class Solution {
	//In this solution I have not made a new linked  but modified the existing in that manner without extra space because with extra space it is easy
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//The base condition if one of the list is empty so then return the other list as it is.
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		//Intializing the head of the ans
		ListNode ans = l1;
		if (l2.val < l1.val) {
			ans = l2;
			l2 = l2.next;
		} else l1 = l1.next;
		//Initializing ans in another variable so that it should'nt get lost.
		ListNode ans2 = ans;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				ans.next = l1;
				l1 = l1.next;
				ans = ans.next;
			} else {
				ans.next = l2;
				l2 = l2.next;
				ans = ans.next;
			}
		}
		//if list are not same then one list will be left to traverse
		if (l1 == null && l2 != null) ans.next = l2;
		if (l2 == null && l1 != null) ans.next = l1;
		return ans2;
	}
}
