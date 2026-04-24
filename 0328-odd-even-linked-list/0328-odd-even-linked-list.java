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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);
        ListNode e1 = even;
        ListNode o1 = odd;

        ListNode temp = head;
        int i = 1;
        while(temp != null){
            if(i % 2 == 0) {
                e1.next = temp;
                e1 = e1.next;
            }
            else{
                o1.next = temp;
                o1 = o1.next;
            }
            i++;
            temp = temp.next;
        }
        e1.next = null;
        o1.next = even.next;
        return odd.next;
    }
}