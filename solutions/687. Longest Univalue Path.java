/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int gMax = 0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;  
        longestPathFromNode(root, root.val - 1);
        return gMax;
    }
    private int longestPathFromNode(TreeNode node, int preValue) {
        if (node == null) return 0;
        int left = longestPathFromNode(node.left, node.val);
        int right = longestPathFromNode(node.right, node.val);
        int count = 0;
        gMax = Math.max(gMax, left + right);
        if (node.val == preValue) {
            count = 1 + Math.max(left, right);
        }
        
        gMax = Math.max(count, gMax);
        return count;
    }
}
