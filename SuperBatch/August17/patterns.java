package August17;

public class patterns {
    public static void one(int n){
        /*
         * n=5
         * ^ ^ ^ ^ ^
         *     ^ ^ ^ ^
         *         ^ ^ ^ 
         *             ^ ^
         *                 ^
         */
        char star='^';
        char space=' ';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(space+" ");
                System.out.print(space+" ");
            }
            for (int j = i; j < n; j++) {

                System.out.print(star +" ");
                
            }
            System.out.println();
        
        }
    }
    



    public static void main(String[] args) {
        one(5);
    }
}
