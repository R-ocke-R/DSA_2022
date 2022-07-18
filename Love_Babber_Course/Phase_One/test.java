public class test{


    public static void pattern(int n){
        /* 
         *    1
         *   121
         *  12321
         * 1234321
         */
        for (int i = 1; i <=n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);   
    }
}