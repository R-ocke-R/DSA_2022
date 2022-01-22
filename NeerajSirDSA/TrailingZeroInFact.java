import java.util.Scanner;

// Me Bean is very good in mathematics. 
// He was given a number n and was told to find out number of trailing zeroes in n! (Factorial) . 
// Can you help him?

// Sample Input
// 5
// Sample Output
// 1
// Explanation
// 5! (Factorial) is 120, so there is one trailing zero.

// Implement it by using loop */


public class TrailingZeroInFact {

    public static int factBrute(int n) {
        int pro=1;
        for (int i=1; i<=n;i++){
            pro*=i;
        }
        return pro;
    }

    public static void brute(int n){
        int pro=factBrute(n);
        // pro has the factorial now.
        int l, count=0;
        while(pro!=0){
            l=pro%10;
            if(l==0){
                count+=1;
                pro/=10;
                continue;
            }
            else{
                break;
            }
        }
        System.out.println("Trailing zeroes for the given number n are "+count);
    }

    public static void factOp(){
        //  how can i Optimize this solution. ??
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("HELLO MR. Bean, we are here to help you please, enter the value of N");
            brute(sc.nextInt());
            
            
            // for (int i=0;i<=50;i++){
            //     System.out.println("factorial of "+i+" "+factBrute(i));
            // }
        
        }
        
    }
}
