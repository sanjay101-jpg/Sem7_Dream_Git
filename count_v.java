public class count_v {
    public static void main(String[] args) {
        String x="SANJAY";
        int c=0;
        for(int i=0;i<x.length();i++){
            char ch=Character.toLowerCase(x.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c++;
        }
        System.out.println("ans:"+c);


    }
}
    

