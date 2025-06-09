package LinkedList;

public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head ==  tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void printList() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + "<->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.printList();
        System.out.println(ll.size);

        ll.reverseLL();
        ll.printList();

        ll.removeFirst();
        ll.printList();
        System.out.println(ll.size);
        
    }
    
}
