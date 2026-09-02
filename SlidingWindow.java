public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 1, 3, 2};
        int k=3,sum=0,max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(i>=k)
            sum=sum-arr[i-k];// newsum=oldsum-outgoing+incoming

             if(i>=k-1)
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
