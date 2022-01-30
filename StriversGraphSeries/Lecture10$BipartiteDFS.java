import java.util.*;

public class Lecture10$BipartiteDFS {
    public static boolean bipartitedfs(ArrayList<ArrayList<Integer>> adj, int[] va, int index){
        Stack<Integer> s= new Stack<>();
        s.push(index);
        va[index]=1;
        while (s.size()!=0){
            int node= s.pop();
            int cc= va[node];
            int oc= (cc==1)?2:1;
            for (Integer integer : adj.get(node)) {
                if (va[integer]==0){
                    // not visited
                    s.push(integer);
                    // not colored
                    va[integer]=oc;
                }
                else if (va[integer]==cc){
                    // adjacent is colored  with the smae color
                    return false;
                }
                
            }
        }
        return true;


    }
    public static void main(String[] args) {
        Graph g = new Graph();
        int[] va=  new int[g.n+1];
        // va can be integer as well, will use 1 and 2 for colors; 0 for not coloured
        for (int i = 1; i <= g.n; i++) {
            if (va[i]==0){
                if(bipartitedfs(g.adjacencyList, va, i)){
                    System.out.println("Bipartite checked using DFS-> TRUE");
                    
                }
                else{
                    System.out.println("Bipartite checked using DFS-> FALSE");
                    break;
                }
            }
            
        }
    }
    
}
