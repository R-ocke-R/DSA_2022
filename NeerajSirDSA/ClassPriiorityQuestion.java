//  7 th march class question

import java.util.Scanner;
class nooode{
    int datasum;
    int countpriority;
    nooode next;
    nooode(int ds, int cp){
        datasum=ds;
        countpriority=cp;
    }
}
class PriorityQueue{
    
    static nooode head;
    PriorityQueue(){
        head=null;
    }
    public void Enqueue(int ds, int cp){
        nooode nn= new nooode(ds, cp);
        if (head==null || nn.countpriority< head.countpriority){
            nn.next=head;
            head=nn;
            return;
        }
        else{
            nooode temp= head;
            while (temp.next!=null && temp.next.countpriority<=nn.countpriority){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
    }
    public void printy(){
        nooode temp=head;
        System.out.println(" COUNT   SUM");
        while (temp!=null){
            System.out.println(temp.countpriority+"   "+temp.datasum);
            temp=temp.next;
        }
        
    }
}

public class ClassPriiorityQuestion {
    
    public static boolean prime(int n){
        // if (n==1))5
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            int n=sc.nextInt();
            int[] arr= new int[n];
            boolean[] prim= new boolean[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                prim[i]=prime(arr[i]);
            }
            int count=0;
            for (boolean b : prim) {
                if (b==true){
                    count+=1;
                }
            }
            if (count==0){
                System.out.println("array has no prime numbers");
            }
            else{
                int pc=0;
                int sum=0;
                PriorityQueue q= new PriorityQueue();
                for (int i = 0; i < prim.length; i++) {
                    if(prim[i]==true){
                        pc+=1;
                        sum+=arr[i];
                    }
                    else{
                        q.Enqueue(sum, pc);
                        pc=0;
                        sum=0;
                    }
                }
                q.printy();
            }
        }
    }
}


//  groups the sum if there are prime consequetive numbers and then the group ( once we get a next non prime)  is added to priority queue based on
// thier priority  of count