import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp= arr[i];
            int j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;

        }
    }

    public static void insertionQuestionClass(String str){
        // 11th march 2022
        // Question
        // string str="EMP128AF8K3"
        // from this string we have to fetch only digits, i.e. 1 2 8 7 3, hold into integer array arr1, public void insertion sort(int arr[] as argument)
        // print in main menu, 
        // char c;
        int[] arr1;
        int count=0;
        
        for (int index = 0; index < str.length(); index++) {
            if (Character.isDigit(str.charAt(index))){
                count+=1;
            }
        }
        arr1=new int [count--];
        for (int index = 0; index < str.length(); index++) {
            if (Character.isDigit(str.charAt(index))){
                arr1[count--]=Character.getNumericValue(str.charAt(index));
            }
        }
        // System.out.println(Arrays.toString(arr1));
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        //  printing the result of a void type function calling, as array's are mutable.
    }

    public static void main(String[] args) {
        int[] arr= {3, 5, 1, 7, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        String str="EMP128AF8K3";
        insertionQuestionClass(str);

        
    }
}

