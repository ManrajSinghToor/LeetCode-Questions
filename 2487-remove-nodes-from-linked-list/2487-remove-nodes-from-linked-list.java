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
    public ListNode removeNodes(ListNode head) {
        if(head == null) return head;

        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            if(st.isEmpty()) st.push(temp.val);
            else{
                while(st.size() > 0 && st.peek() < temp.val) st.pop();
                if(st.size() == 0 || st.peek() >= temp.val) st.push(temp.val);
            }
            temp = temp.next;
        }
        ListNode newHead = new ListNode(0);
        while(!st.isEmpty()) {
            ListNode newNode = new ListNode(st.pop());
            newNode.next = newHead.next;
            newHead.next = newNode;
        }
        return newHead.next;
    }
}