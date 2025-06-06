package Loop;

public class whileloop {
    public static void main(String[] args) {
        // Print numbers from 1 to 10 using while loop
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); 

        // Calculate the sum of numbers from 1 to 10 using while loop
        int sum = 0;
        i = 1; // Reset i for sum calculation
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
    }
    
}
