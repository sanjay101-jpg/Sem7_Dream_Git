
public class BT {
    static void generate(String curr, int n){
        if(curr.length()==n){// base condition
            System.out.println(curr);
            return;
        }
        generate(curr+"0", n);// choice -1....add 0

        generate(curr+"1", n);//choice-2...add 1
    }
    public static void main(String[] args) {// Generate all binary strings of length 3
        //Scanner s=new Scanner(System.in);
        //int n1=s.nextInt();
        generate("", 3);
    }
}
//                 ""
//              /      \
//            0          1
//          /   \      /   \
//        00    01   10    11
//       / \   / \   / \   / \
//    000001010011100101110111
