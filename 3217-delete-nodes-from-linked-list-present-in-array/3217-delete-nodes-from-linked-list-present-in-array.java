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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head == null) return head;
        Set<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        ListNode temp2 = head;
        while(temp2 != null){
            if(!set.contains(temp2.val)){
                ListNode newNode = new ListNode(temp2.val);
                temp.next = newNode;
                temp = temp.next;
            }
            temp2 = temp2.next;
        }
        return dummy.next;
    }
}