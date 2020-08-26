/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> hset=new HashSet();
        ListNode temp=head;
        while(temp!=null){
            if(!hset.add(temp))
                return temp;
            temp=temp.next;
        }
        return null;
    }
}
