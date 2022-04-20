import java.util.*;

public class Lecture18$MinimumSpanningTree {

    public static void path(ArrayList<ArrayList<pairr>> adj, int src, String[] path, int[] cost){}
    public static void path(ArrayList<ArrayList<pairr>> adj, int src, int[] edgeWith, int[] cost){

        // edgeWith can store the index-wise vertex v for each edge that has been continued in the MST, 
        // can later find the cost associated with that edge.
    }
    public static int path(ArrayList<ArrayList<pairr>> adj, int src, int[] edgeCost, int[] cost, int sum){
        // this was a great attempt but I made the error of considering the whole cost till the node, except the point was just to take that specific cost, even if its not the cheapest to reach from src.
        // return the complete sum of the weights of the final edges that are continued in MST.
        // uses edgeCost array to store the edges that are continued/considered.
        PriorityQueue<pairr> pq = new PriorityQueue<pairr>(cost.length, new pairr());
        pq.add(new pairr(src, 0));
        //first parameter v has the node itself, and the second w has the total cost to reach v;
        cost[src]=0;
        while (pq.size()!=0){
            pairr node=pq.poll();
            for (pairr aP : adj.get(node.v)) {
                int newcost=node.w+aP.w;
                if (newcost<cost[aP.v]){
                    cost[aP.v]=newcost;
                    edgeCost[aP.v]=aP.w;
                    pq.add(new pairr(aP.v, newcost));
                }
                
            }
        }
        for (int i = 0; i < cost.length; i++) {
            sum+=edgeCost[i];
        }
        System.out.println(Arrays.toString(edgeCost));
        return sum;   
    }

    public static int pathCorrected(ArrayList<ArrayList<pairr>> adj, int src, int[] va, int[] cost, int sum){
        
        // Opmitizing the error in the above attempt.
        // no need for edgecost and cost both, as they are the same, now utilizing va to save the child updating its parent with
        //  the same edge it came from.

        PriorityQueue<pairr> pq = new PriorityQueue<pairr>(cost.length, new pairr());
        pq.add(new pairr(src, 0));
        cost[src]=0;
        va[src]=-2;
        while (pq.size()!=0){
            pairr node=pq.poll();
            for (pairr aP : adj.get(node.v)) {
                //int newcost=node.w+aP.w;  // newcost as the sum of path is not to be used as discussed. 
                if (aP.w<cost[aP.v] && va[node.v]!=aP.v){
                    cost[aP.v]=aP.w;
                    va[aP.v]=node.v;
                    pq.add(new pairr(aP.v, aP.w));
                }
                
            }
        }
        for (int i = 0; i < cost.length; i++) {
            sum+=cost[i];
        }
        System.out.println(Arrays.toString(cost));
        return sum;   

        // this didn't work either
        // failed in a big test case, so I couldn't really figure out the mistake

    }

    public static int pathStriver(ArrayList<ArrayList<pairr>> adj, int n){
        int key[]= new int [n];
        int parent[]= new int[n];
        boolean[] mstSet= new boolean[n];
        for( int i=0;i<n;i++){
            key[i]=Integer.MAX_VALUE;
            mstSet[i]=false;
            parent[i]=-1;

        }
        PriorityQueue<pairr> pq= new PriorityQueue<pairr>(n, new pairr());
        key[0]=0;
        pq.add(new pairr(0, key[0]));

        for (int i = 0; i < n-1; i++) {
            int u= pq.poll().v;
            mstSet[u]=true;
            for (pairr p : adj.get(u)) {
                if(mstSet[p.v]==false && key[p.v]>p.w){
                    key[p.v]=p.w;
                    parent[p.v]=u;
                    pq.add(new pairr(p.v, key[p.v]));
                }
                
            }
        }
        System.out.println(Arrays.toString(key));
        int sum = 0;
        for (int value : key) {
            sum += value;
        }
        return sum;

    }
    
    public static int pathPepcoding(ArrayList<ArrayList<pairr>> adj, int n){
        return -1;
        // will implement this in nxt revision iteration
    }
    
    public static void main(String[] args) {
        // UnDirected Weighted Graph
        Weighted_UnDGraph G= new Weighted_UnDGraph();
        int[] cost=new int[G.n];
        int[] edgeCost=new int[G.n];
        for (int i = 0; i < cost.length; i++) {
            cost[i]=Integer.MAX_VALUE;
            edgeCost[i]=-1;
        }
        // System.out.println(pathCorrected(G.adj, 0, edgeCost, cost, 0));
        // System.out.println(path(G.adj, 0, edgeCost, cost, 0));

        System.out.println(pathStriver(G.adj, G.n));
    }
}
// input
// 6 9
// 0 1 2 0 3 1 0 4 4 1 3 3 1 2 3 1 5 7 5 2 8 2 3 5 4 3 9


// outline: path function I used the total weight thing 
// path corrected I used the other, even utilied the parent thing there, 
// even then the function failed, now making new function 26/3