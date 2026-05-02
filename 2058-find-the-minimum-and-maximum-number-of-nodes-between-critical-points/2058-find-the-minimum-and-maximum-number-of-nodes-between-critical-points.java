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
        
        if (head.next.next == null) return arr;
        ListNode temp = head.next;
        ListNode prev = head;

        int count = 0;
        int firstIdx = -1;
        int lastIdx = -1;
        int minDist = Integer.MAX_VALUE;

        while(temp.next != null){
            if((temp.val > prev.val && temp.val > temp.next.val) || 
               (temp.val < prev.val && temp.val < temp.next.val)){
                if(firstIdx == -1) firstIdx = count;
                if(lastIdx != -1) {
                    int dist = count - lastIdx;
                    minDist = Math.min(minDist, dist);
                }
                lastIdx = count;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }
        int maxDist = lastIdx - firstIdx;
        if(minDist == Integer.MAX_VALUE) minDist = -1;
        if(maxDist == 0) maxDist = -1;
        arr[0] = minDist;
        arr[1] = maxDist;

        return arr;
    }
}