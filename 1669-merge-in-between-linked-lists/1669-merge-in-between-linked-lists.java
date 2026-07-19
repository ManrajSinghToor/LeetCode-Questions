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
    public ListNode mergeInBetween(ListNode list1, int a, int b,   ListNode list2) {
        ListNode aNode = list1;
        for(int i = 0; i < a - 1; i++){
            aNode = aNode.next;
        }

        ListNode bNode = list1;
        for(int i = 0; i < b; i++){
            bNode = bNode.next;
        }
        ListNode tail = bNode.next;

        aNode.next = null;
        bNode.next = null;

        ListNode tailPrev = list2;
        while(tailPrev.next != null) tailPrev = tailPrev.next;

        aNode.next = list2;
        tailPrev.next = tail;

        return list1;
    }
}