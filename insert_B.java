public class insert_B {
    public static void main(String[] args) {
        ListNode  first=new ListNode(10);
       ListNode  second=new ListNode(20);
       ListNode  third=new ListNode(30);

       first.next =second;
       second.next=third;

       ListNode head=first;

       ListNode newNode=new ListNode(5);//new node
       newNode.next=head;//point to old head
       head=newNode;//update head
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

  public   ListNode(int val) {
        this.val=val;
        this.next=null;
    }
    
}
