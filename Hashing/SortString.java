package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortString {
    public static void main(String[] args) {

        String s = "bbaaa";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq =
            new PriorityQueue<>((a, b) -> 
                b.getValue().equals(a.getValue()) ?
                a.getKey() - b.getKey() : 
                b.getValue() - a.getValue()
            );

        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        System.out.println(sb.toString()); 
    }
}