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
    public ListNode deleteDuplicates(ListNode head) {
        // if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode i = head;
        while(i != null){
            if(i.next == null || i.val != i.next.val){
                temp.next = i;
                temp = temp.next;
                i = i.next;
            }
            else {
                ListNode j = i.next;
                while(j != null && j.val == i.val){
                    j = j.next;
                }
                i = j;
            }
        }
        temp.next = i;
        return dummy.next;
    }
}