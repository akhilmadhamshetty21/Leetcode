class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<String>();
        String res = "";
        for (String w : words) {
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                res = w.length() > res.length() ? w : res;
                built.add(w);
            }
        }
        return res;
//         Trie trie=new Trie();
//         for(String str: words){
//             trie.insert(str);
//         }
//         return trie.longestWords();
//     }
//     public class Trie {
//  public class Node{
//   char value;
//   HashMap<Character,Node> childrens=new HashMap<>();
//   boolean isEndOfWord;
//   public Node(char value) {
//       this.value=value;
//   }
//  @Override
//  public String toString() {
//      return "Node [value=" + value + "]";
//  }
//  public Node[] getChildren() {
//      return childrens.values().toArray(new Node[0]);
//  }
     
//  }
//  Node root=new Node('\0');
//  public void insert(String word) {
//   Node current=root;
//   for(char ch:word.toCharArray()) {
