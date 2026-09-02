import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s="([{}])";
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{')
            st.push(c);

            else{
                if(st.isEmpty()){
                System.out.println("false");
                return; 
                }
                if(c==')' && st.peek()!='('){
                System.out.print("false");
                return;
                }
                if(c==']' && st.peek()!='['){
                System.out.print("false");
                return;
                }
                if(c=='}' && st.peek()!='{'){
                System.out.print("false");
                return;
            }
                st.pop();
            }
        }
                    System.out.print(st.isEmpty());
    }
}
