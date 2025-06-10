package Stack;

import Stack.StackArraylist.stack;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public static int pop() {
            if(head == null) {
                System.out.println("List is empty");
                return -1;
            } else {
                int top = head.data;
                head = head.next;
                return top;
            }
        }

        public static int peek(){
            if(head == null) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
