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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1) return head;

        ListNode temp = head;
        int count = 0;
        while(temp != null && count < k){
            temp = temp.next;
            count++;
        }
        if(count < k) return head;

        ListNode forw = null;
        ListNode curr = head;
        ListNode prev = null;
        count = 0;
        while(curr != null && count < k){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
            count++;
        }
        head.next = reverseKGroup(curr , k);

        return prev;
    }
}
// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         if(head == null || head.next == null) return head;

//         ListNode temp = head;
//         int cnt = 0;
//         while(temp != null){
//             cnt++;
//             temp = temp.next;
//         }
//         int[] ans = new int[cnt];
//         temp = head;
//         for(int i = 0; i < cnt; i++){
//             ans[i] = temp.val;
//             temp = temp.next;
//         }

//         for(int i = 0; i <= cnt - k; i += k){
//             int left = i;
//             int right = i + k - 1;
//             while(left < right){
//                 int swap = ans[left];
//                 ans[left] = ans[right];
//                 ans[right] = swap;
//                 left++;
//                 right--;
//             }
//         }

//         ListNode dummy = new ListNode(ans[0]);
//         ListNode curr = dummy;
//         for(int i = 1; i < cnt; i++){
//             curr.next = new ListNode(ans[i]);
//             curr = curr.next;
//         }
//         return dummy;
//     }
// }