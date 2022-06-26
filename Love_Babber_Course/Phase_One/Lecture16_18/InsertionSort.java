package Lecture16_18;

public class InsertionSort {
    public static void Insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];int j = i-1;
            for (; j >= 0; j--) {
                if(arr[i]<arr[j]){
                    // we don't swap we shift, because
                    // the elements by j loop are all already sorted.
                    arr[j+1]=arr[j];

                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        
    }
}
/* adaptive:
with I the array's first part gets sorted
SC: constant
TC: O(n^2)
*/