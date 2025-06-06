package Functions;
import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiply(a, b);
        sc.close();
    }

    public static void multiply(int x, int y) {
        int product = x*y;
        System.out.println("The product of " + x + " and " + y + " is: " + product);    }
    
}
