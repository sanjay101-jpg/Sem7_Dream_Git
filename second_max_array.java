public class second_max_array {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int max=arr[0];
        int max2=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max){
                max2=arr[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("second max:"+max2);
        
    }
    
}
