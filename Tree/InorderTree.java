/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public List < Integer > inorderTraversal(TreeNode root) {
		List < Integer > ans = new ArrayList < >();
		helper(root, ans);
		return ans;
	}

	public void helper(TreeNode root, List < Integer > ans) {
		if (root == null) return;
		helper(root.left, ans);
		ans.add(root.val);
		helper(root.right, ans);
	}
}
