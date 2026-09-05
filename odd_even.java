import java.util.*;
public class odd_even {// infy assessment
    public static int res(int n1, int[]arr1){
        int a=0,b=0;
        for(int i=0;i<n1;i++){
            if(arr1[i]%2==0)
            a=a*10+arr1[i];
            if(arr1[i]%2!=0)
            b=b*10+arr1[i];
        }
        return a+b;


    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
       int ans= res(n,arr);
        System.out.print(ans);
        }
    }
