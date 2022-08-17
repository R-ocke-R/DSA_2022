package August17;
public class August17 {

    
    
    public static void fibonacci(int n ){
        int a=0;
        int b=1;
        int c=a+b;
        if (n==0) {
            System.out.println(a);
            return ;
        }
        if (n==1) {
            System.out.println(b);
            return;
        }
        

        for (int i = 2; i < n; i++) {
            c=a+b;
            b=c;
            a=b;
            
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        // int x=9;

        // int c= x+ x++ + 8+ x+ x--;
        // System.out.println(c);

        fibonacci(2);
    }

    
}
