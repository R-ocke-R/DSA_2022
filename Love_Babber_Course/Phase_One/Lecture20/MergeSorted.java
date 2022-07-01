package Lecture20;

import java.util.Arrays;

public class MergeSorted {
    public static void merge(int[] arr1, int[] arr2, int n, int m){
        int[] marr=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if (arr1[i]<arr2[j]){
                marr[k++]=arr1[i++];
            }
            else{
                marr[k++]=arr2[j++];
            }
        }
        while(i<n){
            marr[k++]=arr1[i++];

        }
        while(j<m){
            marr[k++]=arr2[j++];

        }
        System.out.println(Arrays.toString(marr));

    }
    public static void main(String[] args) {
        int[] arr1=new int[]{10, 20, 30};
        int[] arr2= new int[] {15, 25, 35, 45};
        merge(arr1, arr2, arr1.length, arr2.length);
        

    }
    
}
