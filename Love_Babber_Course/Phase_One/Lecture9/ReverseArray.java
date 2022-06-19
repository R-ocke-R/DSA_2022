package Lecture9;

public class ReverseArray {
    public static void reverse(int[] arr){
        int i=0;int j=arr.length-1;
        int temp=0;
        while(i<=j){
            // swap i with j
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;

        }
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1, 4, 0, 5, -2, 15 };
        int[] brr={2, 6, 3, 9, 4};
        reverse(arr);
        reverse(brr);  
        print(arr);
        print(brr);
    }
    
}
