package ArrayList;
import java.util.ArrayList;

public class ContainerSize {

    public static int bruteForce(ArrayList<Integer> height) {
        int maxArea = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int area = Math.min(height.get(i), height.get(j)) * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static int twoPointer(ArrayList<Integer> height) {
        int maxArea = 0;
        int left = 0;
        int right = height.size() - 1;

        while (left < right) {
            int area = Math.min(height.get(left), height.get(right)) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxArea = bruteForce(height);
        System.out.println("Maximum area using brute force: " + maxArea);

        maxArea = twoPointer(height);
        System.out.println("Maximum area using two-pointer technique: " + maxArea);
    } 
}
