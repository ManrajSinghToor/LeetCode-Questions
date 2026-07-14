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
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode first = head;

        while(first.next != null) {
            ListNode second = first.next;
            while(second != null && second.val != 0) second = second.next;

            int sum = 0;
            ListNode sumKaro = first.next;
            while(sumKaro != second){
                sum += sumKaro.val;
                sumKaro = sumKaro.next;
            }

            if(sum > 0){
                ListNode newNode = new ListNode(sum);
                temp.next = newNode;
                temp = temp.next;
            }
            first = second;
        }
        return dummy.next;
    }
}