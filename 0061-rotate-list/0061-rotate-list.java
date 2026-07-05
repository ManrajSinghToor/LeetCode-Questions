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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }   

        k = k % len;
        if(k == 0) return head;

        ListNode rotate = head;
        for(int i = 0; i < len - k - 1; i++){
            rotate = rotate.next;
        }
        ListNode head2 = rotate.next;
        rotate.next = null;

        temp.next = head;
        return head2;
    }
}