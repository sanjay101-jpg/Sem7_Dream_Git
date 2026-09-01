import java.util.Scanner;
import java.util.Stack;

public class nextG {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    int[] ans =new int[n];
	    Stack<Integer> st=new Stack<>();
	    for(int i=0;i<arr.length;i++)
	        arr[i]=sc.nextInt();
	        
	        for(int i=n-1;i>=0;i--){
	            while(!st.isEmpty() && st.peek()<=arr[i])
	            st.pop();
	            ans[i]= st.isEmpty() ? -1: st.peek();
	            st.push(arr[i]);
	        }
	    for(int x:ans)
		System.out.println(x);
	}
}

