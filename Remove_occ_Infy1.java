import java.util.*;
public class Remove_occ_Infy1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    String n=s.nextLine();
    char d=s.next().charAt(0);
    int max=Integer.MIN_VALUE;
    for(int i=0; i<n.length(); i++){
        if(n.charAt(i)==d){
            String temp=n.substring(0,i)+n.substring(i+1);
            int val=Integer.parseInt(temp);
            if(val>max)
            max=val;
        }
        
    }
    System.out.println(String.valueOf(max));
   
    }
}

