import java.util.HashMap;
public class Subarray_SumK {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int k=3;
        int sum=0,c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);// DO NOT MISS IT
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(map.containsKey(sum-k))
                c+= map.get(sum-k);
            map.put(sum, map.getOrDefault(sum,0) +1);

        }
        System.out.println(c);
    }
}
