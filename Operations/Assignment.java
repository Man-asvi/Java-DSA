public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Assignment operator
        a = b; // Assigns the value of b to a
        System.out.println("Value of a after assignment: " + a);

        // Compound assignment operators
        a += b; // Equivalent to a = a + b
        System.out.println("Value of a after += operation: " + a);

        a -= b; // Equivalent to a = a - b
        System.out.println("Value of a after -= operation: " + a);

        a *= b; // Equivalent to a = a * b
        System.out.println("Value of a after *= operation: " + a);

        float c = 100.0f;
        c /= b; // Equivalent to c = c / b
        System.out.println("Value of c after /= operation: " + c);

        int d = 50;
        d %= b; // Equivalent to d = d % b
        System.out.println("Value of d after %= operation: " + d);
    }
    
}
