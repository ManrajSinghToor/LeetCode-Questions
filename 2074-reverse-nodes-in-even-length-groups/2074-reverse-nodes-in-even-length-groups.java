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
    public ListNode rev(ListNode head) {
        ListNode curr = head, prev = null, forw = null;
        while (curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        int size = 1;

        while (curr != null) {
            ListNode groupStart = curr;
            int count = 0;
            while (count < size && curr != null) {
                curr = curr.next;
                count++;
            }

            if (count % 2 == 0) {
                ListNode prevNode = curr;
                ListNode node = groupStart;
                for (int i = 0; i < count; i++) {
                    ListNode next = node.next;
                    node.next = prevNode;
                    prevNode = node;
                    node = next;
                }
                ListNode temp = prev.next;
                prev.next = prevNode;
                prev = temp;
            } 
            else {
                for (int i = 0; i < count; i++) {
                    prev = prev.next;
                }
            }
            size++;
        }
        return dummy.next;
    }
}