class del_E_LL {
    public static void main(String[] args) {
    ListNode  first=new ListNode(10);
    ListNode  second=new ListNode(20);
    ListNode  third=new ListNode(30);
    first.next=second;
    second.next=third;
    ListNode head=first;
    while(head.next.next!=null){
        head=head.next;
    }
    head.next=null;
    ListNode temp=first;
    while(temp!=null){
        System.out.print(temp.val+"->");
        temp=temp.next;
    }
    System.out.print("null");
    }
    
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
