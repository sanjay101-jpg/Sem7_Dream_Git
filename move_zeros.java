public class move_zeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[a]=arr[i];
                a++;
            }
           
        }
        while(a<arr.length){
            arr[a]=0;
            a++;
        }
        for(int nums:arr)
        System.out.println(nums);
    }
    
}
