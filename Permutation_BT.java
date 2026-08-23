import java.util.*;
public class Permutation_BT {
    static void solve(int[] arr, boolean[] visit, List<Integer> curr){
        if(curr.size()==arr.length){
            System.out.println(curr);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(visit[i])//already visited na skip
            continue;

            visit[i]=true;
            curr.add(arr[i]);

            solve(arr,visit,curr);
            curr.remove(curr.size()-1);
            visit[i]=false;
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2};
        solve(arr, new boolean[arr.length],new ArrayList<>());
    }
}
//                        []
//                   visited=[F,F]
   //                 /         \
   //              pick1      pick2
   //               |            |
   //             [1]          [2]
    //         [T,F]        [F,T]
    //            |            |
   //          pick2        pick1
//                |            |
//             [1,2]        [2,1]
   //        [T,T]        [T,T]
///           |            |
//           PRINT        PRINT
//              |            |
         // Backtrack    Backtrack
