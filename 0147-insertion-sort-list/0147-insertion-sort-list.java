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
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        ListNode t1 = l1;
        ListNode t2 = l2;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val) {
                temp.next = t1;
                t1 = t1.next;
            }
            else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        while(t1 != null){
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
        }
        while(t2 != null){
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head = insertionSortList(head);
        head2 = insertionSortList(head2);
        return merge(head, head2);
    }
}