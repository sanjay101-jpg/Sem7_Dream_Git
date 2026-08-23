public class LL{
    public static void main(String[] args) {
       ListNode  first=new ListNode(10);
       ListNode  second=new ListNode(20);
       ListNode  third=new ListNode(30);
       // epo connect pannanum
       first.next =second;
       second.next=third;
       //epo head add pannanum
       ListNode head=first;
       //now elemnts aa print pannanum
       while(head!=null){
        System.out.print(head.val+ "->");
        head=head.next;
       }
       System.out.print("null");
    }
}
class ListNode{
    int val;
    ListNode next;

public ListNode(int val) {
        this.val=val;
        this.next=null;
    }
    
}