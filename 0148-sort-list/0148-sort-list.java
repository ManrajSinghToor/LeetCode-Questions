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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        ListNode temp = list1;
        ListNode temp2 = list2;
        while(temp != null && temp2 != null){
            if(temp.val <= temp2.val) {
                curr.next = temp;
                temp = temp.next;
                curr = curr.next;
            }
            else {
                curr.next = temp2;
                temp2 = temp2.next;
                curr = curr.next;
            }
        }
        while(temp != null){
            curr.next = temp;
            temp = temp.next;
            curr = curr.next;
        }
        while(temp2 != null){
            curr.next = temp2;
            temp2 = temp2.next;
            curr = curr.next;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        head = sortList(head);
        head2 = sortList(head2);
        return mergeTwoLists(head, head2);
    }
}