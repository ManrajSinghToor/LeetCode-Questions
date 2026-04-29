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
    public ListNode mergeLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode t1 = head1;
        ListNode t2 = head2;
        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                temp.next = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        while (t1 != null) {
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
        }
        while (t2 != null) {
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        ArrayList<ListNode> arr = new ArrayList<>();
        for (ListNode n : lists)
            arr.add(n);

        while (arr.size() > 1) {
            ArrayList<ListNode> next = new ArrayList<>();
            for (int i = 0; i < arr.size(); i += 2) {
                if (i + 1 < arr.size()) {
                    next.add(mergeLists(arr.get(i), arr.get(i + 1)));
                } else {
                    next.add(arr.get(i));
                }
            }
            arr = next;
        }
        return arr.get(0);
    }
}