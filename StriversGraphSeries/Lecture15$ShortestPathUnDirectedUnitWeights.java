import java.util.*;
public class Lecture15$ShortestPathUnDirectedUnitWeights {
    public static int[] pathCost(ArrayList<ArrayList<Integer>> adj, int src){
        int[] va= new int[adj.size()];
        int[] cost= new int[adj.size()];
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
                        // we can q.add(integer); so consider the chaining effect described below in comments.
                    }
                }
                
            }
            
        }
        return cost;
    }
    public static void main(String[] args) {
        Graph g= new Graph();
        int src=0;
        System.out.println(Arrays.toString(pathCost(g.adjacencyList, src)));

    }
}


//  another solution could be by merging va and cost by having a (large value) / -1 in va.
//  this algo could fail because of va as if a node is visited we change its cost but we dont add it again in 
//  queue in order to check if that change in cost start a chain of neighbouring changes.