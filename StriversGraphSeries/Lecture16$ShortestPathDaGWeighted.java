import java.util.*;
//  for this we start with a weighted DAG
class pair{
    int v;
    int w;
    pair(int v, int w){
        this.v=v;
        this.w=w;
    }
}

class Weighted_DAG{
    ArrayList<ArrayList<pairr>> adj= new ArrayList<>();
    int n;
    Weighted_DAG(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of nodes and the number the edges");
            n= sc.nextInt();
            int m= sc.nextInt();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<pairr>());
                // adj of length equal to n, thus we have a zero based indexing.
            }
            int u, v, w;
            System.out.println("Enter the edges along with the weight of each edge");
            for (int i = 0; i < m; i++) {
                u=sc.nextInt();
                v=sc.nextInt();
                w=sc.nextInt();
                adj.get(u).add(new pairr(v, w));
                // adj.get(v).add(new pair(u, w));
            }
        }
    }
}

public class Lecture16$ShortestPathDaGWeighted{

    public static void Topoo(ArrayList<ArrayList<pairr>> adj, int index, int[] va, Stack<Integer> sortt){
        va[index]=1;
        // recusive DFS
        for (pairr p : adj.get(index)) {
            if (va[p.v]==0){
                Topoo(adj, p.v, va, sortt);
            }
        }
        sortt.push(index);
    }

    public static void ShortestOptimalPath(ArrayList<ArrayList<pairr>> adj, int src, int[] cost){
        // Going for the optimal algorithm, here I will use the Topological sort to continue updating the cost array.
        Stack<Integer> sortt=new Stack<Integer>();
        int[] va= new int[cost.length];
        for (int j = 0; j < cost.length; j++) {
            if(va[j]==0){
                
                Topoo(adj, j, va, sortt);
            }
        }
        // can quickly check whether the graph is a proper DAG, thus whether a full TOPO is possible or not.
        if (sortt.size()!=cost.length){
            System.out.println("TOPO NOT COMPLETE:: DAG NOT POSSIBLE");
            return;
        }
        cost[src]=0;

        // take elementss from topo and compare, and 
        while(sortt.size()!=0){
            int node=sortt.pop();
            for (pairr p : adj.get(node)) {
                // System.out.println(p.v+" - ");
                if(cost[p.v]>cost[node]+p.w){
                    cost[p.v]=cost[node]+p.w;
                }                
            }
        }


    }

    public static void ShortestPathWDAG(ArrayList<ArrayList<pairr>> adj, int src, int[] cost){
        // cost[src];
        cost[src]=0;
        Queue<Integer> q= new LinkedList<Integer>();
        q.add(src);
        while(q.size()!=0){
            int node=q.poll();
            if (cost[node]!=Integer.MAX_VALUE){
                // this is important to consider, in the case when we come to a node (from topo) whcih has not been vistited yet (it has no incoming edge to be honest...)
            for (pairr p : adj.get(node)) {
                if(cost[p.v]>cost[node]+p.w){
                    cost[p.v]=cost[node]+p.w;
                    q.add(p.v);
                }                
            }
        }
        }
    }

    public static void printy(ArrayList<ArrayList<pairr>> adj){
        for (ArrayList<pairr>  a : adj) {
            for (pairr p : a) {
                System.out.println(p.v+"  " +p.w);
            }
            System.out.println("----");
        }
    }
    
    public static void main(String[] args) {
        Weighted_DAG wG= new Weighted_DAG();
        printy(wG.adj);
        int cost[]= new int[wG.n];
        for (int i = 0; i < cost.length; i++) {
            cost[i]=Integer.MAX_VALUE;
        }
        System.out.println(Arrays.toString(cost));
        ShortestOptimalPath(wG.adj, 0, cost);
        // ShortestPathWDAG(wG.adj, 0, cost);
        System.out.println(Arrays.toString(cost));
    }
}

// input example:
// 6 7
// 0 1 2 0 4 1 1 2 3 2 3 6 4 2 2 4 5 4 5 3 1 