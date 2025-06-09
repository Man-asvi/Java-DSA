package LinkedList;

public class ZigZagLL {

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

    public Node findMid() {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow is mid
    }

    public void zigzag() {
        // find mid
        Node mid = findMid();

        //reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        Node nextL, nextR;

        // merging
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            left = nextL;
            right = nextR;
        }
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
        ZigZagLL ll = new ZigZagLL();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(6);

        ll.printList();

        ll.zigzag();

        ll.printList();
        
    }
    
}
