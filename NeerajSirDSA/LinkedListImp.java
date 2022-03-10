// import java.util.*;
class nod{
    int data;
    nod next;
    nod(int d){
        this.data=d;

    }
}



public class LinkedListImp {
    nod head=null;

    public void insertBeg(int data){
        try{
        nod n= new nod(data);
        // case 1 empty Linked List'
        if (head==null){
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }
    catch(Exception o){
        System.out.println("An error occured while Executing insertBeg   "+ o);
    }

    }
    public void print(){
        // for(int i:nod){
        nod tem=head;
        while (tem!=null){
            System.out.print(tem.data);
            System.out.print("  ->  ");
            tem=tem.next;
            
        }
    }
    public int count(){
        int c=0;
        nod tem= head;
        while (tem!=null){
            tem=tem.next;
            c+=1;
        }
        return c;
    }
    public void insertEnd(int data){
        try{
            nod n=new nod(data);
            nod tem=head;
        while(tem.next!=null){
            tem=tem.next;

        }
        tem.next=n;
    }
    catch(Exception o){}
// there can be a insert at end that uses a tail in the implementation itelf

    }
    // remove duplicate
    // remove data
    // remove pos
    // remove start, end

    // advanced DS based
    // chop into half by removing every other node
    // cycle detection
    // even odd lists
    // polynomial addition
    public void remove(int data){
        
        // empty case also.
        // better to make a postion searching and then check if pos 1 then head= head.next if last:: if middle ::
        // can't remove if empty, 
        if (head.data==data){
            // when first element has the data
            head=head.next;
        }
        else{
            nod pre=head;
            nod tem=head.next;
            while (tem!=null){
                if (tem.data==data){
                    pre.next=tem;
                }
                pre=pre.next;
                tem=tem.next;

            }
            // if at last? or if not then??
        }
    }
    


    public static void main(String[] args) {
        LinkedListImp ob= new LinkedListImp();
        ob.insertBeg(2);
        ob.insertBeg(3);
        ob.insertBeg(4);
        ob.insertBeg(5);
        ob.print();
        System.out.println();
        System.out.println(ob.count());

        ob.insertEnd(6);
        ob.print();
        System.out.println();
        System.out.println(ob.count());
    }
    
}
