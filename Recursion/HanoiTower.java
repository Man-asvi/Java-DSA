package Recursion;

public class HanoiTower {
    
    public static void main(String[] args) {
        int n = 3; // Number of disks
        char source = 'A'; // Source rod
        char destination = 'C'; // Destination rod
        char auxiliary = 'B'; // Auxiliary rod
        
        System.out.println("Steps to solve Tower of Hanoi for " + n + " disks:");
        solveHanoi(n, source, destination, auxiliary);
    }
    
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        // Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, auxiliary, destination);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        // Move the n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, destination, source);
    }
    
}
