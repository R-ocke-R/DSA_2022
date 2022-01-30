import java.util.*;
public class Q1_gfg_DetectCycleUDG {

    // 24th January 2022


    // class solution is the working solution of 
    // Detect cycle in an undirected Graph gfg
    // https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1#
    public static void main(String[] args) {
        
    }
}
class Solution{
    static boolean bool=false;
    public void dfsRecursiveCycleInComponent(int last, int index, int[] va, ArrayList<ArrayList<Integer>> adj){
        va[index]=1;
        for (Integer nod : adj.get(index)) {
            if(va[nod]==1 && nod!=last){
                bool=true;
            }
            if(va[nod]==0){
                dfsRecursiveCycleInComponent(index, nod, va, adj);
            }
        }
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        int[] visitedArray= new int[V];
        
        for(int i=0; i<V;i++){
            if (visitedArray[i]==0){
            dfsRecursiveCycleInComponent(-1, i, visitedArray, adj);
            if (bool){
                bool=false;
                return true;
            }
            }
        }
        return false;
    }
}