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
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        temp = head;
        for(int i = 0; i < len; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }   
        int[] ans = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(st.size() > 0 && st.peek() <= arr[i]) st.pop();
            if(st.size() == 0) ans[i] = 0;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}