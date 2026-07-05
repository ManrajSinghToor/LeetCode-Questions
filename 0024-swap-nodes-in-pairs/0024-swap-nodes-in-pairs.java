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
    public void recurs(ListNode prev, ListNode curr){
        if(curr == null || curr.next == null) return ;
        ListNode f = curr.next;
        curr.next = f.next;
        f.next = curr;
        prev.next = f;
        recurs(curr, curr.next);
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        recurs(dummy, head);
        return dummy.next;
    }
}