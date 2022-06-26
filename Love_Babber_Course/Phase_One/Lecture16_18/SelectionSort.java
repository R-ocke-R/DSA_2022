package Lecture16;

public class SelectionSort {
    
}

// Space complexity O(1)
//  Time complexity O(n^2)

// note best case / worst case complexity for time remains the same.


// Applications : can be considered when small si3e of input and we need O(1) space.
class Solution {
	public static void selectionSort(int arr[], int n) {
        int min;
        
		for(int i=0;i<arr.length-1;i++){
            min=i;
            
            for( int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                    
                }
            }
//             System.out.println(min);
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
               
        }
	}
}