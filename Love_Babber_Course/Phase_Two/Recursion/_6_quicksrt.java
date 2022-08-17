import java.util.Arrays;

public class _6_quicksrt{

    public static int partition(int[] arr, int s, int e){
        int ele=arr[s];
        int count=0;
        //counting the real position of the pivot element
        for (int i = s+1; i <= e; i++) {
            if(arr[i]<=ele){
                count++;
            }
        }
        if(count==0) return 0;

        //swap a[0] with a[count]
        int pivotIndex=s+count;
        arr[s]=arr[pivotIndex];
        arr[pivotIndex]=ele;

        //i have p in here, now mainting >a || a || <a
        int i=s;
        int j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=ele){
                i++;
            }
            while(arr[j]>ele){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
               int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;  
                i++;
                j--; 
            }
            
            
        }
        return pivotIndex;
    }

    public static void quick(int[] arr, int s, int e){
        if(s>=e) return ;

        int p=partition(arr, s, e);

        quick(arr, s, p-1);
        quick(arr, p+1, e);
    }

    public static void main(String[] args) {
        int arr[]=new int[]{10, 20, 40, 10, 20, 30, 50, 70};
        System.out.println("Array Before Printing"+Arrays.toString(arr));
        quick(arr, 0, arr.length-1);
        System.out.println("Array After Printing"+Arrays.toString(arr));
        
    }
}