import java.util.Scanner;

public class kadane_array {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int aee[]=new int[n];
        for(int i=0;i<n;i++){
            aee[i]=s.nextInt();}
        int cs=0;
        int max=Integer.MIN_VALUE;
        for(int num:aee){
            cs=cs+num;
            if(cs<0)
            cs=0;
            max=Math.max(cs, max);
        }
        System.out.println("max:" + max);
    }
    
}
