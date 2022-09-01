package Phase_Two.LinkedList;

public class _44_DoublyLL {
    //making head public so that I could be able to use this outside DoublyLL class
    public Dnode head;
    private static class Dnode{
        int data;
        Dnode next;
        Dnode prev;
        Dnode(int d){
            this.data=d;
            this.next=null;
            this.prev=null;
        }
    }

    void printy(){
        Dnode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(" null");
    }

    void prevtraversal(){
        System.out.println("Forward Print");
        Dnode temp=head;
        Dnode prev=null;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            prev=temp;
            temp=temp.next;
        }
        System.out.println(" null");
        System.out.println("Previous Traversal");
        // System.out.println(prev.data);
        // Dnoce
        System.out.print("null");
        
        while(prev!=head){
            System.out.print(" <- "+prev.data);
            prev=prev.prev;

        }
        System.out.println(" <- "+ head.data);
        
    }
    
    int length(){
        Dnode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void insertHead(int value){
        Dnode one= new Dnode(value);
        one.next=head;
        if(head!=null){
            head.prev=one;
        }
        head=one;
        return;
    }

    public void insertTail(int value){
        //handle the head=null case here also
        Dnode last=new Dnode(value);
        Dnode temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=last;
        last.prev=temp;
        return;
    }

    public void insertPosition(int value, int pos){
        if(head==null || pos==1 || pos==0) {insertHead(value); return;}
        if(pos>length()){ insertTail(value); return; }
        int count=1;
        Dnode temp= head;
        Dnode mid= new Dnode(value);
        while( count!= pos-1){
            temp=temp.next;
            count++;
        }
        temp.next.prev=mid;
        mid.next=temp.next;
        temp.next=mid;
        mid.prev=temp;
    }
    public void deleteFirst(){
        head=head.next;
        head.prev=null;
    }

    public void delelePosition(int pos){
        if(head==null || pos>length()) return ;
        if(pos==1) {
            if(length()==1) head=null;
            else deleteFirst();
            return;
        }
        int count=1;
        Dnode temp= head;
        while(count!=pos-1){
            count++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(temp.next==null){return;}
        temp.next.prev=temp;
        return ;
    //     if(head==null || pos==1 || pos==0) {insertHead(value); return;}
    //     if(pos>=length()){ insertTail(value); return; }
    //     int count=1;
    //     Dnode temp= head;
    //     Dnode mid= new Dnode(value);
    //     while( count!= pos-1){
    //         temp=temp.next;
    //         count++;
    //     }
    //     temp.next.prev=mid;
    //     mid.next=temp.next;
    //     temp.next=mid;
    //     mid.prev=temp;
    }
        

    public static void main(String[] args) {
        _44_DoublyLL list=new _44_DoublyLL();

        //checking insert Head
        // list.head=new Dnode(10);
        list.insertHead(10);
        list.insertHead(8);
        list.insertHead(6);
        list.insertHead(4);
        // list.printy();
        // System.out.println(list.length());

        //this function is better equipped to check whether the pointers are right or not
        // list.prevtraversal(); 


        //checking insertTail fucntion 
        list.insertTail(12);
        list.insertTail(14);
        list.insertTail(16);

        // list.prevtraversal();
        // System.out.println(" Current Length of the list "+list.length());

        // list.insertPosition(2, 1);
        // list.insertPosition(0, 0);
        // list.prevtraversal();


        // list.printy();
        // System.out.println(list.length());
        // list.insertPosition(18, 7);
        // list.prevtraversal();

        //covered and checked all three insert functions.

        //delete nodes.
        list.printy();
        list.delelePosition(8);
        list.prevtraversal();

        //deleting nodes at all points implemented and checked.
        //moving to circular linked list now.


    }
    
}
