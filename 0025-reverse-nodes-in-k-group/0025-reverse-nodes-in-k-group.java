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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1) return head;
        int cnt = 0;
        ListNode temp = head;
        while(temp != null && cnt < k){
            temp = temp.next;
            cnt++;
        }
        if(cnt < k) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        int count = 0;
        while(curr != null && count < k){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
            count++;
        }
        head.next = reverseKGroup(curr, k);
        return prev;
    }
}