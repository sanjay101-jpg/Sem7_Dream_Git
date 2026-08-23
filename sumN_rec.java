public class sumN_rec {
    static int sum(int x){
        if(x<=0)return 0;
        if(x==1) return 1;
        return x+sum(x-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
