package Lecture21;

import java.util.Arrays;

public class RotateArray {
    public static void rotater(int [] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s++]=arr[e];
            arr[e--]=temp;
        }
        return;
        // for arraylist instead of array, use Collection.swap(s++, e--);

    }
    public static void main(String[] args) {
        int[] arr= new int[]{10, 20, 40, 50 , 60};
        System.out.println("Array before Rotation");
        System.out.println(Arrays.toString(arr));
        rotater(arr);
        System.out.println("Array after Rotation");
        System.out.println(Arrays.toString(arr));
    }

}
