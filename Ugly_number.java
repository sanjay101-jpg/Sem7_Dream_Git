import java.util.Scanner;

public class Ugly_number {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("number kudu");
        int n=sc.nextInt();
        while(n%2==0){
            n=n/2;
        }
        while(n%3==0){
            n=n/3;
        }  
        while(n%5==0){
            n=n/5;
        }  
        if(n==1){
            System.out.println("chiii aaluku number");
        }
        else{
            System.out.println("ilaa podaa");
        }            
    }
}

