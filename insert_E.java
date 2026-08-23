import java.util.*;
public class insert_E {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("node:");
        int n=s.nextInt();
        if(n<=0){
            System.out.print("null");
            return;
        }
        System.out.print("num1:");
        ListNode first=new ListNode(s.nextInt());
        ListNode tail=first;
        for(int i=1;i<n;i++){
            System.out.print("num"+(i+1)+":");
            tail.next=new ListNode(s.nextInt());
            tail=tail.next;
        }
        ListNode head=first;
        ListNode temp=head;
        System.out.print("add-num:");
        ListNode newNode =new ListNode(s.nextInt());
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        while(head!=null){
            System.out.print(head.val+"->");
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
