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
    
    public static void two(int n){
        /*
         * ^ ^ ^ ^ ^
         * ^       ^
         * ^       ^
         * ^       ^
         * ^ ^ ^ ^ ^
         */
        String star="^ ";
        String space="  ";
        for (int i = 0; i < n; i++) {
            
            if(i==0 || i==n-1){
                System.out.println(star.repeat(n)); 
            }
            else{
                System.out.print(star);
                System.out.print(space.repeat(n-2));
                System.out.println(star);
            }         
            
        }
    }
    public static void three(int n){
        /*
         *    ^       ^
         *      ^   ^ 
         *        ^       
         *      ^   ^       
         *    ^       ^
         */
        String star="^ ";
        String space="  ";
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if(i==j || i+j==n-1){
                    System.out.print(star);
                }
                else{
                    System.out.print(space);
                }
            }     
            System.out.println();  
            
        }
    }
    public static void four(int n){
        /*
         *  
         *     ^  
         *    ^ ^ 
         *   ^ ^ ^ 
         *  ^ ^ ^ ^
         * ^ ^ ^ ^ ^
         *  
         * 
         * odd even logic
         */
    }
    public static void five(int n){
        /*
         * n=5
         *     |^ ^ ^ ^ ^
         *     |    ^ ^ ^ ^
         *     |        ^ ^ ^ 
         *     |            ^ ^
         *     |                ^
         *     |            ^ ^
         *     |        ^ ^ ^
         *     |    ^ ^ ^ ^
         *     |^ ^ ^ ^ ^
         * 
         */
        // char star='^';
        // char space=' ';

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(space+" ");
        //         System.out.print(space+" ");
        //     }
        //     for (int j = i; j < n; j++) {
        //         System.out.print(star +" ");
        //     }
        //     System.out.println();
        
        // }
    }
    



    public static void main(String[] args) {
        three(10);
    }
}
