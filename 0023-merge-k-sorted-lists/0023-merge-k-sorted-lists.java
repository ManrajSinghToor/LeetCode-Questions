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
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode t1 = head1;
        ListNode t2 = head2;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                temp.next = t1;
                t1 = t1.next;
            }
            else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        while(t1 != null){
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
        }
        while(t2 != null){
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        
        List<ListNode> list = new ArrayList<>();
        for(ListNode nodes : lists){
            list.add(nodes);
        }

        while(list.size() > 1){
            List<ListNode> subList = new ArrayList<>();
            for(int i = 0; i < list.size(); i += 2){
                if(i + 1 < list.size()) subList.add(merge(list.get(i), list.get(i + 1)));
                else subList.add(list.get(i));
            }
            list = subList;
        }
        return list.get(0);
    }
}