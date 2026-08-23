public class pal_rec {
    static boolean  revS(String s1, int left,int right){
        if(left>=right)
        return true;
        if(s1.charAt(left)!=s1.charAt(right))
        return false;
        return revS(s1, left+1, right-1);
    }
    public static void main(String[] args) {
        String s="madam";
        System.out.println(revS(s,0,s.length()-1));
    }
}
