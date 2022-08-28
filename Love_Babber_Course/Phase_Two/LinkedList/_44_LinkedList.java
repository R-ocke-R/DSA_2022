package Phase_Two.LinkedList;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//     }
// }
public class _44_LinkedList{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static void printy(ListNode head){
        ListNode current= head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
        return;
    }
    public int length(){
        if(head==null) return 0;
        int count=0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertFirst(int value){
        ListNode newN= new ListNode(value);
        newN.next=head;
        head=newN;
    }
    public static void main(String[] args){
        _44_LinkedList sll= new _44_LinkedList();
        sll.head=new ListNode(1);

        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;

        printy(sll.head);

        sll.insertFirst(5);
        printy(sll.head);
        System.out.println(sll.length());
        
    }
}