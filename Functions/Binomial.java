package Functions;

public class Binomial {
    public static void main(String[] args) {
        int n = 5; // Total number of items
        int k = 2; // Number of items to choose
        int result = binomialCoefficient(n, k);
        System.out.println("Binomial Coefficient C(" + n + ", " + k + ") is: " + result);
    }

    public static int binomialCoefficient(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}