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
    public List<Integer> postorder(Node root) {
        List<Integer> result=new ArrayList();
        postorder(result,root);
        return result;
    }
    private void postorder(List<Integer> result,Node root){
        if(root==null)
            return;
        for(Node child:root.children)
            postorder(result,child);
        result.add(root.val);
    }
}
