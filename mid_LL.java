import java.util.*;
public class mid_LL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("node:");
        int n=sc.nextInt();
        System.out.print("num1:");
        ListNode first=new ListNode(sc.nextInt());
        ListNode tail=first;
        for(int i=1;i<n;i++){
            System.out.print("num"+(i+1)+":");
            tail.next=new ListNode(sc.nextInt());
            tail=tail.next;
        }
        ListNode head=first;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("middle:"+slow.val);
        sc.close();
    }
}
class ListNode{
    int val;
    ListNode next;
    public  ListNode(int val){
        this.val=val;
    }
}
