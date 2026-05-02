/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;
        Node temp = head;
        while(temp != null){
            if(temp.child == null) temp = temp.next;
            else {
                Node back = temp.next;
                Node c = flatten(temp.child);
                temp.child = null;
                temp.next = c;
                c.prev = temp;

                Node tail = c;
                while(tail.next != null) tail = tail.next;

                tail.next = back;
                if(back != null) back.prev = tail;
                temp = back;
            }
        }
        return head;
    }
}