public class fcx {
    public static void main(String[] args) {
		//System.out.println("Hello World");
		String s="banana";
		int[]freq=new int[26];
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    freq[ch- 'a']+
		}
		for(int i=0;i<26;i++){
		    if(freq[i]>0)
		    System.out.println(freq[i]);
		}
	}
}
