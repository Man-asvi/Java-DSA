package Array;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trap(height);
        System.out.println("Trapped rainwater: " + trappedWater);
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {return 0;}

        int n = height.length;
        int leftMax = 0, rightMax = 0;
        int left = 0, right = n - 1;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
    
}
