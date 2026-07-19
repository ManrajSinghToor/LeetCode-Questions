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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = {-1, -1};

        int cnt = 0;
        int minAns = Integer.MAX_VALUE;
        int maxAns = 0;
        int firstIdx = -1;
        int lastIdx = -1;
        ListNode temp = head;
        ListNode prev = head;
        while(temp.next != null){
            if(temp.val > temp.next.val && temp.val > prev.val 
            || temp.val < temp.next.val && temp.val < prev.val){
                if(firstIdx == -1) firstIdx = cnt;
                if(lastIdx != -1){
                    minAns = Math.min(minAns, cnt - lastIdx);
                }
                lastIdx = cnt;
            }
            cnt++;
            prev = temp;
            temp = temp.next;
        }
        maxAns = lastIdx - firstIdx;
        if(minAns == Integer.MAX_VALUE) minAns = -1;
        if(maxAns == 0) maxAns = -1;
        arr[0] = minAns;
        arr[1] = maxAns;

        return arr;
    }
}