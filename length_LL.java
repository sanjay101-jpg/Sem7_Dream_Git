public class length_LL {
        public static void main(String[] args) {
        ListNode  first=new ListNode(10);
        ListNode  second=new ListNode(20);
        ListNode  third=new ListNode(30);
            
        first.next =second;
        second.next=third;
            
        ListNode head=first;
            
        int count=0;
        ListNode temp= head;
        while(temp!=null){

        count++;
        temp=temp.next;
        }
        System.out.print(count);
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
