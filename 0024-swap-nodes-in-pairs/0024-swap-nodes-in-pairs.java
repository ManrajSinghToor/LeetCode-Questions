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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode temp = head;
        int i = 1;
        while(temp != null){
            if(i % 2 == 0) {
                t2.next = temp;
                t2 = t2.next;
            }
            else {
                t1.next = temp;
                t1 = t1.next;
            }
            i++;
            temp = temp.next;
        }
        t1.next = null;
        t2.next = null;
        ListNode ans = new ListNode(-1);
        ListNode res = ans;
        t1 = odd.next;
        t2 = even.next;
        while(t2 != null){
            res.next = t2;
            t2 = t2.next;
            res = res.next;
            res.next = t1;
            t1 = t1.next;
            res = res.next;
        }
        return ans.next;
    }
}