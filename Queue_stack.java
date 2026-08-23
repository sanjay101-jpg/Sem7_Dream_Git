import java.util.LinkedList;
import java.util.Queue;
public class Queue_stack {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    public void push(int x){
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop(){
        return q1.poll();
    }
    public int top(){
        return q1.peek();
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Queue_stack st=new Queue_stack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
    }
    
}
