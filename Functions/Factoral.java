package Functions;
import java.util.Scanner;

public class Factoral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
        sc.close();
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1; 
        }
        return num * factorial(num - 1); 
    }
    
}
