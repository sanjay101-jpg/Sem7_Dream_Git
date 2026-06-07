public class miss {
    public static void main(String args[]){
        int arr[]={1,2,4,5};
        int n=5;
        int s1=0;
        int total=0;
        for(int i=0;i<arr.length;i++){
            s1=s1+arr[i];
        }
        System.out.println("Sum:"+s1);
        total=n*(n+1)/2;
        int res=total-s1;
        System.out.println("missing:"+res);
    }  
}
