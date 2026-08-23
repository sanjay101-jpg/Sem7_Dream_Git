public class search_LL {
    public static void main(String[] args) {
            
       ListNode  first=new ListNode(10);
       ListNode  second=new ListNode(20);
       ListNode  third=new ListNode(30);
       
       first.next =second;
       second.next=third;
       
       ListNode head=first;

        boolean x=false;
       ListNode temp= head;
       while(temp!=null){
        if(temp.val==20){
            x=true;
            break;
        }
        temp=temp.next;
       }
       if (x) 
       System.out.println("found");
       else
       System.out.println("no");

           
       
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
