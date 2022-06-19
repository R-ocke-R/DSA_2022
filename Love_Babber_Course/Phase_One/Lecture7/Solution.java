// package Love_Babber_Course.Phase_One.Lecture7;
package Lecture7;
import java.util.Arrays;
// import java.util.Scanner;

// public class Solution {
//     public static int bitwiseComplement(int n) {
// // have positive numbers so can use the right shift thing
// //         int b=0;
// //         while(n!=0){
// //             b*=10;
// //             if((n&1)!=1){
// // //                 last digit was 1
// //                 b+=1;
// //             }
// //             n>>=1;
// //         }
// //         return b;
// //     }
//         int count=0;
//         int sum=0;
//         while (n!=0){
//             int bit=(n&1);
//             //sum+=Math.pow(10,count++)*bit;// gives the decimal equivalent
//             if(bit==0){
//                 sum+=Math.pow(10, count)*1;
//             }
            
//             count++;
//             n>>=1;
//         }
//         System.out.println(sum);
//         // return sum;
//         // covert sumwhich is a binary representation to its decimal
//         count=n=0;

//         while(sum!=0){
//             int ss= (int) Math.pow(2, count++);
//             n+=ss*(sum%10);
//             // System.out.println(n);
//             sum/=10;
//         } 
//         return n;
//         // return n^1;
//     }
//     public static void test() {
//         int n=6;
//         int count=0;
//         int sum=0;
//         while(n!=0){
//             sum+=Math.pow(2, count);
//             System.out.println("for count="+count+"   "+Math.pow(2, count++));
//             System.out.println(sum);
//             n--;
//         }
        
//     }
//     public static void main(String[] args) {
//         try(Scanner sc= new Scanner(System.in)){
//             System.out.println(bitwiseComplement(sc.nextInt()));
//         }
//         // test();
//     }
// }


// question power of two
public class Solution{
    public void arr(int[] arr){
        arr[0]=50;
        System.out.println(Arrays.toString(arr));
    }
    // public boolean isPowerOfTwo(int n){
    //     // int count=0;
    //     // while(n!=0){
    //     //     int bit=(n&1);
            
    //     //     if (bit==1){
    //     //         System.out.println(bit);
                
    //     //         count++;
    //     //         break;
    //     //     }
    //     //     n>>=1;
            
    //     // }
    //     // if((count==1 && n!=0)|| count==0){
    //     //     return false;
    //     // }
    //     // return true;
    //     System.out.println(n/2);
    //     return true;
    
    public static void main(String[] args) {
        Solution ob= new Solution();
        // System.out.println(ob.isPowerOfTwo(17));
        int[] n= new int[5];
        ob.arr(n);
        System.out.println(Arrays.toString(n));
        
    }
}