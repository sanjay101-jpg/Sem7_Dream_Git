public class reverse_array {
    public static void main(String args[]){
        int abc[] = {10,20,30,40,50};
        int st = 0;
        int end=abc.length-1;
        while(st<end){
            int temp = abc[st];
            abc[st] = abc[end];
            abc[end] = temp;
            st++;
            end--;
    }
    for(int num:abc){
        System.out.print(num+" ");
    }
    
}
}
