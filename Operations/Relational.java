public class Relational {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual);

        boolean isNotEqual = (a != b);
        System.out.println("Is a not equal to b? " + isNotEqual);

        boolean isGreater = (a > b);
        System.out.println("Is a greater than b? " + isGreater);

        boolean isLess = (a < b);
        System.out.println("Is a less than b? " + isLess);

        boolean isGreaterOrEqual = (a >= b);
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);

        boolean isLessOrEqual = (a <= b);
        System.out.println("Is a less than or equal to b? " + isLessOrEqual);
    }
    
}
