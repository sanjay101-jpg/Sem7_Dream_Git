public class FactorialRecursion {

    public static long factorial(int x) {
        // Base case
        if (x == 0 || x == 1) {
            return 1;
        }

        // Recursive case
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        long result = factorial(n);

        System.out.println("Factorial of " + n + " is: " + result);
    }
}