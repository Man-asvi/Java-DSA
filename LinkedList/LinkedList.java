package LinkedList;

public class LinkedList {

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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addMiddle(int data, int index) {
        if(index < 0) {
            System.out.println("Index cannot be negative");
            return;
        }

        Node newNode = new Node(data);
        
        if(index == 0) {
            addFirst(data);
            return;
        } else {
            Node curr = head;
            for(int i = 0; i < index -1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
            if(newNode.next == null) {
                tail = newNode;
            }
            return;
        }
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
        }
        size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head == tail) {
            head = tail = null;
        } else {
            Node curr = head;
            while(curr.next != tail) {
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
        }
        size--;
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

    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public Node findMid() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow is mid
    }

    public boolean isPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
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

        //check equal
        while(right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(10);
        // ll.addFirst(20);
        // ll.addLast(30);
        // ll.addLast(40);
        // ll.printList();
        // ll.addMiddle(25, 2);
        // ll.addMiddle(5, 0);
        // ll.printList();
        // ll.removeFirst();
        // ll.printList();
        // ll.removeLast();
        // ll.printList();
        // System.out.println("Size of the linked list: " + ll.size);
        // ll.reverseLL();
        // System.out.print("Reversed Linked List: ");
        // ll.printList();


        LinkedList ll2 = new LinkedList();
        ll2.addFirst(1);
        ll2.addFirst(2);
        ll2.addFirst(2);
        ll2.addFirst(1);
        ll2.printList();
        System.out.println("Linked list is palindrome: " + ll2.isPalindrome());

    }
    
}
