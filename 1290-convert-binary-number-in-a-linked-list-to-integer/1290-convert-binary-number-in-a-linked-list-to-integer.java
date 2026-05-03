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
    public int getDecimalValue(ListNode head) {
        StringBuilder ans = new StringBuilder();
        ListNode temp = head;
        while(temp != null){
            ans.append(temp.val);
            temp = temp.next;
        }
        int num = Integer.parseInt(ans.toString(), 2);
        return num; 
    }
}