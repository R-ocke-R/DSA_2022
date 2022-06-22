package Lecture12_15;

import java.util.Scanner;

public class BinarySearch {
    public static int BSearch(int[] arr, int ele){
        int start= 0;
        int end= arr.length-1;
        
        while(start<=end){
            
            // int mid= (start+end)/2;
            // Optimising this.
            int mid=start+((end-start)/2); 
                        
            if (arr[mid]==ele){
                return mid;

            }
            else if(arr[mid]>ele){
                end=mid-1;
            }
            else{
                start=mid+1;

            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={5, 7, 7, 8};
        int ele;
        // binary search works on sorted array
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter ele to search");
            ele= sc.nextInt();
        }
        System.out.println(BSearch(arr, ele));
    }

    
}
