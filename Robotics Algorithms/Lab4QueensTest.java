// import java.lang.Math;
import java.util.*;
class Lab4QueensTest {
    static int[] current=new int[8];

    public static void change(){
        for (int i = 0; i < current.length; i++) {
            current[i]=-1;
        }
    }


    public static boolean isSafe(int testrow, int testcol){
        
        // for (int i = 0; i < testrow; i++) {
        //     if (testcol==current[i]){
        //         return false;
        //     }
        //     else if (Math.abs(testrow-i)==Math.abs(testcol-current[i])){
        //         return false;
        //     }
        //     else{
        //         return true;
        //     }                           
        // }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Started");
        // row 0
        for (int i = 0; i < 4; i++) {
            current[0]=i;

            for (int j = 0; j < 4; j++) {
                // row1
                if(isSafe(1, j)){
                    current[1]=j;
                
            
                for (int k = 0; k < 4; k++) {
                    // row2
                    if(isSafe(2, k)){
                        current[2]=k;
                    

                    for (int l = 0; l < 4; l++) {
                        // row3
                        if(isSafe(3, l)){
                            current[3]=l;
                            System.out.println(Arrays.toString(current));
                        }
                    }
                    }
                }
            }
        }
    
                }

    System.out.println("Completed");
    System.out.println(Arrays.toString(current));
    }
}
