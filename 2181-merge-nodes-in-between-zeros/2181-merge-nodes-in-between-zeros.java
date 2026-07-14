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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode sumKaro = curr;

        while (sumKaro != null) {
            int sum = 0;
            while (sumKaro.val != 0) {
                sum += sumKaro.val;
                sumKaro = sumKaro.next;
            }

            curr.val = sum;
            sumKaro = sumKaro.next; //vo Zero pe haii usko aage karo.

            curr.next = sumKaro;
            curr = sumKaro;
        }
        return head.next;
    }
}