import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
    int i,n,fact=1;
    n=s.nextInt();
    for(i=1;i<=n;i++){
    fact=fact*i;
    }
    System.out.print("ans:"+fact);
    }
    
}
