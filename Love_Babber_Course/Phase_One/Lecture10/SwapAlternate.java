package Lecture10;

public class SwapAlternate {
    public static void swapAlter(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i+=2) {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
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
        // reverse(arr);
        swapAlter(arr);
        swapAlter(brr);
        print(brr);
        print(arr);
    }
}
