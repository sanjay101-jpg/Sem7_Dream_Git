public class remove_dup {
    public static void main(String[] args) {  
    int[] arr = {1,1,2,2,3,4,4};
    int u=1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]!=arr[i-1]){
            arr[u]=arr[i];
            u++;
        //System.out.println(arr[i]);
        }
    }
    for(int i=0;i<u;i++)
    System.out.println(arr[i]);
}
    
}
