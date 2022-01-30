import java.util.*;

class dGraph{
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    int n;
    int m;
    dGraph(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number of nodes in n and number of edges in m");
            n= sc.nextInt();
            m=sc.nextInt();
            System.out.println("Now Enter m lines");
            int u, v;
            for (int i = 0; i < n+1; i++) {
                adj.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < m; i++) {
                u=sc.nextInt();
                v=sc.nextInt();
                adj.get(u).add(v);
            }
            System.out.println("--Directed Graph Created--");
            System.out.println(adj);

        }
    }
}


public class Lecture11$DirectedGraphCycle {

    // public static void componentDivisionDirected(ArrayList<ArrayList<Integer>> adj, )

    public static boolean cycleInDirectedGraph(ArrayList<ArrayList<Integer>> adj, int index, int[] va, int[] backtracking){
        // using DFS coz given; i think can be done via Queue also
        // Stack<Integer> s= new Stack<>();
        // s.add(index);
        va[index]=1;
        backtracking[index]=1;
        System.out.print(index+" -> ");
        for (Integer integer : adj.get(index)) {
            if (va[integer]==0){
                // not visited ever before
                if (cycleInDirectedGraph(adj, integer, va, backtracking)){
                    backtracking[index]=0;
                    return true;
                }                
            }
            else if(backtracking[integer]==1){
                // Cycle found
                backtracking[index]=0;
                return true;

            }
            
        }
        backtracking[index]=0;
        return false;
    }

    public static void main(String[] args) {
        dGraph dg= new dGraph();
        int[] va= new int[dg.n+1];
        int[] backtracking= new int[dg.n+1];
        for (int j = 1; j < dg.n+1; j++) {
            if (va[j]==0){
                if (cycleInDirectedGraph(dg.adj, j, va, backtracking)){
                    System.out.println("Cycle found");
                }
                else{
                    System.out.println("No Cycle");
                }
            }
            // System.out.println(Arrays.toString(backtracking));
        }
        
        
    }
    
}


// Question3 -> Detect Cycle in directed Graph gfg 