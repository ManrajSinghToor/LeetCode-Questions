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
    public ListNode rev(ListNode head){
        ListNode prev = null, curr = head, forw = null;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;

        newHead = rev(newHead);
        
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode t1 = head;
        ListNode t2 = newHead;
        while(t1 != null){
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
            if(t2 != null){
                temp.next = t2;
                t2 = t2.next;
                temp = temp.next;
            }
        }
    }
}