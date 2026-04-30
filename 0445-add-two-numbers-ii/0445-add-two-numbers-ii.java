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
        ListNode prev = null, forw = null, curr = head;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // while(l1 != null && l1.val == 0) l1 = l1.next;
        // while(l2 != null && l2.val == 0) l2 = l2.next;
        // if(l1 == null || l1.next == null) return l1

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        l1 = rev(l1);
        l2 = rev(l2);
        ListNode t1 = l1, t2 = l2;
        int carry = 0;
        while(t1 != null || t2 != null || carry != 0){
            int sum = carry;
            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;

            }
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        ListNode ans = rev(dummy.next);
        return ans;
    }
}