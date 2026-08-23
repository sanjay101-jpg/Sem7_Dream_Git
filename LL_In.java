import java.util.Scanner;
public class LL_In {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("no of node:");
        int n=s.nextInt();
        if(n<=0){
        System.out.println("null");
        return;
}
        System.out.print("num 1:");
        ListNode first =new ListNode(s.nextInt());
        ListNode tail=first;
        for(int i=1;i<n;i++){
            System.out.print("num" +(i+1) +":");
            tail.next=new ListNode(s.nextInt());
            tail=tail.next;
        }
        ListNode head=first;
        while(head!=null){
            System.out.print(head.val +"->");
            head=head.next;   
        }
        System.out.print("null");
    }
    
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;

    }
}
