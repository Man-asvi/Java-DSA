package Loop;

public class forloop {
    public static void main(String[] args) {
        // Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 

        // Calculate the sum of numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
    }
    
}
