package LinkedList;
import java.util.LinkedList;

public class LLCollectionFramework {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new java.util.LinkedList<Integer>();
    
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);

        // remove 
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }

    
    
}
