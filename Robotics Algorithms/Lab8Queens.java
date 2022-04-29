import java.lang.Math;
import java.util.*;
class Lab8Queens {
    static int[] current=new int[8];
    public static boolean isSafe(int testrow, int testcol){
        
        for (int i = 0; i < testrow; i++) {
            if (testcol==current[i]){
                return false;
            }
            else if (Math.abs(testrow-i)==Math.abs(testcol-current[i])){
                return false;
            }
            else{
                return true;
            }                           
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Started");
        // row 0
        for (int i = 0; i < 8; i++) {
            current[0]=i;

            for (int j = 0; j < 8; j++) {
                // row1
                if(isSafe(1, j)){
                    current[1]=j;
                }
                for (int k = 0; k < 8; k++) {
                    // row2
                    if(isSafe(2, k)){
                        current[2]=k;
                    }

                    for (int l = 0; l < 8; l++) {
                        // row3
                        if(isSafe(3, l)){
                            current[3]=l;
                        }
                        for (int p = 0; p < 8; p++) {
                            // row4
                            if(isSafe(4, p)){
                                current[4]=p;
                            }
                            for (int o = 0; o < 8; o++) {
                                // row5
                                if(isSafe(5, o)){
                                    current[5]=o;
                                }

                                for (int u = 0; u < 8; u++) {
                                    // row6
                                    if(isSafe(6, u)){
                                        current[6]=u;
                                    }
                                    for (int q = 0; q < 8; q++) {
                                        // row7
                                        if(isSafe(7, q)){
                                            current[7]=q;
                                            System.out.println(Arrays.toString(current));
                                        }
                                        
                                        
                                    }
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
