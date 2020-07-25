/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middle=head,forward = head;
        while(forward.next!=null && forward.next.next!=null) {
            middle=middle.next;
            forward=forward.next.next;
        }
        if(forward.next==null) {
            return middle;
        }
        if(forward.next.next==null) {
            return middle.next;
        }
        return null;
    
    }
}
