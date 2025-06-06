package Loop;

public class dowhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println(); 

        // Calculate the sum of numbers from 1 to 10 using do-while loop
        int sum = 0;
        i = 1; 
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
    }
    
}
