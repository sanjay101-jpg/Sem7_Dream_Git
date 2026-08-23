public class peak_162 {
    public static int peak(int nums[]){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<nums[mid+1])
            l=mid+1;
            else
            r=mid;
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(peak(arr));
    }
    
}
