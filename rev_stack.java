import java.util.*;
public class rev_stack{
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        st.push('h');
        st.push('e');
        st.push('l');
        st.push('l');
        st.push('o');
        for(int i=1;i<=5;i++){
            System.out.println(st.pop());
        }
    }
}