import java.util.*;
public class subset_BT {
    static void solve(int[] arr,int index, List<Integer> current){
        if(index==arr.length){//base cond
            System.out.println(current);
            return;
        }
        current.add(arr[index]); //choice-1...take curr element
        solve(arr,index+1,current);

        current.remove(current.size()-1);//undo

        solve(arr,index+1,current);//choice-2...skip curr element
    }
    public static void main(String[] args) {
        int[] arr={1,2};
        solve(arr,0,new ArrayList<>());
    }
}
//                []
//             /      \
//           Take    Skip
//            1        1
//          /  \      /  \
//      Take  Skip Take Skip
//        2     2    2    2
