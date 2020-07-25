/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
​
    public Node() {}
​
    public Node(int _val) {
        val = _val;
    }
​
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
​
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result=new ArrayList();
        levelOrder(root,result,0);
        return result;
    }
    private void levelOrder(Node root,List<List<Integer>> list,int level){
        if(root==null)
            return;
        if(level==list.size())
            list.add(new ArrayList());
        list.get(level).add(root.val);
        for(Node child:root.children)
            levelOrder(child,list,level+1);
    }
}
