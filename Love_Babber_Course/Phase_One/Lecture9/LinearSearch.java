package Lecture9;

import java.util.Scanner;

public class LinearSearch{
    public static boolean search(int[] arr, int ele){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==ele){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={5, 7, -2, 10, 22, -2, 0, 5, 22, 1};
        // whether key is present in it or not.
        try(Scanner sc= new Scanner(System.in)){
            int key= sc.nextInt();
            System.out.println(search(arr, key));
        }


    }
}