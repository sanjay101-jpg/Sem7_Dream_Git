
import java.util.Scanner;
public class rec{
static void print(int x){
    if(x<=0)
    return;
        print(x-1);
System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter n:");
        int n=s.nextInt();
        print(n);

    }
}