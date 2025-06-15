package Greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {

    public static void main(String[] args) {
        
        int jobs[][] = {{0, 4, 20}, {1, 1, 10}, {2, 1, 40}, {3, 1, 30}};

        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[2]));

        int time = 0;

        ArrayList<Character> ans = new ArrayList<>();

        for(int i = jobs.length - 1; i >= 0; i--) {
            if(jobs[i][1] > time) {
                ans.add((char)('A' + jobs[i][0]));
                time++;
            }
        }

        System.out.println(ans);

    }
    
}
