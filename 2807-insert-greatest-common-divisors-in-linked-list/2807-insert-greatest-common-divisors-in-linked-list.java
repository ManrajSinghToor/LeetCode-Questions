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
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public void helper(ListNode head){
        if(head == null || head.next == null) return ;

        ListNode slow = head;
        ListNode fast = head.next;

        int gcdNum = gcd(slow.val, fast.val);
        ListNode gcdNode = new ListNode(gcdNum);

        slow.next = gcdNode;
        gcdNode.next = fast;
        slow = slow.next;

        helper(slow.next);

    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        helper(head);
        return head;
    }
}