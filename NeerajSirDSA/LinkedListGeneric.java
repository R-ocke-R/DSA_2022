class Lnode<T extends Number> {
    T data;
    Lnode<T> next;

    Lnode (T d){
        this.data=d;
    }
}



public class LinkedListGeneric<T extends Number> {
    Lnode<T> head;
    
    public int size(){
        Lnode<T> temp=head;
        int count=0;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public void insertBeg(T data){
        Lnode<T> n;
        n=new Lnode<T>(data);
        // empty list
        if (head==null){
            head=n;
            return ;
        }
        n.next=head;
        head=n;
        return;


    }
    public void Print(){
        Lnode<T> temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
    public static void main(String[] args) {
        LinkedListGeneric<Integer> ll= new LinkedListGeneric<>();
        ll.insertBeg(10);
        ll.insertBeg(10);ll.insertBeg(20);ll.insertBeg(50);
        System.out.println( ll.size());
        ll.Print();

    }
}

// 28-29 March, Working Generic Lnode, 
// can make more functions/methods for the LL class

// Questions

// 25/3

// Assume that a singly linked list is implemented with a header node but no tail node, write a class that includes
// methods to perform 
// 1) return the size of the linked list.
// 2) print the linked list
// 3) test if the value x is contained in the linked list of not.
// 4) add a value x  in the end  if it not already contained in the linked list. (this method checkes then adds)
// 5) remove the value x if it is contained in the linked list. 
// ( implement this by using the generic concept )
//  the used generic should be only byte, short, int, float, double. ( non primitive type).
