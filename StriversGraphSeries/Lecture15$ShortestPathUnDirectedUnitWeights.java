import java.util.*;
class HeroGraph{
    // looks like a normal unDirected Graph.
    ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
    int n;
    HeroGraph(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter n, m then enter M edges");
            n= sc.nextInt();
            int m= sc.nextInt();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<Integer>());                
            }
            int u, v;
            for (int i = 0; i < m; i++) {
                u= sc.nextInt(); v= sc.nextInt();
                adj.get(u).add(v); adj.get(v).add(u);
            }
            System.out.println(adj);
        }
    }

}

// shortest path in terms of edges (like 1 edge reach, 2 edge reach etc.) 
// Queue will provide that, because of its parallel working, whenever a node is reached for the
// first time, it is thier with the minimum paths possible.

public class Lecture15$ShortestPathUnDirectedUnitWeights {
    public static int[] pathCost(ArrayList<ArrayList<Integer>> adj, int src, int[] cost, int[] va){
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        cost[src]=0;
        va[src]=1;
        while (q.size()!=0){
            int node= q.poll();
            for (Integer integer : adj.get(node)) {
                if(va[integer]==0){
                    va[integer]=1;
                    cost[integer]=cost[node]+1;
                    q.add(integer);
                }
                else{
                    if (cost[integer]>cost[node]+1){
                        cost[integer]=cost[node]+1;
                        q.add(integer);
                        // we can q.add(integer); so consider the chaining effect described below in comments.
                    }
                }
                
            }
            
        }
        return cost;
    }

    public static int[] pathCostOptimal(ArrayList<ArrayList<Integer>> adj, int src, int[] cost){
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        for (int i = 0; i < cost.length; i++) {
            cost[i]=Integer.MAX_VALUE;
        }
        // note the cost for all element has to be the maximum for this algo to work
        cost[src]=0;
        while (q.size()!=0){
            int node= q.poll();
            for (Integer integer : adj.get(node)) {
                if(cost[integer]>cost[node]+1){
                    q.add(integer);
                    cost[integer]=Math.min(cost[integer], cost[node]+1);
                        // we can q.add(integer); so consider the chaining effect described below in comments.
                }
            }
        }
        return cost;    
    }  
    public static void main(String[] args) {
        // Graph g= new Graph();
        HeroGraph h= new HeroGraph();
        System.out.println(h.adj);
        int src=0;
        int va[]= new int[h.n];
        int cost[]= new int[h.n];
        pathCost(h.adj, src, cost, va);
        System.out.println(Arrays.toString(cost));
        

        System.out.println("-----");
        System.out.println("calling the optimal function");
        pathCostOptimal(h.adj, src, cost);
        System.out.println(Arrays.toString(cost));
        // System.out.println(Arrays.toString(pathCost(g.adjacencyList, src)));

    }
}


//  another solution could be by merging va and cost by having a (large value) / -1 in va.
//  this algo could fail because of va as if a node is visited we change its cost but we dont add it again in 
//  queue in order to check if that change in cost start a chain of neighbouring changes.