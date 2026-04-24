/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(0);
        ListNode t1 = small;
        ListNode t2 = large;

        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                t1.next = temp;
                t1 = t1.next;
                temp = temp.next;
            }
            else {
                t2.next = temp;
                t2 = t2.next;
                temp = temp.next;
            }
        }
        t2.next = null;
        t1.next = large.next;
        return small.next;
    }
}