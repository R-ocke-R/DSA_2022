package Phase_Two.Recursion;

public class _4_powab {

    public static int pow(int a, int b){
        if(b==0) return 1;
        if(b==1) return a;
        // System.out.println(a);
        if((b&1)==1) return a*pow(a, b>>1)*pow(a, b>>1);
        // System.out.println(a);
        return pow(a, b>>1)*pow(a, b>>1);
    }

    public static void main(String[] args) {
        for (int i = 10; i < 11; i++) {
            System.out.println(pow(3, i));
        }
    }
    
}
