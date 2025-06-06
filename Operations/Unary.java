public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println("Value of a after pre-increment: " + a);
        System.out.println("Value of b after pre-increment: " + b);
        int c = 10;
        int d = c++;
        System.out.println("Value of c after post-increment: " + c);
        System.out.println("Value of d after post-increment: " + d);
        int e = 10;
        int f = --e;
        System.out.println("Value of e after pre-decrement: " + e);
        System.out.println("Value of f after pre-decrement: " + f);
        int g = 10;
        int h = g--;
        System.out.println("Value of g after post-decrement: " + g);
        System.out.println("Value of h after post-decrement: " + h);
    }
}
