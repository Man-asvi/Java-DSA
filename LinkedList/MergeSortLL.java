package LinkedList;

public class MergeSortLL {

    public static  class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast  = fast.next.next;
        }

        return slow;

    }

    public Node merge(Node head1, Node head2) {
        Node mergedLl = new Node(-1);
        Node temp = mergedLl;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLl.next;

    }

    public Node mergesort(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left and right
        Node right = mid.next;
        mid.next = null;
        Node newLeft = mergesort(head);
        Node newRight = mergesort(right);

        //merge
        return merge(newLeft, newRight);
    }

    public void printList() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);

        ll.printList();

        ll.mergesort(head);

        ll.printList();

    }
    
}
