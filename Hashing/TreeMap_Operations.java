package Hashing;
import java.util.TreeMap;

public class TreeMap_Operations {
    public static void main(String[] args) {

        //sorts by key
        TreeMap<String, Integer> tm = new TreeMap<>(); //O(logn)

        tm.put("India", 100);
        tm.put("China",150);
        tm.put("USA", 50);

        System.out.println(tm);
    }
}