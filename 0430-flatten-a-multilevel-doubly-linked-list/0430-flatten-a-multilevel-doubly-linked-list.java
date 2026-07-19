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
                Node forw = temp.next;
                Node c = flatten(temp.child);
                temp.child = null;
                temp.next = c;
                if(c != null) c.prev = temp;

                Node tail = c;
                while(tail.next != null) tail = tail.next;

                tail.next = forw;
                if(forw != null) forw.prev = tail;
                temp = forw;
            }
        }
        return head;
    }
}