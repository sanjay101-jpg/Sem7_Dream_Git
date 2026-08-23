import java.util.*;
public class reverse_list {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
    
}
