import java.util.*;

class pairr implements Comparator<pairr>{
    int v;
    int w;
    pairr(int v, int w){
        this.v=v;
        this.w=w;
    }
    pairr() {
    }
    @Override
    public int compare(pairr o1, pairr o2) {
        if (o1.w>o2.w){
            return 1;

        }
        else if (o1.w<o2.w){
            return -1;
        }
        return 0;
    }
}
class Weighted_UnDGraph{
    ArrayList<ArrayList<pairr>> adj= new ArrayList<>();
    int n;
    Weighted_UnDGraph(){
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
                adj.get(v).add(new pairr(u, w));
            }
        }
    }
}

public class Lecture17$Dijkstra{

    public static void Dijkstra(ArrayList<ArrayList<pairr>> adj, int[] cost, int src){
        cost[src]=0;
        PriorityQueue<pairr> pq= new PriorityQueue<pairr>(cost.length, new pairr());
        pq.add(new pairr(src, 0));
        
        // pairr's v has the node, and pairr's w has the cost.
        while(pq.size()!=0){
            pairr node=pq.poll();
            for (pairr aP : adj.get(node.v)) {
                int newcost=node.w+aP.w;
                if (newcost<cost[aP.v]){
                    cost[aP.v]=newcost;
                    pq.add(new pairr(aP.v, newcost));
                }
                
            }
        }


    }
    public static void main(String[] args) {
        Weighted_UnDGraph Ug= new Weighted_UnDGraph();
        int[] cost= new int[Ug.n];
        
        for (int i = 0; i < cost.length; i++) {
            cost[i]=Integer.MAX_VALUE;
        }
        Dijkstra(Ug.adj, cost, 0);
        System.out.println(Arrays.toString(cost));

    }
}
// input example
// 5 6
// 0 1 2 1 2 4 1 4 5 2 4 1 3 2 3 0 3 1  