package Lecture23;

import java.util.Arrays;
import java.util.Scanner;

public class Two_d_Array {
    public static void input(int[][] array){
        try(Scanner sc= new Scanner(System.in)){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j]=sc.nextInt();
            }
        }
    }
    }
    public static void printIndexes(int[][] array){//prints indexes for visualisation
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[0].length; i++) {
                System.out.print(j+" "+i+" - ");
            }
            System.out.println();
        }
    }
    public static void print(int[][] array){
        for (int j = 0; j < array.length; j++) {
            System.out.println(Arrays.toString(array[j]));
            
        }
    }
    public static int LinearSearch(){
        return -1;
    }
    public static int[] rowSum(){
        // returns the sum of each row.
        return new int[]{-1, -1, -1};
    }
    public static int[] columnSum(){
        // returns the sum of each column.
        return new int[]{-1, -1, -1};
    }
    public static void sinePrint(int[][] arr){
        //appraoach 1a) two while loops, first increasing i second decreasing i. middle check condition.
        //appraoach 1b) or have single while loop but it also has a flag to tell between the two.
        int i=-1;
        int j=-1;
        int n= arr.length;
        int m= arr[0].length;
        //can use a flag or can reduce space and use maths as even columns are downwise printed.
        while(++j!=m){
            //j==0, 2, 4
            if(j%2==0){
                // i=0;
                while(++i!=n){
                    System.out.print(arr[i][j]+"   ");
                }
            }
            else{
                while(--i !=-1){
                    System.out.print(arr[i][j]+"   ");

                }
            }
            // else{
            //     break; removed this by changing the if statements and while condition
            // }
            // System.out.println("\nLine  "+ i + " "+ j);
        }
    }
    public static void spiralPrint(int[][]arr){
        //idea is to run a simulation
        int row=arr.length;
        int col=arr[0].length;
        
        //using the below two variables is pretty cool logic.
        //can be used with more questions.
        int count=0;
        int total=row*col;

        // List<Integer> ans= new ArrayList<Integer>();

        int firstRow=0;
        int firstCol=0;
        int lastRow=row-1;
        int lastCol=col-1;


        while(count < total){
            for (int index = firstCol; count<total && index <= lastCol; index++) {
                System.out.print(arr[firstRow][index]+" ");
                // ans.
                count++;
            }
            firstRow++;

            for (int index = firstRow; count<total && index <= lastRow; index++) {
                System.out.print(arr[index][lastCol]+" ");
                count++;
            }
            lastCol--;
            for (int index = lastCol; count<total && index >= firstCol; index--) {
                System.out.print(arr[lastRow][index]+" ");
                count++;
            }
            lastRow--;
            for (int index = lastRow; count<total && index >= firstRow; index--) {
                System.out.print(arr[index][firstCol]+" ");
                count++;
            }
            firstCol++;
        }
    }
    public static void spiraltest(int[][] arr){
        int flag=0;
        int i=0;
        int j=0;
        int n=arr.length;
        int m=arr[0].length;

        while(flag != 3){
            i=flag;
            for (j = flag; j < m-flag; j++) {
                System.out.print(i+" "+j+"-");
            }
            System.out.println();
            --j;
            for (i = 0; i < n-flag; i++) {
                System.out.print(i+" "+j+"-");
            }
            System.out.println();
            --i;
            for (j = m-flag-1; j >= 0; j--) {
                System.out.print(i+" "+j+"-");
            }
            System.out.println();
            ++j;
            for ( i = n-flag-1; i >= 0; i--) {
                System.out.print(i+" "+j+"-");
            }
            // i++;
            flag++;
            System.out.println(
                "FULLLLLLL\n"
            );
        }
    }
    public static void rotateNinety(int[][] arr){
        int n=arr.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         int temp=arr[i][j];
  
        //     }
        // }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                // System.out.println(arr[j][i]+"  "+arr[i][j]);
            }
        }
        print(arr);
        // int n=arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[n-i-1][n-j-1];
                arr[n-i-1][n-j]=temp;

            }
        }
    }
    public static void transpose(int [][] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                // System.out.println(arr[j][i]+"  "+arr[i][j]);
            }
        }
    }
    public static int BinarySearch(int[][]arr, int ele){
        int row=arr.length;
        int col=arr[0].length;

        int s=0;int e=row*col-1;

        int mid=s+((e-s)/2);

        while(s<=e){
            int val=arr[mid/col][mid%col];
            if(val==ele){
                System.out.println("Element found via Binary Search");
                return mid;
            }
            else if(val>ele){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
            mid=s+((e-s)/2);
            
        }
        System.out.println("Element not found");
        return -1;
    }
    public static void main(String[] args) {
        // int[][] arr= new int[4][4];
        int [][] arr=new int[4][3];
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
        
        System.out.println("Enter Elements of array");
        input(arr);
        print(arr);
        System.out.println("\n\n");

        // System.out.println("Printing Sine Elements");
        // sinePrint(arr);

        // System.out.println("Printing Spiral Element");
        // spiralPrint(arr);
        // spiraltest(arr);


        // printIndexes(arr);
        // transpose(arr, arr.length);

        // System.out.println(BinarySearch(arr, 7));
        
        // System.out.println(BinarySearch(arr, 10));
        
        // System.out.println(BinarySearch(arr, 12));
        
        // System.out.println(BinarySearch(arr, 0));
        
        // System.out.println(BinarySearch(arr, 1));
    }
}
