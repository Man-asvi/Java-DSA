package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class BasicOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements - O(1)
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(1);        

        //print the list - O(n)
        System.out.println(list);

        list.add(1,12); // O(n) due to shifting elements
        System.out.println(list);

        //get elements - O(1)
        System.out.println(list.get(2));
        System.out.println(list.get(0));

        //remove elements - O(n)
        list.remove(2);
        System.out.println(list);

        //set elements - O(n)
        list.set(0, 10);
        System.out.println(list);

        //contains - O(n)
        System.out.println(list.contains(10));
        System.out.println(list.contains(5));

        //size - O(1)
        System.out.println("Size of the list: " + list.size());

        //reverse array list
        System.out.println("Original ArrayList: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);

        //sort
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        //descending sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending sorted list: " + list);

        //multi-dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4); list2.add(5); list2.add(6);
        mainList.add(list2);

        System.out.println("Multi-dimensional ArrayList: " + mainList);
    }
    
}
