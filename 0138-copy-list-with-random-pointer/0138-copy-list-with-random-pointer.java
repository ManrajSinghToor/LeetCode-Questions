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
        Node t1 = dummy;
        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.val);
            t1.next = newNode;
            t1 = t1.next;
            temp = temp.next;
        }
        t1.next = null;
        return dummy.next;
    }
    public void alterConnect(Node head1, Node head2){
        Node d1 = new Node(-1);
        Node t1 = d1;
        
        Node temp = head1;
        Node temp2 = head2;
        while(temp2 != null){
            t1.next = temp;
            t1 = t1.next;
            temp = temp.next;
            t1.next = temp2;
            t1 = t1.next;
            temp2 = temp2.next;
        }
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
    public void MakeOriginal(Node head1, Node head2){
        Node ansDummy = new Node(0);
        Node ansTemp = ansDummy;

        Node fakeDummy = new Node(-1);
        Node fakeTemp = fakeDummy;

        Node t1 = head1;
        Node t2 = head2;
        while(t1 != null && t2 != null){
            fakeTemp.next = t1;
            t1 = t1.next.next;
            fakeTemp = fakeTemp.next;
            ansTemp.next = t2;
            if(t2.next != null) t2 = t2.next.next;
            ansTemp = ansTemp.next;
        }
        fakeTemp.next = null;
    }
    public Node copyRandomList(Node head) {
        // Step 1. -> Make Simple deepCopy of given List 
        Node newHead = deepCopy(head);

        //Step 2. -> Make Alternate connections b/w two lists
        alterConnect(head, newHead);

        //Step 3. -> Assign Random Correctly
        assignRandom(head, newHead);

        //Step 4. -> Make the original list remove alternate connections
        MakeOriginal(head, newHead);
        return newHead;
    }
}