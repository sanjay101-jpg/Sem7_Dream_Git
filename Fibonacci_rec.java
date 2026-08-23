public class Fibonacci_rec {
    public static int fib(int x){
        if(x<=1)
        return x;
        return fib(x-1)+fib(x-2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fib(n));
    }
}
