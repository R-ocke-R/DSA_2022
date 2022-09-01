package Phase_Two.LinkedList;

import javax.print.attribute.standard.RequestingUserName;

// Circular (Singly) LL is nothing but LL with the last node's pointing to the head;
// this is done for higher applications like system links in OS, using any node we can 
// traverse the whole list; can also be used to implement a queue using only one pointer(tail of list) 
public class _44_CircularLL {

    // we only use tail pointer in CLL, as it has the power to replace both head and tail pointer of SLL.
    Lnode tail;

    private class Lnode{
        int data;
        Lnode next;
        Lnode(int data){
            this.data= data;
            this.next=null;
        }
    }
    void insert(int value){
        Lnode add= new Lnode(value);
        if(tail==null){
            add.next=add;
            tail=add;
        }
        add.next=tail.next;
        tail.next=add;
        tail=tail.next;
        // this is technically replicating insert in the end
    }
    void insert(int element, int value){

        if(tail==null) {insert(value); return;}
        //this method will make a node of value and add it after element
        Lnode add= new Lnode(value);
        // System.out.println(add.data);
        Lnode temp= tail;
        //assuming element is present in the list
        while (temp.data!=element){
            temp=temp.next;
        }
        //now element is found and temp has the element's node
        add.next=temp.next;
        temp.next=add;

        //

    }

    void printy(){
        if(tail==null) {
            System.out.println("Circular List has no nodes");
            return;
        }
        Lnode temp= tail;
        System.out.print("Tail points to -> ");

        //since we can't user temp!=tail  as the first condition, maybe we should use a do while loop here.
        while(temp.next!=tail){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    void deleteValue(int value){
        // empty list
        if(tail==null) return;
        // need to have a seperate case for when there is only one node
        if(tail.next==tail) {tail = null; return ;}
        Lnode temp= tail;
        while(temp.next.data != value){
            temp=temp.next;

        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        

    }
    
    


    public static void main(String[] args) {
        _44_CircularLL clist= new _44_CircularLL();
        clist.insert(20);
        // clist.insert(30);
        // clist.insert(40);
        // clist.printy();

        // clist.insert(20, 30);
        // clist.insert(30, 40);
        // clist.insert(40, 50);
        // // clist.printy();

        // clist.insert(20, 25);
        // clist.insert(40, 45);
        // clist.printy();

        clist.deleteValue(20);
        clist.printy();
    }

}
