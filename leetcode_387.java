import java.util.HashMap;
public class leetcode_387 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int k=3;
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==k)
            count++;
            if(map.get(sum-k)!=null)
            count=count+map.get(sum-k);
            Integer pre=map.get(sum);
            if(pre==null)
            map.put(sum,1);
            else
            map.put(sum,pre+1);
        }
        System.out.println("ans:"+count);
    }
    
}
