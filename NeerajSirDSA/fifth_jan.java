// First Lab.

import java.util.ArrayList;
import java.util.Scanner;

// array as a language level feature.
// question
// create an array of 10 integer type elements input all values from the user and print the sum of all the elements.

public class fifth_jan{
    public static void main(String[] args) {
        int[] arr= new int[10];
        try (Scanner sc = new Scanner(System.in)){
            for (int i=0; i<10; i++){
                arr[i]=sc.nextInt();

            }
        
        }
        // ArrayList<Integer> l =new ArrayList<>();

        int sm=0;
        for (int i=0; i<10; i++){
            sm+=arr[i];

        } 
        System.out.println(sm);
    }
}

class two{
    public static void main(String[] args) {
        
        String input;
        try (Scanner sc = new Scanner(System.in)){
            input= sc.next();
        }
        char[] arr=input.toCharArray();
        int sm=0;
        for (int i=0; i<input.length();i++){
            sm+= Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sm);
    }
}
//chararray  to char array, method in string class



//  input string from user and identify the number of vowels.

class three{
    public static void main(String[] args) {
        String input;
        try (Scanner sc = new Scanner(System.in)){
            input= sc.next();
        }
        int count=0;
        for (int i=0; i<input.length();i++){
            char a=input.charAt(i);
            
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ){
                count+=1;
            }
        }
        System.out.println(count);          
    }
}
// input two string and check if they are anagram or not.
// length same, character frequency same, sequence changed. not or ton.
class four{
    public static void main(String[] args) {
        String one;
        String two;
        try(Scanner sc= new Scanner(System.in)){
            one= sc.next();
            two= sc.next();

        }
        char arr[] = one.toCharArray();
        char temp;
        int i = 0;
        while (i <= arr.length) {
            int j = i + 1;
            while (j <= arr.length) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        char arrr[] = two.toCharArray();
        char tempp;
        int ii = 0;
        while (ii <= arrr.length) {
            int j = ii + 1;
            while (j <= arrr.length) {
                if (arrr[j] < arrr[i]) {
                    tempp = arrr[i];
                    arrr[i] = arrr[j];
                    arrr[j] = tempp;
                }
                j += 1;
            }
            ii += 1;
        }
        if (arrr.equals(arr)){
            System.out.println("ANAGRAM");
        }
        else{
            System.out.println("NON ANAGRAM");
        }
    }
}




//  create a class student having three private attributes, name marks rollno
//  store 10 student in array
//  print the difference between minimum marks and maximum marks.
class Student{
    private String name;
    private int marks;
    private int rollno;
    Student(String n, int m, int r){
        name=n;
        marks=m;
        rollno=r;
    }
    public int getMarks(){
        return marks;
    }
}
class five{
    public static void main(String[] args) {
        Student[] arr= new Student[3];
        try (Scanner sc = new Scanner(System.in)){
            for (int i=0; i<3; i++){
                arr[i]=new Student(sc.next(), sc.nextInt(), sc.nextInt());                
            }
        }
        int max=arr[0].getMarks();
        int min =arr[0].getMarks();
        for (int i=0; i<3; i++){
            int m=arr[i].getMarks();
            if (m<min){
                min=m;
            }
            if (m>max){
                max=m;
            }
                            
        }
        System.out.println(max-min);
//  print second highest.
    }
}
//  repeated characters ke index.
// class six{
//     public static void main(String[] args) {
//         String input;
//         try(Scanner sc = new Scanner(System.in)){
//             input=sc.next();
//         }
//         String freq= new String();
//         for (int i=0; i<input.length(); i++){
            
//     }

// }