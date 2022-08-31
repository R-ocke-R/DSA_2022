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
    int length(){
        Dnode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static void main(String[] args) {
        _44_DoublyLL list=new _44_DoublyLL();
        list.head=new Dnode(10);
        list.printy();
        System.out.println(list.length());
    }
    
}
