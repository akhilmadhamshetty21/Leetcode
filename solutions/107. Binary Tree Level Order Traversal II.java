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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList();
        levelOrderBottom(root,result,0);
        Collections.reverse(result);
        return result;
    }
    private void levelOrderBottom(TreeNode root,List<List<Integer>> result,int level){
        if(root==null)
            return;
        if(result.size()==level)
            result.add(new ArrayList());
        result.get(level).add(root.val);
        levelOrderBottom(root.left,result,level+1);
        levelOrderBottom(root.right,result,level+1);
    }
}
