import java.util.HashSet;
public class single_hash {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,1,2,3,4};
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(s.contains(arr[i]))
            s.remove(arr[i]);
            else
            s.add(arr[i]);
        }
        for(int num:s)
        System.out.print(num);
    }
    
}
