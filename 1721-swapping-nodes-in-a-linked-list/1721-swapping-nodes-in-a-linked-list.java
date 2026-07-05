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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head;
        for(int i = 0; i < k - 1; i++){
            slow = slow.next;
        }

        int cnt = 1;
        while(fast.next != null){
            cnt++;
            fast = fast.next;
        }
        fast = head;
        for(int i = 0; i < cnt - k; i++){
            fast = fast.next;
        }
        if(slow == null || fast == null) return head;

        int temp = slow.val;
        slow.val = fast.val;
        fast.val = temp;

        return head;
    }
}