import java.util.*;
public class Lecture14$CycleInDirectedUsingKahn{
    public static int[] Kahn(ArrayList<ArrayList<Integer>> adj, int[] indeg){
        Queue<Integer> q= new LinkedList<Integer>();
        int[] Topo= new int[indeg.length];
        for (int i =0; i< indeg.length; i++) {
            if(indeg[i]==0){
                q.add(i);
            }
        }
        int j=0;
        while(q.size()!=0){
            Topo[j]=q.poll();
            for (int i : adj.get(Topo[j])) {
                indeg[i]--;
                if (indeg[i]==0){
                    q.add(i);
                }
            }
            j++;
            // where J is nothing but the length of 
            // array topo which is storing the order.
        }
        if (j==indeg.length){
            System.out.println("Order Possible, Thus No Cycle");
        }
        else{
            System.out.println("Order Not Possible, Thus Graph has Cycle");
        }
        return Topo;
    }
    public static void main(String[] args) {
        dGraph g= new dGraph();

        int[] indeg=Lecture13$TopoKahns.indegreeOp(g.adj);
        // int[] topo=Lecture13$TopoKahns.Kahn(g.adj, indeg);
        // System.out.println("\n Topological Order looks like this \n");
        System.out.println(Arrays.toString(Kahn(g.adj,indeg)));
        
        
        
    }
}

// did not use the class va in this question as for Topological sorting function visited array is not needed, va is needed in the start 
// in-order to calculate the initial indegree matrix. but indegOp uses the graph itself to calculate that which eventually solves 
// that need.