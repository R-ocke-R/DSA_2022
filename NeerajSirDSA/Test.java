
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// import java.util.*;
// // public class Test {
// //     int[] a;
// //     int b;
// //     static int c;
// //     public void name() {
// //         System.out.println(a);
// //         System.out.println(b);
// //         System.out.println(c);
// //     }
// //     public static void main(String[] args) {
// //         System.out.println(c);
// //         Test ob= new Test();
// //         ob.name();
// //         System.out.println(ob.a);
// //         System.out.println(ob.b);
// //     }
// // }
// public class Test{
//     int a[];
//     Test(int size){
//         a=new int[size];

//     }
//     public void print(){
//         for(int i:a){
//             System.out.println((i));
//         }
//     }
//     public void insertAtAllLocations(Scanner sc){
//         for (int i = 0; i < a.length; i++) {
//             System.out.println("Enter element for location"+i);
//             a[i]=sc.nextInt();
//         }
//     }
//     public void insertAtPos(Scanner sc){
//         int choice=-1;
//         System.out.println("enter the pos");
//         int pos=sc.nextInt();
//         try{
//         if(a[pos]!=0){
//             System.out.println("Given Position already has an element, Inserting will Override the previous data");
//             System.out.println("Do you wish to Override \n Enter 1 to Override \n Enter 0 to Abort");
//             choice=sc.nextInt();
//             if (choice==0){
//                 return;
//             }
//             else{
//                 System.out.println("You choose to override, Please enter the data");
//                 a[pos]=sc.nextInt();
//                 return;
//             }
//         }
        
//             System.out.println("Enter data");        
//             a[pos]=sc.nextInt();
//     }
//     catch(ArrayIndexOutOfBoundsException o){
//         System.out.println(o);
//     }
//     }
    
//     public void sort(){
//         // Collections.sort(ar)
//         Arrays.sort(a);
        
//     }
    
    
//     public static void main(String[] args) {
//         try(Scanner sc= new Scanner (System.in)){
//             System.out.println("SIZE PLEASE");
//             Test ob= new Test(sc.nextInt());
//             System.out.println("MENU      -1 to exit");
//             int ch=sc.nextInt();
//             while(ch!=-1){
                
//                 ob.insertAtPos(sc);
//                 System.out.println("Enter new Choice");
//                 ch=sc.nextInt();
//             }
//             // ob.insertAtPos(sc);
//             // ob.insertAtAllLocations(sc);
//             // System.out.println(Integer.MIN_VALUE);
//             ob.print();
//         }
//     }
// }
class Helper implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // int d=      
        return o2-o1;
        // return (o2-o1);
    }

}

public class Test{
    public static void main(String[] args) {
        ArrayList<Integer> i= new ArrayList<>();
        i.add(1);
        i.add(3);
        i.add(0);
        System.out.println(i.toString());
        Collections.sort(i);
        System.out.println(i.toString());
        Collections.sort(i, new Helper());
        System.out.println(i.toString());
    }
}