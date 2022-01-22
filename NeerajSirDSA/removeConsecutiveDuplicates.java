import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// [5:23 pm, 11/01/2022] Neeraj Sir Gla OOPS: Q. Write a program to remove consecutive duplicate elements in an array.

// Input values

// 10 10 30 30 40 50 50 50 9 45

// Output 
 
// 10 30 40 50 9 45

// [5:24 pm, 11/01/2022] Neeraj Sir Gla OOPS: 👆 Try to solve this question by using array and also using by Collection framework class ArrayList

public class removeConsecutiveDuplicates {

    public static void deleteAtPosition(int[] arr, int pos){
        
        try{          
            for(int i=pos;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
            
        }
        catch(ArrayIndexOutOfBoundsException o){
            System.out.println("The Input Position is invalid");
        }
    }

    public static void deleteConsequtiveArray(int[] ar){

        // brute
        // for( int i=0;i<ar.length-1;i++){
        //     if (ar[i]==ar[i+1] && ar[i]!=0){
        //         // swap elements forward
        //         deleteAtPosition(ar, i);
        //         i-=1;
        //         if(i==-1){
        //             i=0;
        //         }
        //         System.out.println(ar[i]);
        //         System.out.println(Arrays.toString(ar));
        //     }
        // }

        // int i;
        // while (n!=0){
        //     if ar[i]
        // }

        // optimized to o(n) using a worst case o(n) array to store indexes.
        int[] index= new int[4];
        // will store all the index that need to be removed, 
        // will iterate once more to remove those indexes and achieve O(n)
        // wont iterate through index array otherwise O(n^2) so will
        // keep a variable/pointer that keeps track, since the index array 
        // will already be sorted
        int pointer=0;
        for (int i=0;i<ar.length-1;i++){
            if (ar[i]==ar[i+1]){
                index[pointer++]=i+1;
            }
        }
        System.out.println(Arrays.toString(index));
        // either just print out elements exclusive of these indices
        // or can easily call the remove with pos function to these indices. but that will be o(n^2) 
        // so for O(n) will make a tradeoff with space and make a new array
        int[] fresh= new int[ar.length-index.length];
        pointer=0;
        int newp=0;
        for(int i=0;i<ar.length;i++){
            if (index[pointer]!=i){
                fresh[newp]=ar[i];
                ++newp;
            }
            else{
                pointer=(pointer==3)?3:++pointer;
            }
        }
        System.out.println(Arrays.toString(fresh));

    }
    
    public static void deleteConsequetiveList(){
        ArrayList<Integer> list= new ArrayList<>();
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Keep Entering the elements of List until -1 to stop");
            int n=sc.nextInt();
            while (n!=-1){
                list.add(n);
                n=sc.nextInt();
            }
            System.out.println("Your list looks like this :"); 
            System.out.println(list.toString());
        }
        for(int i=0;i<list.size()-1;i++){
            if (list.get(i)==list.get(i+1)){
                list.remove(i);
                i=(i==0)? 0:--i;
            }
        }
        
        System.out.println(list.toString());

    }
    
    public static void deleteConsequetiveArray2(int[] ar){
    }
    
    public static void main(String[] args) {
        int [] arr={10,10,30,30,40,50,50,50,9,45};
        // make another function to input the array elements from user, can also try making a menu driven program to choose between array and list.
        deleteConsequtiveArray(arr);
        // deleteConsequetiveList();

        
    }
}
