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
        ListNode begin = head;
        for(int i = 1; i <= k - 1; i++){
            begin = begin.next;
        }
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        ListNode last = head;
        for(int i = 1; i <= cnt - k; i++){
            last = last.next;
        }

        int ans = begin.val;
        begin.val = last.val;
        last.val = ans;
        return head;
    }
}