import java.util.*;

// Quick Sort with last element as the pivot selection.

public class QuickSort {
    public static void Quick(int[] arr, int s, int e){
        if (s<e){
            int pivot=partition(arr, s, e);
            Quick(arr, s, pivot-1);
            Quick(arr, pivot+1, e);
        }
    }
    public static int partition(int[] arr, int a, int b){
        int pivot=b;   
        // b because in this algorithm we select the last index as the pivot 
        //  now the task is to bring the pivot to its original place.
        int i=a-1;
        for (int j = a; j <= b; j++) {
            if(arr[j]>arr[pivot]){
                // now I should swap
                i+=1;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        return i;

    // return -1;
    }

    public static void main(String[] args) {
        int[] arr;
        try(Scanner sc= new Scanner (System.in)){
            System.out.println("Enter the length of the array to be sorted, \n then all the elements");
            arr=new int[sc.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            Quick(arr, 0, arr.length-1);

        }
    }
}



// read before 27/3 class.

// Tree terminologies read. root node, leaf node, external node, internal node, siblings, ancestors, height of the tree
// level of tree, height of tree, degree of node, predecessor, sucessor.