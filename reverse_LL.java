public class reverse_LL {
    public static void main(String[] args) {
    ListNode first =new ListNode(10);
    ListNode second =new ListNode(20);
    ListNode third =new ListNode(30);
    first.next=second;
    second.next=third;
    ListNode head=first;
    ListNode prev=null;
    ListNode curr=head;
    while(curr!=null){
        ListNode nnext=curr.next;//save curr
        curr.next=prev;//pointer rev
        prev=curr;//prev move
        curr=nnext;//curr move
    }
    head=prev;//update head
    while(head!=null){
        System.out.print(head.val+"->");
        head=head.next;
    }
    System.out.println("null");
    }
    
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
