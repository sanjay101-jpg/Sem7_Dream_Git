public class detect_captial {
    public static void main(String args[]) {
        int count=0;
        String s="USA";
        for(int i=0;i<s.length();i++){
            s.charAt(i);
            if(Character.isUpperCase(s.charAt(i)))
            count++;
        }
        if(count==s.length())
        System.out.print("true");
        else if(count==0)
        System.out.print("true");
        if (count == 1 && Character.isUpperCase(s.charAt(0)))
        System.out.print("true");
        else
        System.out.print("false");
    }
}