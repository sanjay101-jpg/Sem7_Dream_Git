
import java.util.HashSet;

public class Longest_Substring{
    public static void main(String[] args) {
        String s="abcabcbb";
        HashSet<Character> st=new HashSet<>();
        int l=0,max=0;
        for(int r=0;r<s.length();r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }
        System.out.println(max);
    }
}