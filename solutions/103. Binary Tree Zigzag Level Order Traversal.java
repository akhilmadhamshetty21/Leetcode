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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList();
        zigzaglevelOrder(root,result,0);
        for(int i=0;i<result.size();i=i+2){
            Collections.reverse(result.get(i));
        }
        return result;
    }
    private void zigzaglevelOrder(TreeNode root,List<List<Integer>> result,int level){
        if(root==null)
            return;
        if(result.size()==level)
            result.add(new ArrayList());
        result.get(level).add(root.val);
        zigzaglevelOrder(root.right,result,level+1);
        zigzaglevelOrder(root.left,result,level+1);
       
    }
}
