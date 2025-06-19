package Hashing;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "hearti";

        if(s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map = newHashMap(s1.length());

        for(int i=0; i<s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for(int i=0; i<s2.length(); i++) {
            char ch = s2.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                System.out.println(false);
                return;
            }
            map.put(ch, map.get(ch) - 1);
        }
        System.out.println(true);
    }

    private static <K, V> HashMap<K, V> newHashMap(int numMappings) {
        return new HashMap<>(numMappings);
    }
}
