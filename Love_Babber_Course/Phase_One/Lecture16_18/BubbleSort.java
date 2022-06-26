package Lecture16_18;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {   
       
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void bubbleSortOptimised(int[] arr, int n) {   
       
        for(int i=0;i<arr.length-1;i++){
            boolean count=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    count=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (count==false) break;
        }
    }

    
}
/*
 * Time Complexity= O(n^2)
 * Space constant
 * Best Case/Worst Case on this implementation are sam.
 * Optimisation:
 * if at any "round" there are no swaps, means the array is now sorted,
 * so we can break out.
 * in that implementation, best case is O(n);
 * 
 * 
 * Stable Yes
 * Inplace.
 */