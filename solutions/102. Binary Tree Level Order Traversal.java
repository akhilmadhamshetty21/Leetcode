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
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height=height(root);
        System.out.println(height);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<=height;i++){
            List<Integer> temp=nodesAtkDistance(root,i);
            result.add(temp);
        }
        return result;
    }
    private int height(TreeNode root){
        if(root.left==null && root.right==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    
    private List<Integer> nodesAtkDistance(TreeNode root,int k){
        List<Integer> result=new ArrayList<Integer>();
        if(root==null)
            return null;
        if(k==0){
            result.add(root.val);
            System.out.println(result);
