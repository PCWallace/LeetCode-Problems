/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public int getDecimalValue(ListNode head) {
		//using stack to keep the values in reverse order then just simple calculation
		Stack < Integer > stack = new Stack < >();
		ListNode tmp = head;
		while (tmp != null) {
			stack.push(tmp.val);
			tmp = tmp.next;
		}
		int ans = 0,
		c = 0;
		while (!stack.isEmpty()) {
			ans = ans + (int) Math.pow(2, c) * stack.pop();
			c++;
		}
		return ans;
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
    public int getDecimalValue(ListNode head) {
       int ans=0;
	//using bitmanupulation it can achieve easily
        while(head!=null){
            ans=(ans<<1)+head.val;
            head=head.next;
        }
        return ans;
    }
}
