// Write a program to print the sum of longest subsequence of all the negative numbers

// Take the Input from user in the form of an array of integers.


// If all positive
// Print the same


// Else
// Longest subsequence of negative numbers
// .


import java.util.*;
public class Question_15March {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the length of array");
            int n= sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                
            }
            int flag=0;
            int summ=0;
            int finalsumm=0;
            // flag one means an active subsequence
            int count=0;
            int lon=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]<0){
                    // negative number
                    if (flag==0){
                        count=1;
                        flag=1;
                        summ=arr[i];
                        
                    }
                    else{
                        // flag 1
                        count+=1;
                        summ+=arr[i];

                    }
                }
                else{
                    // positive number
                    if (flag==0){
                        continue;

                    }
                    else{
                        if(count>lon){
                            System.out.println(count+ "here");
                            lon=count;
                            count=0;
                            flag=0;
                            
                            finalsumm=summ;
                        }
                        if(count==lon){
                            count=0;
                            flag=0;
                            if (summ>finalsumm){
                                finalsumm=summ;
                            }
                        }
                        
                    }
                }
            }
            if (flag==1 && count>lon){
                lon=count;
                finalsumm=summ;
            }
            if (flag==1 && count==lon){
                if (summ>finalsumm){
                    finalsumm=summ;
                }
            }
            System.out.println("Highest subsequence length");
            System.out.println(lon);


            System.out.println("---------");
            System.out.println(finalsumm);

        }
    }
    
}
