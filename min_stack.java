import java.util.Stack;

public class min_stack {

    public static void main(String[] args) {
        Stack<Integer> main =new Stack<>();
        Stack<Integer> min=new Stack<>();
        main.push(5);
        if(min.isEmpty() || 5<=min.peek())
        min.push(5);

        main.push(3);
        if(min.isEmpty() || 3<=min.peek())
        min.push(3);
                main.push(7);
        if(min.isEmpty() || 7<=min.peek())
        min.push(7);
                main.push(2);
        if(min.isEmpty() || 2<=min.peek())
        min.push(2);
        System.out.println("main:"+main);
        System.out.println("min:"+min);
        System.out.println("min:"+min.peek());        

        int remove=main.pop();
        if(remove==min.peek())
        min.pop();
        System.out.println("after");
        System.out.println("main:"+main);
        System.out.println("min:"+min);
        System.out.println("min:"+min.peek());

}
}