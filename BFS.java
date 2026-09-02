import java.util.*;

public class BFS {
        public static void main(String[] args) {

        int n = 5;

        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(4);

        boolean[] visited = new boolean[n];

        java.util.Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()) {

            int node = q.poll();
            System.out.print(node + " ");

            for(int x : graph.get(node)) {

                if(!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }
}
