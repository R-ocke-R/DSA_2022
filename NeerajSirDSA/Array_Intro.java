import java.util.Arrays;
import java.util.Scanner;

public class Array_Intro {
    //We start by declaring a dynamic array, its used in order to make and utilize individual functiions each of 
    // insertion deletion and so on. 
    int[] arr=null;
    // storing null to reference data type array
    // static means the variable is of dynamic scope. WRONG. statis makes it belong to the class and not the obj.
    // and hence i dont see a way to using static type here.
    Array_Intro(int size){
        arr= new int[size];
    }

    public void printy(){
        System.out.println("~~~~~"+Arrays.toString(arr)+"~~~~~");
    }

    public void insertAtPosition(int pos, int data) {
        try{
            //considering the case that the postition is empty
            if(arr[pos]==Integer.MIN_VALUE){
                arr[pos]=data;
            }
            else{
            //considering the case that the postition is filled
                System.out.println("position already filled");
            }
            
        }
        catch(ArrayIndexOutOfBoundsException o){
            System.out.println("The Input Position is invalid");
        }        
    }

    public void insertWithShifting(int pos, int data, Scanner sc){
        try{
            if(arr[pos]==Integer.MIN_VALUE){
                arr[pos]=data;
            }
            else{
                //considering the case that the postition is filled
                //need to swap forward
                System.out.println("DESCLAIMER- the given position is already filled so the data at the last index would be overwritten as it will move out of array's size scope, enter 0 to continue 1 to abort");
                if (sc.nextInt()==1){
                    System.out.println("MISSION ABORT");
                    return;
                }
                for(int i=arr.length-1;i>pos;i--){
                    arr[i]=arr[i-1];
                }
                arr[pos]=data;
            
            }
            
        }
        catch(ArrayIndexOutOfBoundsException o){
            System.out.println("The Input Position is invalid");
        } 
    }

    public void deleteAtPosition(int pos){
        
        try{
            if (arr[pos]==Integer.MIN_VALUE){
                System.out.println("No Element present");
            }
            else{
                for(int i=pos;i<arr.length-1;i++){
                    arr[i]=arr[i+1];
                }
                arr[arr.length-1]=Integer.MIN_VALUE;
            }
        }
        catch(ArrayIndexOutOfBoundsException o){
            System.out.println("The Input Position is invalid");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter size of your array"); 
            Array_Intro obj=new Array_Intro(sc.nextInt());
            System.out.print("Your array looks like this when initiated ->");obj.printy();
                    // System.out.println("\nEnter 1 to fill it with MINVALUE \nEnter 2 to keep it filled with zero");
                    // if (sc.nextInt()==1)
            Arrays.fill(obj.arr, Integer.MIN_VALUE);
            System.out.print("Array with MIN VALUE as default ->");obj.printy();
                    //switch case with all the different choices available for "effective" manipulation of data in your array.
            System.out.println("Enter choice \n-1  |||  exit \n0   |||  print\n1   |||  input at position\n2   |||  input at position with swapping\n3   |||  delete with position");
            int ch= sc.nextInt();
            while(ch!=-1){
                
                switch(ch){
                    case 0 -> obj.printy();
                    case 1 -> {
                    System.out.println("Enter position to input element as well as the data to put");
                    obj.insertAtPosition(sc.nextInt(), sc.nextInt());}
                    case 2 -> {
                        System.out.println("Enter position to input element as well as the data to put");
                        obj.insertWithShifting(sc.nextInt(), sc.nextInt(), sc);
                    }
                    case 3 -> {
                        System.out.println("Enter position to remove element");
                        obj.deleteAtPosition(sc.nextInt());
                    }
                    default -> System.out.println("wrong choice you idiot");
                }
                System.out.println("\nEnter new choice\n");
                ch= sc.nextInt();
            } 
            
        }
        
    } 
} 
