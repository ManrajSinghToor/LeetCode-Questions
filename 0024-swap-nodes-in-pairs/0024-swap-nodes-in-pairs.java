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
    public void  recurs(ListNode prev, ListNode curr){
        if(curr == null || curr.next == null) return ;

        ListNode f = curr, s = curr.next;

        f.next = s.next;
        s.next = f;
        prev.next = s;

        prev = s;
        recurs(f, f.next);
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        recurs(prev, head);
        return dummy.next;
    }
}