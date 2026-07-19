/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepCopy(Node head){
        Node dummy = new Node(0);
        Node temp = dummy;

        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.val);
            temp.next = newNode;
            curr = curr.next;
            temp = temp.next;
        }
        temp.next = null;
        return dummy.next;
    }
    public void alterConnect(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        Node t1 = head1;
        Node t2 = head2;
        while(t2 != null){
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
    }
    public void assignRandom(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        while(t1 != null && t2 != null){
            if(t1.random == null) t2.random = null;
            else  t2.random = t1.random.next;
            t1 = t1.next.next;
            if(t2.next != null) t2 = t2.next.next;
        }
    }
    public void makeOriginal(Node head1, Node head2){
        Node ansDummy = new Node(0);
        Node fakeDummy = new Node(-1);

        Node t1 = fakeDummy;
        Node t2 = ansDummy;

        Node curr1 = head1;
        Node curr2 = head2;
        while(curr1 != null && curr2 != null){
            t1.next = curr1;
            t1 = t1.next;
            curr1 = curr1.next.next;
            t2.next = curr2;
            t2 = t2.next;
            if(curr2.next != null) curr2 = curr2.next.next;
        }
        t1.next = null;
    }
    public Node copyRandomList(Node head) {
        Node head2 = deepCopy(head);

        alterConnect(head, head2);

        assignRandom(head, head2);

        makeOriginal(head, head2);
        return head2;
    }
}