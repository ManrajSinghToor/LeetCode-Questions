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

        if(head2 == null) return head2;

        ListNode curr = head2;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = head;
        return head2;
    }
}