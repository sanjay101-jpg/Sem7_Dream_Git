public class Perfect_sum_array {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        int pr[]=new int[n];
        pr[0]=0;
        for(int i=1;i<n;i++){
            pr[i]=pr[i-1]+arr[i-1];
        }
        for(int num:pr)
        System.out.println(num);
    }
}