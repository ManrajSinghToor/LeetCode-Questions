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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int[] ans = new int[list.size()];
        Stack<Integer> st = new Stack<>();
        for(int i = list.size() - 1; i >= 0; i--){
            while(st.size() > 0 && st.peek() <= list.get(i)) st.pop();
            if(st.size() == 0) ans[i] = 0;
            else ans[i] = st.peek();
            st.push(list.get(i));
        }
        return ans;
    }
}