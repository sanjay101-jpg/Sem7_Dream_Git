public class AddTwoNumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        double sum = a + b;
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
