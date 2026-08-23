import java.util.*;
public class next_greater {
    public static void main(String[] args) {
        int[] arr={4,5,2,10};
        int[] ans= nextGreator(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] nextGreator(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){// travel from right to left
            while(!st.isEmpty() && st.peek()<=arr[i]){//remove smaller and equal elements
                st.pop();
            }
            if(st.isEmpty())
            res[i]=-1;
            else
            res[i]=st.peek();
            st.push(arr[i]);//push curr elements


        }
        return res;
    }
}
