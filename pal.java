public class pal {
    public static void main(String[] args){
    String s = "madam";

int left = 0;
int right = s.length()-1;

boolean f = true;

while(left < right){

    if(s.charAt(left) != s.charAt(right)){
        f = false;
        break;
    }

    left++;
    right--;
}
if(f)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
    

