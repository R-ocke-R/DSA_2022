package Phase_Two.Recursion;

import java.util.Scanner;

class Fibonacci{
    
    public static int Fibo(int n){
        if(n==0 || n==1) return n;
        if (n==2) return 1;
        return Fibo(n-1)+Fibo(n-2);
    }
    public static int FiboIterative(int n){
         
        if(n==1 || n==2)return n-1;
        // we can use these variables and keep printing c, or if have to return all upto nth term use array
        // then fib[i]=fib[i-1]+fib[i-2]; 

        int a=0;
        int b=1;
        int c=a+b;

        for (int i = 3; i <= n; i++) {
            c=a+b;
            //now c is the new value
            a=b;
            b=c;
        }    
        return c;
    }
    
    public static void main(String[] args) {

        // Custom input
        try(Scanner sc= new Scanner(System.in)){
            int n=sc.nextInt();
            System.out.println(FiboIterative(n));
        }

        //printing a range to check
        // System.out.println("Terms of Fibonacci series are :-");
        // for(int i=1; i<40; i++)
        // {
        //     System.out.print(Fibo(i)+" ");
        // }

    }
}