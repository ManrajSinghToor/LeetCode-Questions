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
        ListNode curr = head, forw = null, prev = null;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0; i < ((cnt / 2) - 1); i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;

        newHead = rev(newHead);
        temp = head;
        ListNode temp2 = newHead;
        int maxSum = 0;
        while(temp != null){
            int sum = 0;
            sum += temp.val;
            sum += temp2.val;
            temp = temp.next;
            temp2 = temp2.next;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}