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
    public int maxLevelSum(TreeNode root) {
        int h=height(root);
        int max=0,maxindex=0;
        for(int i=0;i<h;i++){
            int sum=0;
            for(var value:getNodesAtDistance(root,i)){
                sum=sum+value;
            }
            if(sum>max){
                max=sum;
                maxindex=i+1;
            }
        }
        return maxindex;
        
    }
   public ArrayList<Integer> getNodesAtDistance(TreeNode root,int distance) {
    var list = new ArrayList<Integer>();
    getNodesAtDistance(root, distance, list);
    return list;
  }
​
  private void getNodesAtDistance(TreeNode root, int distance, ArrayList<Integer> list) {
