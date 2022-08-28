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
    private ListNode tail;

    private static class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }
    
    void printy(){
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
    
    public void insertHead(int value){
        
        ListNode newN= new ListNode(value);
        
        newN.next=head;
        head=newN;
        
        if(tail==null) tail=head;
    }
    
    public void insertTail(int value){
        ListNode newN= new ListNode(value);
        tail.next=newN;
        tail=tail.next;

    }

    public void insertPosition(int value, int pos){
        if(pos>length()) {
            System.out.println("Can't add at this position, will add in the end");
            insertTail(value);
            //this included the updation of tail as well which would have been handled otherwise in the end like this
            //if(temp-> next == null ) then call insert at tail.
            return;
        }
        else if(pos==1){
            insertHead(value);
            return;
        }
        else{
        //using one based indexing
        ListNode temp= head;
        ListNode newN=new ListNode(value);
        int count=1;

        while(count!=pos-1){
            count++;
            temp=temp.next;
        }
        newN.next=temp.next;
        temp.next=newN;
        return;
    }


    }
    
    public static void main(String[] args){
        // _44_LinkedList sll= new _44_LinkedList();
        // sll.head=new ListNode(1);

        // ListNode second=new ListNode(2);
        // ListNode third=new ListNode(3);
        // ListNode fourth=new ListNode(4);

        // sll.head.next=second;
        // second.next=third;
        // third.next=fourth;
        // sll.tail=fourth;

        // sll.printy();

        // sll.insertTail(5);
        // sll.printy();
        // System.out.println(sll.length());
        maincopy();
        
    }
    public static void maincopy(){
        _44_LinkedList list=new _44_LinkedList();
        list.insertHead(40);
        list.insertHead(30);
        list.insertHead(20);
        list.insertHead(10);
        list.insertTail(50);
        list.insertTail(60);
        list.insertTail(70);

        list.printy();
        
        list.insertPosition(35, 4);
        list.insertPosition(80, 9);
        System.out.println(list.length());
        list.printy();
        System.out.println(list.head.data);
        System.out.println(list.tail.data);
    }
}