package Phase_Two.Recursion;
import java.util.*;
public class _10_Maze {

    public static boolean check(int cr, int cc, char direction, int[][] arr){
        if(direction=='d' && cr+1<arr.length && arr[cr+1][cc]==1){
            return true;
        }
        else if(direction=='l' && cc+1<arr[0].length && arr[cr][cc+1]==1){
            return true;
        }
        return false;
    }
    public static boolean one(int[][] arr, int currow, int curcol){
        //use [currow][curcol] to determine the next move
        
        // base case
        if((currow==arr.length-1) && (curcol==arr[0].length-1)){
            //reached the final state
            return true;
        }
        // System.out.println("HERE");
        // System.out.println(currow+" "+curcol);

        //check if rat can move down
        if(check(currow, curcol, 'd', arr)){
            if(one(arr, currow+1, curcol)) {return true;};
        }
        if(check(currow, curcol, 'l', arr)){
            if(one(arr, currow, curcol+1)) return true;
        }
        return false;

    }
    public static boolean two(int[][] arr, StringBuilder path, int cr, int cc, int n, int m){
        if(cr==n-1 && cc==m-1) return true;
        System.out.println(path+" - ");
        //down
        if(check(cr, cc, 'd', arr)){
            path.append('D');
            if(two(arr, path, cr+1, cc, n, m)) return true;
            path.setLength(path.length()-1);
        }
        //left
        if(check(cr, cc, 'l', arr)){
            path.append('L');
            if(two(arr,path, cr, cc+1, n, m)) return true;
            path.setLength(path.length()-1);
        }
        return false;
    }
    public static void three(int[][] arr, StringBuilder path, int cr, int cc, int n, int m, ArrayList<String> ans){
        if(cr==n-1 && cc==m-1) {
            ans.add(new String(path));
            return ;
        }
        // System.out.println(path+" - ");
        //down
        if(check(cr, cc, 'd', arr)){
            path.append('D');
            three(arr, path, cr+1, cc, n, m, ans); 
            path.setLength(path.length()-1);
        }
        //left
        if(check(cr, cc, 'l', arr)){
            path.append('L');
            three(arr,path, cr, cc+1, n, m, ans);
            path.setLength(path.length()-1);
        }
        return;
    }
    



    public static void main(String[] args) {
        //Rate in a maze problem
        //Lecture 10 Love Babber DSA Series

        /*
         * Intro level problem
         * Moves: Down, Left only
         * Initial : (0, 0)
         * 1 0 0 0
         * 1 1 0 1
         * 1 1 0 0
         * 0 1 1 1
         * 
         * return whether maze can be solved or not.
         * 
         */
        int[][] arr=new int [4][4];
        arr[0]=new int []{1, 1, 1, 0};
        arr[1]=new int []{1, 1, 1, 1};
        arr[2]=new int []{1, 1, 0, 1};
        arr[3]=new int []{1, 1, 0, 1};
        // System.out.println(one(arr, 0, 0));

        /*
         * Now let's increase the level of the problem, 
         * return (one) path of the solution if it exists.
         * 
         * Input:
         *{1, 1, 0, 0};
         *{1, 1, 1, 1};
         *{1, 1, 0, 1};
         *{1, 1, 0, 1};
         * 
         * output: D L L L D D
         */
        // StringBuilder path=new StringBuilder();
        // if(two(arr, path, 0, 0, arr.length, arr[0].length)){
        //     System.out.println(path);
        // }
        // else{
        //     System.out.println("No paths found");
        // }

        /* Question 3
         * now we need all the paths possible in a arraylist<string>
         * 
         */
        ArrayList<String> ans=new ArrayList<>();
        three(arr, new StringBuilder(), 0, 0, arr.length, arr[0].length, ans);
        for (String string : ans) {
            System.out.println(string);
        }

        /* Question 4
         * Now we add two more directions, and thus maintain a solarr.
         */
        




    }
}
