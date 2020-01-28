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
	//same as the mindepth
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		int l = maxDepth(root.left);
		int r = maxDepth(root.right);
		if (l == 0 || r == 0) return Math.max(l, r) + 1;
		return Math.max(l, r) + 1;
	}
}
