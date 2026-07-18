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
        ListNode less = new ListNode(0);
        ListNode tless = less;
        ListNode more = new ListNode(-1);
        ListNode tmore = more;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                tless.next = temp;
                temp = temp.next;
                tless = tless.next;
            }
            else {
                tmore.next = temp;
                temp = temp.next;
                tmore = tmore.next;
            }
        }
        tmore.next = null;
        tless.next = more.next;
        return less.next;
    }
}