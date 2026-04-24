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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        k = k % len;
        if(k == 0) return head;
        temp = head;
        for(int i = 1; i <= len - k - 1; i++){
            temp = temp.next;
        }
        ListNode head2 = temp.next;
        temp.next = null;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode temp2 = head2;
        while(temp2 != null){
            curr.next = temp2;
            curr = curr.next;
            temp2 = temp2.next;
        } 
        curr.next = head;
        return dummy.next;
    }
}