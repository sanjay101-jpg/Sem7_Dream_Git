public class Armstrong_number {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int og = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == og) {
            System.out.println(og + " is an Armstrong number.");
        } else {
            System.out.println(og + " is not an Armstrong number.");
        }
        sc.close();
    }
}
