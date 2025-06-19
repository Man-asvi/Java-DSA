package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Operations {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        //add
        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(8);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);

        //contains
        System.out.println(hs.contains(2));
        System.out.println(hs.contains(10));

        //remove
        hs.remove(2);
        System.out.println(hs);
        System.out.println(hs.contains(2));

        //size
        System.out.println(hs.size());

        //clear
        hs.clear();
        System.out.println(hs.isEmpty());


        // Iteration
        HashSet<String> cities = new HashSet<>();
        cities.add("Hyderabad");
        cities.add("Bengaluru");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");

        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        for (String city : cities) {
            System.out.print(city + " ");
            
        }
    }
}
