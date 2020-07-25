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
    public int minDiffInBST(TreeNode root) {
       List<Integer> dfs=new ArrayList();
       dfstraversal(root,dfs);
       int min=Integer.MAX_VALUE;
       for(int i=0;i<dfs.size()-1;i++){
           for(int j=i+1;j<dfs.size();j++){
               if((dfs.get(j)-dfs.get(i))<min)
                   min=dfs.get(j)-dfs.get(i);
           }
       }
        return min;
    }
    private void dfstraversal(TreeNode root,List<Integer> dfs){
        if(root==null)
            return;
        dfstraversal(root.left,dfs);
        dfs.add(root.val);
        dfstraversal(root.right,dfs);
    }
}
