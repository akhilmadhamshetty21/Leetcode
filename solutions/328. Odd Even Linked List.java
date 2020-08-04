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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> list=new ArrayList();
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            list.add(temp.next.val);
            if(temp.next.next==null)
                break;
            temp.next=temp.next.next;
            temp=temp.next;
        }
         System.out.println(list);
        for(int num:list){
            temp.next=new ListNode(num);
            temp=temp.next;
        }
        return head;
    }
}
