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

        Node t1 = head;
        while(t1 != null){
            Node newNode = new Node(t1.val);
            temp.next = newNode;
            t1 = t1.next;
            temp = temp.next;
        }
        return dummy.next;

    }
    public void alterConnect(Node head1, Node head2){
        Node dummy2 = new Node(0);
        Node temp = dummy2;

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
        dummy2.next = null;
    }
    public void assignRandom(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        while(t1 != null && t2 != null){
            if(t1.random == null) t2.random = null;
            else t2.random = t1.random.next;
            t1 = t1.next.next;
            if(t2.next != null) t2 = t2.next.next;
        }
    }
    public void splitBoth(Node head1){
        Node ansDummy = new Node(0);
        Node ansTemp = ansDummy;

        Node fakeDummy = new Node(-1);
        Node fakeTemp = fakeDummy;

        Node temp = head1;
        while(temp != null){
            fakeTemp.next = temp;
            fakeTemp = fakeTemp.next;
            temp = temp.next;
            ansDummy.next = temp;
            ansDummy = ansDummy.next;
            temp = temp.next;
        }
        fakeTemp.next = null;
    }
    public Node copyRandomList(Node head) {
        Node head2 = deepCopy(head); 
        alterConnect(head, head2);
        assignRandom(head, head2);
        splitBoth(head);
        return head2;
    }
}