package Hashing;
import java.util.HashMap;
import java.util.Set;

public class HashMap_Operations {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm);

        //get
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonesia"));

        //contains
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // //remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key: " + k + ", Value: " + hm.get(k));

            
        }
    }
    
}
