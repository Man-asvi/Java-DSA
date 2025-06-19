package Hashing;
import java.util.LinkedHashMap;

public class LinkedHashMap_Operations {
    public static void main(String[] args) {

        //Maintains order of insertion
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China",150);
        lhm.put("USA", 50);

        System.out.println(lhm);
    }
    
}
