package Lecture20;

import java.util.Arrays;

public class MoveZeros{
    public static void approach1(int [] arr){
        // using linear space complexity + linear time complexity.
        int[] ex=new int [arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                ex[k++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(ex));
    }


    public static void approach2(int []arr){
        //using constant space + O(n^2) time complexity.
        //trying a modified bubble sort(O(n^2)) at each iteration/round of bubble search 
        // i'll have a zero in the end
        for (int i = 0; i < arr.length-1; i++) {
            boolean count=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                
                if(arr[j]==0){
                    // swap forward with arr[j+1]
                    count=true;arr[j]=arr[j+1];arr[j+1]=0;
                }
            }
            if (count==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void approach3(int[] arr){
        //optimisation of time complexity.
        
        int i=0;//for zero.
        while(true){
            if(arr[i]==0){
                //find next nonzero to swap with.
                for (int j = i; j < arr.length; j++) {
                    if(arr[j]!=0){
                        arr[i]=arr[j];
                        arr[j]=0;
                        break;
                    }
                    continue;
                }
                if(arr[i]==0){
                    break;//thus no more zero's
                }
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void approach4(int[] arr){
        //instead of swapping zero's I can ignore them and bring all nonzero elements in front.
        int nonzero=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=0){
                arr[nonzero]=arr[j];
                arr[j]=0;
                nonzero++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {
        int[] arr=new int[]{2, 0, 1, 3, 0, 0, 0};
        int[] arr2=new int[]{0, 1, 0, 3, 1, 2};
        approach4(arr2);
        approach1(arr);
    }

}