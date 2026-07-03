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
    public ListNode recurs(ListNode prev, ListNode curr){
        if(curr == null) return prev;

        ListNode f = curr.next;
        curr.next = prev;
        prev = curr;

        return recurs(prev, f);
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        // ListNode dummy = new ListNode(-1);
        return recurs(null, head);
        // return head;
    }
}