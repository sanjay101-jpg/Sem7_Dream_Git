import java.util.Scanner;

public class miss_maja {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=s.nextInt();
        }
        for(int num:arr)
        System.out.print(num);
        for(int i=1;i<arr.length;i++){
        if(arr[i-1]!=i)
        System.out.println("Miss:"+i);
        
    }
    }  
}