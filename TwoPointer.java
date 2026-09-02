import java.util.*;
public class TwoPointer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int k=sc.nextInt();
        int l=0, r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==k){
            System.out.println("true");
            return;
            }
            else if(sum<k)
            l++;

            else
            r--;
        }
        System.out.println("false");
    }
}