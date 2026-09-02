public class prefix_sum {
    public static void main(String[] args) {
       // Scanner s=new Scanner(System.in);
       // int n=s.nextInt();
       // int[] arr=new int[n];;
      //  for(int i=0;i<n;i++){
       //     arr[i]= s.nextInt();
      //  }
      int[] arr={2, 4, 6, 8, 10};
        int[] pre=new int[arr.length+1];
        pre[0]=0;
        for(int i=1;i<=arr.length;i++){
            pre[i]=pre[i-1]+arr[i-1];
        }
        for(int num:pre)
        System.out.println(num+" ");
        
    }
}
