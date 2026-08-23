public class rev_string_rec {
    static void rev(String s1, int index){
        if(index==s1.length())
            return;
        rev(s1,index+1);
        System.out.println(s1.charAt(index));

    }
    public static void main(String[] args) {
        String s="sanjay";
        rev(s,0);
    }
}
