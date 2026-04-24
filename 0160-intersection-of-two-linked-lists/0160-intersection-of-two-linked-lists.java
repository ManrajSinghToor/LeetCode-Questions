/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // if(headA == null) return headA;
        // if(headB == null) return headB;
        int len1 = 0;
        ListNode temp = headA;
        while(temp != null){
            len1++;
            temp = temp.next;
        }
        int len2 = 0;
        ListNode temp2 = headB;
        while(temp2 != null){
            len2++;
            temp2 = temp2.next;
        }
        temp = headA;
        temp2 = headB;
        if(len1 > len2){
            int diff = len1 - len2;
            for(int i = 1; i <= diff; i++){
                temp = temp.next;
            }
        }
        else {
            int diff = len2 - len1;
            for(int i = 1; i <= (len2 - len1); i++){
                temp2 = temp2.next;
            }
        }
        while(temp != temp2){
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp;
    }
}