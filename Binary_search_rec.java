import java.util.Scanner;

public class Binary_search_rec {
    static int bs(int[] arr,int left,int right, int t){
        if(left>right)
        return -1;
        int mid=left+(right-left)/2;
        if(arr[mid]==t)
        return mid;
        if(t<arr[mid])
    return  bs(arr, left, mid-1, t);

    return  bs(arr, mid+1, right, t);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        int ans=bs(arr,0,arr.length-1,target);
        System.out.println(ans);
    }
}
