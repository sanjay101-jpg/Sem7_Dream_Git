import java.util.LinkedList;
public class Queue {
    public static void main(String[] args){
        java.util.Queue<Integer> q = new LinkedList<>();
        q.offer(8);
        q.offer(7);
        q.offer(3);
        System.out.println(q.poll());
        q.offer(4); 
        q.offer(5);
        q.poll();
        System.out.println(q);
    }
    
}
