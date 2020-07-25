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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode root,long min,long max){
       
        if(root==null)
            return true;
         long value=root.val;
        if(value>max || value<min)
            return false;
        return (isValidBST(root.left,min,value-1) && isValidBST(root.right,value+1,max));
        
    }
}
