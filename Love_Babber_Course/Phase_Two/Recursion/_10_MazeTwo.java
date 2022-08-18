package Phase_Two.Recursion;
import java.util.*;
public class _10_MazeTwo {
    public static boolean check(int cr, int cc, char direction, int[][] arr, int[][] sol){
        if(direction=='d' && cr+1<arr.length && arr[cr+1][cc]==1 && sol[cr+1][cc]==0){
            return true;
        }
        else if(direction=='r' && cc+1<arr[0].length && arr[cr][cc+1]==1  && sol[cr][cc+1]==0){
            return true;
        }
        else if(direction=='l' && cc-1>=0 && arr[cr][cc-1]==1  && sol[cr][cc-1]==0){
            return true;
        }
        else if(direction=='u' && cr-1>=0 && arr[cr-1][cc]==1  && sol[cr-1][cc]==0){
            return true;
        }
        return false;
    }


    public static void four(int[][]arr, int sol[][], int cr, int cc, ArrayList<String> ans, StringBuilder path){
        //base 
        if(cr==arr.length-1 && cc==arr[0].length-1){
            ans.add(new String(path));
            return;
        }
        if(check(cr, cc, 'd', arr, sol)){
            path.append('D');
            sol[cr][cc]=1;
            four(arr, sol, cr+1, cc, ans, path); 
            path.setLength(path.length()-1);
            sol[cr][cc]=0;
        }
        //rihgt
        if(check(cr, cc, 'r', arr, sol)){
            path.append('R');
            sol[cr][cc]=1;
            four(arr, sol, cr, cc+1, ans, path); 
            path.setLength(path.length()-1);
            sol[cr][cc]=0;
        }
        //rleft
        if(check(cr, cc, 'l', arr, sol)){
            path.append('L');
            sol[cr][cc]=1;
            four(arr, sol, cr, cc-1, ans, path); 
            path.setLength(path.length()-1);
            sol[cr][cc]=0;
        }
        //up
        if(check(cr, cc, 'u', arr, sol)){
            path.append('U');
            sol[cr][cc]=1;
            four(arr, sol, cr-1, cc, ans, path); 
            path.setLength(path.length()-1);
            sol[cr][cc]=0;
        }
        return;
    }



    public static void main(String[] args) {
        int[][] arr=new int [4][4];
        arr[0]=new int []{1, 0, 0, 0};
        arr[1]=new int []{1, 1, 1, 1};
        arr[2]=new int []{1, 1, 0, 0};
        arr[3]=new int []{0, 1, 1, 1};
        int [][] sol= new int[4][4];
        ArrayList<String> ans=new ArrayList<>();

        four(arr, sol, 0, 0, ans, new StringBuilder());
        if (ans.size()==0) { System.out.println(-1);}
        for (String string : ans) {
            System.out.println(string);
        }
    }
    /*
     * 
     * 0 1 1 1 
     * 1 1 1 0 
     * 1 0 1 1 
     * 0 0 1 1
     */
    
}
