import java.util.Arrays;
public class cookies_GREEDY {
    public static int solve(int[] g1, int[] s1){
        Arrays.sort(g1);
        Arrays.sort(s1);
        int child=0;
        int cookie=0;
        while(child<g1.length && cookie<s1.length){
            if(s1[cookie]>=g1[child]){
                child++;
            }
            cookie++;
        }
        return child;
    }
    public static void main(String[] args) {
        int[] g={1,3,2};
        int[] s={1,1};
        System.out.println(solve(g,s));
    }
    
}
