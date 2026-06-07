public class missing_array {

    public static void main(String args[]){
        int arr[]={1,2,3,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.err.println();
        int count;
        for(count=1;count<=arr.length;count++){
            int j;
            for(j=0;j<arr.length;j++){
                if(arr[j]==count){
                    break;
                }
            }
            if(j==arr.length){
                System.out.print("missing:"+count);
            }
        }

    }
}