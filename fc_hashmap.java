import java.util.HashMap;
public class fc_hashmap{
    public static void main(String[] args){
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1,2,3,2,3,3};
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
}
}